package TugasJ12;
import java.util.Scanner;
public class NilaiMahasiswa14{
    static void isianArray ( int... nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
         System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + " = ");
        nilai[i] = sc.nextInt();
        }
        sc.close();
    }
    static void tampilkanArray(int... nilai) {
    System.out.println("\ndaftar nilai mahasiswa =");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("mahasiswa " + (i + 1) + " = " + nilai[i]);
        }
    }
    static int totallz(int... nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }
public static void main(String[] args) {
    Scanner mok = new Scanner(System.in);
            System.out.print("masukkan jumlah mahasiswa = ");
        int jmlMhs = mok.nextInt();

        int[] nilai = new int[jmlMhs];

        isianArray(nilai);
        tampilkanArray(nilai);
        
        int totalNilai = totallz(nilai);
        System.out.println("\ntotal nilai mahasiswa = " + totalNilai);
        mok.close();
    }
}
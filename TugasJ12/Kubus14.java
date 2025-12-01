package TugasJ12;
import java.util.Scanner;
public class Kubus14 {
    static int hitungLuas(int sisi) {
        int Luas = 6 * sisi * sisi;
        return Luas;
    }
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner kubus = new Scanner(System.in);
        int s, L, vol;

        System.out.print("Masukkan panjang sisi kubus: ");
        s = kubus.nextInt();

        L = hitungLuas (s);
        System.out.println("Luas permukaan kubus adalah: " + L);
        vol = hitungVolume (s);
        System.out.println("Volume kubus adalah: " + vol);
        
        kubus.close();
    }
    
}

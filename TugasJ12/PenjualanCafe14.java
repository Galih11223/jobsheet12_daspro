package TugasJ12;

import java.util.Scanner;

public class PenjualanCafe14 {
    public static void inputData(int[][] data, String[] menu, Scanner scanner) {
        System.out.println("=== Input Data Penjualan ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilData(int[][] data, String[] menu) {
        System.out.println("\n=== Data Penjualan Selama 7 Hari ===");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + (menu[i].length() < 8 ? "\t\t" : "\t"));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] data, String[] menu) {
        int maxPenjualan = 0;
        int indexMenuTertinggi = 0;

        for (int i = 0; i < data.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPerMenu += data[i][j];
            }
            
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexMenuTertinggi = i;
            }
        }

        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + menu[indexMenuTertinggi]);
        System.out.println("Total Penjualan: " + maxPenjualan);
    }

    public static void rataRataPenjualan(int[][] data, String[] menu) {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < data.length; i++) {
            double total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rataRata = total / 7;
            System.out.printf("%s: %.2f\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] dataPenjualan = new int[5][7];

        inputData(dataPenjualan, menu, scanner);
        tampilData(dataPenjualan, menu);
        menuTertinggi(dataPenjualan, menu);
        rataRataPenjualan(dataPenjualan, menu);

        scanner.close();
    }
}

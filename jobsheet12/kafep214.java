public class kafep214 {
    public static void menu(String namaPelanggan, boolean isMember) {

        System.out.println("Selamat Datang," + " " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda mendapatkan diskon 10% sebagai member kafe kami.");
        }

        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam- Rp 15.000");
        System.out.println("2. Cappucino- Rp 20.000");
        System.out.println("3. Latte- Rp 22.000");
        System.out.println("4. TehTarik- Rp 12.000");
        System.out.println("5. Roti Bakar- Rp 10.000");
        System.out.println("6. Mie Goreng- Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan:");
    }
    public static void main(String[] args) {
        menu("Andi", true);
    }
}
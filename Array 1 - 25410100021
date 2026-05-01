import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kategori[] = new String[10];
        int harga []= new int[10];
        int[] jumlah = new int[10];

        int n = 0;
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Hitung Total Bayar");
            System.out.println("4. Keluar");

            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
            case 1:
            System.out.print("Masukkan jumlah kategori: ");
            n = input.nextInt();
            input.nextLine();

            for (int i = 0; i < n; i++) {
            System.out.print("Kategori ke-" + (i + 1) + ": ");
            kategori[i] = input.nextLine();

            System.out.print("Harga: ");
            harga[i] = input.nextInt();
            input.nextLine();
            }
            break;

        case 2:
        for (int i = 0; i < n; i++) {
        System.out.print("Jumlah beli untuk " + kategori[i] + ": ");
        jumlah[i] = input.nextInt();
        }
            break;

        case 3:
        int total = 0;
        for (int i = 0; i < n; i++) {
        total += harga[i] * jumlah[i];
        }
        System.out.println("Total bayar: " + total);
            break;

         case 4:
        System.out.println("Keluar program...");
            break;

        default:
        System.out.println("Pilihan tidak valid!");
        }

    } while (pilih != 4);

        input.close();
    }
}

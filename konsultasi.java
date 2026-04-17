import java.util.Scanner;

public class konsultasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        String jawab = "y";

        while (jawab.equalsIgnoreCase("y") && jumlah < 7) {
            jumlah++;

            System.out.println("Mahasiswa ke-" + jumlah + " dilayani");

            if (jumlah == 7) {
                System.out.println("Kuota sudah penuh (7 mahasiswa)");
                break;
            }

            System.out.print("Masih ada mahasiswa? (y/n): ");
            jawab = input.next();
        }

        System.out.println("Sesi selesai");
        System.out.println("Total mahasiswa: " + jumlah);
    }
}


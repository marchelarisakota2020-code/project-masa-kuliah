import java.util.Scanner;

public class utsbilaw {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlah;

        
        do {
            System.out.print("Masukkan jumlah data (minimal 5): ");
            jumlah = input.nextInt();

            if (jumlah < 5) {
                System.out.println("Jumlah data harus minimal 5!");
            }

        } while (jumlah < 5);

        int[] data = new int[jumlah];
        
        System.out.println("\n=== Input Data ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nomor urut data ke-" + (i + 1));
            System.out.print("Masukkan nilai : ");
            data[i] = input.nextInt();
        }
        int tertinggi = data[0];
        int indeks = 0;
        int urutan = 1;

       
        for (int i = 1; i < jumlah; i++) {
            if (data[i] > tertinggi) {
                tertinggi = data[i];
                indeks = i;
                urutan = i + 1;
            }
        }

        
        System.out.println("\n=== Data yang Dimasukkan ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1) + " = " + data[i]);
        }

       
        System.out.println("\n=== Hasil ===");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nomor urut data : " + urutan);
        System.out.println("Indeks array    : " + indeks);

        input.close();
    }
}


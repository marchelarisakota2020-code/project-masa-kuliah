import java.util.Scanner;

public class jawabanuts {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         /*
        buatkan sebuah program untuk mencari nilai tertinggi dari sekumpulan data.user 
        perlu memasukkan terlebih dahulu jumlah data yang diinginkan (minimal 5 data),kemudian nomor 
        urutan dan nilai pada setiap datanya diisi dan disimpan dalam array 1 dimensi.program harus membandingkan 
        setiap nilai yang dimasukkan untuk
        mendaptkan nilai tertinggi.tampilkan nilai tertinggi beserta posisi indeks arraynya
        */
        int n;
        do {
            System.out.print("Masukkan jumlah data (minimal 5): ");
            n = input.nextInt();
            if (n < 5) {
                System.out.println("Jumlah data harus minimal 5!");
            }
        } while (n < 5);

        int[] nilai = new int[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int max = nilai[0];
        int indeks = 0;

     
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) { 
                max = nilai[i];
                indeks = i;
            }
        }

        System.out.println("\nNilai tertinggi adalah: " + max);
        System.out.println("indeks array ke: " + indeks);

        input.close();
}
        
}
 


    
    




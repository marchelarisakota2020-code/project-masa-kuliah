import java.util.Scanner;
public class latihan2 {
    public static void main (String [] args) {
        //Deklarasi variabel 
        Scanner scanner = new Scanner (System.in);
       
        // INPUT NAMA PELANGGAN,NOMOR MEJA,TOTAL,JENIS PESANAN,
        String namaPelanggan ="";
        String nomorMeja ="", namaPesanan="";
        int pilih=0; 
        int JumlahPesan =0, jumlahPesanan =0, harga =0; 
        int total =0;
        String jenisPesanan ="";
        String level="";

        System.out.println("Masukkan nama pelanggan :");
        namaPelanggan = scanner.nextLine();
        System.out.println("Jenis pesanan : \n 1. Dine In \n2. Take Away" );
        jenisPesanan = scanner.nextLine();
        // input nama pesanan

        System.out.println("MENU MIE WACOAN ");
        System.out.println("1. Mie gacoan ");
        System.out.println("2. Mie hompimpa ");
        System.out.println("3. Mie suit ");
        System.out.println("4. Dimsum ");
        System.out.println("5. Aneka Minuman ");
        System.out.print("Pilih menu :");
        pilih = scanner.nextInt();
        scanner.nextLine();
        // cek kondisi dengan integer
        if (pilih == 1|| pilih == 2 ) {
            System.out.println("Pilih level (1-8): ");
            level = scanner.nextLine(); 
            harga = 13000;
            System.out.println("Jumlah Pesan :");
            jumlahPesanan = scanner.nextInt();
        } else {
            System.out.println("Nama Pesanan :");
            namaPesanan = scanner.nextLine();

        }
        
        // cek string ---> equals / equalsIgnoreCase
        // equals = case sensitive (Memperhatikan besae/kecil huruf)
        //equalsIgnoreCase = cose non sensitive (Kembalikan equals)
        if (jenisPesanan.equals("dine-in")) {
        System.out.println("nomorMeja :");
        nomorMeja = scanner.nextLine();
        // hitunf total
        total= harga * jumlahPesanan;
        System.out.println("total : + total");
        } else {
        System.out.println("----Take Away----");
        total = (harga * jumlahPesanan) + 2000;
        System.out.println("Total : + total");
        //pesanan
        }
        //OUTPUT
        

        scanner.close();



    }
}

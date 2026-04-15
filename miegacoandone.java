import java.util.Scanner ;
public class miegacoandone {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        // Deklarasi variabel
        String namaPelanggan="";
        String namaPembayaran ="";
        int pilihanMenumakan;
        int pilihanMenuminum;
        int qtyMakanan;
        int qtyMinuman;
        double totalHarga;
        String namaMakanan ="";
        String namaMinuman ="";
        double hargaMinuman;
        double hargaMakanan;
        double uangBayar;
        int metode;
        int pilihBayar;
        String metodePembayaran ="";

    
        // PROSES MENENTUKAN MENU MAKANAN DAN HARGA
        System.out.println("Masukkan nama pelangan :");
        namaPelanggan = scanner.nextLine();

        System.out.println("KASIR MIE GACOAN ===");
        System.out.println("DAFTAR MENU MAKANAN");
        System.out.println("1. Mie Wacoan LV 0 = Rp.10.000");
        System.out.println("2. Mie Wacoan LV 1 = Rp.12.000");
        System.out.println("3. Mie Wacoan LV 2 = Rp.13.000");
        System.out.println("4. Mie Wacoan LV 5 = Rp.15.000");
        System.out.println("PILIH MENU MAKANAN: ");
        pilihanMenumakan =scanner.nextInt ();

        System.out.print("Masukkan qty makanan: ");
        qtyMakanan = scanner.nextInt();

        // PROSES MENENUKAN MENU MAKANAN DAN HARGA
        if(pilihanMenumakan == 1) {
            namaMakanan ="Mie Wacoan LV 0";
            hargaMakanan =10000;
        } else if(pilihanMenumakan == 2) {
            namaMakanan ="Mie Wacoan LV 1";
            hargaMakanan =12000; 
        } else if(pilihanMenumakan == 3) {
            namaMakanan ="Mie Wacoan LV 2";
            hargaMakanan=13000; 
        } else if(pilihanMenumakan == 4) {
            namaMakanan ="Mie Wacoan LV 3";
            hargaMakanan=15000;
        } else {
            System.out.println("Menu tidak tersedia");
            return;   
        }

        System.out.println("DAFTAR MENU MINUMAN");
        System.out.println("1. Es teh = Rp.5.000");
        System.out.println("2. Thai tea = Rp7.000");
        System.out.println("PILIH MENU MINUMAN: ");
        pilihanMenuminum =scanner.nextInt ();
        System.out.print("Masukkan qty minuman: ");
        qtyMinuman = scanner.nextInt();

        if (pilihanMenuminum == 1) {
            namaMinuman = "Es teh";
            hargaMinuman = 5000;
        } else if (pilihanMenuminum == 2){
            namaMinuman = "Thai tea";
            hargaMinuman = 7000;
        } else {
            System.out.println("Menu tidak tersedia");
            return;
        }

        // PROSES PERHITUNGAN DAN PEMBAYARAN
        totalHarga = (hargaMakanan * qtyMakanan) + (hargaMinuman * qtyMinuman);
        
        System.out.println("Total yang harus dibayar: Rp" + totalHarga);

        System.out.println("\n Metode Pembayaran :");
        System.out.println("1. Tunai \n2. QRIS\n3. Debit");
        System.out.println("Pilih metode pembayaran :");

        metode= scanner.nextInt();
        if (metodePembayaran == "1") {
        namaPembayaran = "Tunai"; 
        System.out.print("Masukkan uang bayar: ");
        uangBayar = scanner.nextDouble();
    
        // PROSES METODE PEMBAYARAN
        if (uangBayar < totalHarga) {
        System.out.println("Maaf uang tidak cukup!");
        }
        } else if (metodePembayaran == "2")   {
            namaPembayaran= "QRIS";
            uangBayar = totalHarga;
        }else if (metodePembayaran== "3")   {
            namaPembayaran= "Debit";
            uangBayar = totalHarga;
            
        }

        //OUTPUT 
        System.out.println("==================================");
        System.out.println("          STRUK PEMBELIAN       ");
        System.out.println("             MIE GACOAN      ");
        System.out.println("==================================");
        System.out.println("Nama Pelanggan    : " + namaPelanggan);
        System.out.println("Menu Makanan      : " + namaMakanan + " x "+ qtyMakanan);
        System.out.println("Qty Makanan       : " + qtyMakanan);
        System.out.println("Menu minuman      : " + namaMinuman + " x " + qtyMinuman);
        System.out.println("Qty Minuman       : " + qtyMinuman);
        System.out.println("==================================");
        System.out.println("Harga makanan     : " + hargaMakanan);
        System.out.println("Harga minuman     : " + hargaMinuman);
        System.out.println("Total Harga       : Rp" + totalHarga);
        System.out.println("Metode Pembayaran : " + metodePembayaran);
        System.out.println("==================================");
        System.out.println(" Terima Kasih Atas Kunjungan Anda ");
    

        scanner.close();
    }


}
    

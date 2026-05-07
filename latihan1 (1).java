// blok class
public class latihan1 {
  // blok main >> shortcut: psvm + tab
public static void main(String[] args) {
    //tempat koding

    /* jacob ingin belanja beberapa kebutuhan bahan pokok di Alfamart. Sebagai kasir,ada beberapa
    data yang harus dimasukkan ke dalam program.
    data-data tersebut adalah:
    Nama barang >> String
    Jumlah barang >> int
    Harga >> int
    Total >> int
    PPN >> double >> casting/konversi tipe data
    Tanggal >> String
    Kembalian >> int
    */
    
    //deklarasi variabel + inisiasi value
    String namaBarang  = "sukro";
    int jumlahBeli = 2;
    int harga = 3000;
    int total = harga * jumlahBeli;

    // print/cetak >> shortcut : sout + tab
    // print variabel tanpa teks tambahan
    System.out.println();
    // print variabel dengan teks tambahan
    System.out.println("Nama barang :"+ namaBarang + "Jumlah Beli:" + jumlahBeli);

    //print dengan karakter escape \n >> new line 
    System.out.println(namaBarang + "\n" + total);



    }

}

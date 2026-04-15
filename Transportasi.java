import java.util.Scanner;
public class Transportasi {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int penumpang;
    int bus, miniBus, mobil;
    int vbus;
    int vminiBus;
    int vmobil;
    int sisa;

    System.out.println("Masukkan jumlah penumpang : ");
    penumpang = sc.nextInt();

    //Proses perhitungan pecahan
        bus =penumpang/ 50;
        vbus = penumpang % 50;

        miniBus= vbus/ 15;
        vminiBus = vbus % 15;

        mobil =vminiBus / 7;
        vmobil = vminiBus % 7;

        sisa = vmobil;

       if (sisa !=0);
       {
        mobil = mobil + 1;
       }
    System.out.println("bus =" + bus);
    System.out.println("miniBus =" + miniBus);
    System.out.println("mobil=" + mobil);

  
    }
    
}

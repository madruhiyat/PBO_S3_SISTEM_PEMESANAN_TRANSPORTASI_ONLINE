
import java.util.ArrayList;


public class MainTransportasi{
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarkendaraan = new ArrayList<>();
        daftarkendaraan.add(new Mobil("B 1234 PIU","toyota kijang"));
        daftarkendaraan.add(new Motor("M 1234 ART","Honda beat"));
        daftarkendaraan.add(new Deluxe("D 1234 YTU","Deluxe"));

        int jarak = 10;
        for (Kendaraan k : daftarkendaraan) {   
            System.out.println("Tipe Kendaraan : " + k.getClass().getSimpleName());
            k.infoKendaraan();
            
            // Memanggil hitungTarif(10) secara polimorfik
            double totalTarif = k.hitungtarif(jarak);
            System.out.println("Tarif (" + jarak + " km) : Rp " + totalTarif);
            System.out.println("-------------------------------------------");
        }
    }
}
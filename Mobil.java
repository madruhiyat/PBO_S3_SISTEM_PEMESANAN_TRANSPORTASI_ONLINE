public class Mobil extends Kendaraan{
    public Mobil(String platnomor, String merk){
        super(platnomor, merk);
    }

    @Override
    public double hitungtarif(int jarak){
        return jarak*5000;
    }
}
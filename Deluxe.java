public class Deluxe extends Mobil{
    public Deluxe(String platnomor, String merk){
        super(platnomor, merk);
    }

    @Override
    public double hitungtarif(int jarak){
        return jarak*10000;
    }
}
public class Motor extends Kendaraan{
    public Motor(String platnomor, String merk){
        super(platnomor, merk);
    }

    @Override
    public double hitungtarif(int jarak){
        return jarak*2000;
    }
}
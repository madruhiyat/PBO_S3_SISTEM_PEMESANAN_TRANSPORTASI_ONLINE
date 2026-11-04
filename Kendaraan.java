public class Kendaraan{
    protected String platnomor; 
    protected String merk; 

    public Kendaraan(String platnomor, String merk){
        this.platnomor = platnomor;
        this.merk = merk;
    }

    public double hitungtarif(int jarak){
        return jarak*1000;
    }

    public void infoKendaraan(){
        System.err.println("Plat    : " + platnomor);
        System.err.println("merk    : " + merk);
        System.err.println("==========================");
    }
}



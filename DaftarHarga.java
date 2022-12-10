interface Daftar{
    public void Daftar();

public class DaftarHarga implements Daftar {

    @Override
    public void Daftar() {
        System.out.printf("--------Daftar Fasilitas kamar dan Harganya----------");
        System.out.printf("\n1. AC + Kamar mandi dalam\t\t Rp.1.000.000,-\t perbulan");
        System.out.printf("\n2. AC + Kamar mandi luar\t\t Rp.800.000,-\t perbulan");
        System.out.printf("\n3. Kipas + Kamar mandi dalam\t Rp.600.000,-\t perbulan");
        System.out.printf("\n4. Kipas + Kamar mandi luar\t\t Rp.500.000,-\t perbulan");
    }
}
}
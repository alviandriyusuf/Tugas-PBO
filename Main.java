import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pemilik  kos = new Pemilik();
        Scanner Pemilik = new Scanner(System.in);
        System.out.println("=====PETUGAS=====");
        System.out.println("Masukkan Nama = ");
        kos.nama = Pemilik.nextLine();
        System.out.println("Masukkan NO HP = ");
        kos.no_telp = Pemilik.nextLine();

        Daftar.DaftarHarga daf = new Daftar.DaftarHarga();
        Data pyw = new Data();
        System.out.println("-----------------------------------------------------");
        System.out.println("|             KAMAR KOST MURAH MERIAH               |");
        System.out.println("-----------------------------------------------------");
        daf.Daftar();
        pyw.Data();
        pyw.Harga();
        pyw.Output();
        System.out.println("------------------------------------------------------");
        System.out.println("                    TERIMA KASIH                     ");
    }
}
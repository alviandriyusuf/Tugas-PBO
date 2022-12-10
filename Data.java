import java.util.Scanner;
public class Data extends AwalData {
    private String nama;
    private String alamat;
    private int notelp;
    private int pil;
    private int harga;
    private int tgl;

    Scanner input = new Scanner(System.in);

    @Override
    protected void Data() {
        System.out.println("\n---------------MASUKKAN DATA ANDA---------------");
        System.out.println("\nMasukkan Nama Anda           : ");
        nama = input.nextLine();
        System.out.println("\nMasukkan Alamat Anda          : ");
        alamat = input.nextLine();
        System.out.println("\nMasukkan No Hp Anda           : ");
        notelp = input.nextInt();
        System.out.printf("\nMasukkan Tanggal Masuk Anda   : ");
        tgl = input.nextInt();
        System.out.printf("\nMasukkan Pilihan Kamar Anda   : ");
        pil = input.nextInt();

    }

    @Override
    protected void Harga() {
        switch (pil) {
            case 1:
                harga = 1000000;
                System.out.println("Pilih Jenis Kamar            : AC + Kamar mandi dalam");
                System.out.println("Harga Kamar                  : " + harga);
                System.out.println("Pembayaran Setiap Tanggal    : " + tgl);
                break;
            case 2:
                harga = 800000;
                System.out.println("Pilih Jenis Kamar            : AC + Kamar mandi luar");
                System.out.println("Harga Kamar                  : " + harga);
                System.out.println("Pembayaran Setiap Tanggal    : " + tgl);
                break;
            case 3:
                harga = 600000;
                System.out.println("Pilih Jenis Kamar            : Kipas + Kamar mandi dalam");
                System.out.println("Harga Kamar                  : " + harga);
                System.out.println("Pembayaran Setiap Tanggal    : " + tgl);
                break;
            case 4:
                harga = 500000;
                System.out.println("Fasilitas Kamar              : Kipas + Kamar mandi luar");
                System.out.println("Harga Kamar                  : " + harga);
                System.out.println("Pembayaran Setiap Tanggal    : " + tgl);
                break;
            default:
                System.out.println("Tidak Ada Dalam Pilihan!!");
        }

    }

    @Override
    protected void Output() {
        System.out.println("\n------------------Bukti Sewa Kost-----------------");
        System.out.println("Nama Penyewa                         : " +nama);
        System.out.println("Alamat Penyewa                       : " +alamat);
        System.out.println("No Hp Penyewa                        : " +notelp);
        System.out.println("Harga sewa                           : " +harga );
    }
}
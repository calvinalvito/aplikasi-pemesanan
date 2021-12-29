package Pembeli;
import java.util.Date;

public class Nama {
	//Deklarasi variabel
    protected static String nama = "Pembeli";
    protected static double bayar = 0;
    Date tgl = new Date();

    //Deklarasi getter untuk mengambil nilai kembalian dari variabel nama
    public String getNama() {
        return nama;
    }

    //Deklarasi setter untuk mengatur nama 
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Deklarasi void untuk mencetak nama pembeli dan tanggal pembelian
    public void cetak() {
        System.out.println(
                "Pembeli            : "+nama+"\nTanggal pembelian  : "+tgl
        );
    }
}

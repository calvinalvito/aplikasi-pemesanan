package Toko;
//Import class yang dibutuhkan
import Pembeli.DaftarMenu;
import java.util.*;

//class PenjualanBarang adalah subclass dari class DaftarMenu
public class PenjualanBarang extends DaftarMenu {
	//Void main untuk menjalankan program
    public static void main(String[] args)
    {   
    	//Membuat objek dari class Identifikasi dengan nama id
        Identifikasi id = new Identifikasi();
        
        //Memanggil scanner dan menyimpannya dalam variabel input
        Scanner input = new Scanner(System.in);
        
        //Deklarasi perulangan
    	while (true) {
    		//Memanggil scanner agar program dimulai setelah menekan Enter
	        input.nextLine();
    		//Membuat objek dari class DaftarMenu dengan nama dm
            DaftarMenu dm = new DaftarMenu();
            
	        System.out.print("Masukan nama Pembeli: ");
	        //Menyimpan input dalam variabel nama bertipe string
	        nama = input.nextLine();
	        //Memanggil method setNama dari class DaftarMenu dan mengisi parameternya dengan nama
	        dm.setNama(nama);
	        System.out.println("");
	        //Memanggil method menu() dari class Identifikasi
	        id.menu();
	        System.out.println(" ");
	        //Memanggil method cetak() dari class DaftarMenu
	        dm.cetak();
	        //Menampilkan total bayar
	        System.out.println("Total bayar        : "+id.kursIndonesia.format(id.total_bayar));
	        System.out.print("Dibayar            : ");
	        id.kembalian(input.nextDouble());
	        System.out.println(
	        		"                   : "+id.kursIndonesia.format(id.dibayar)+
	        		"\nTotal kembalian    : "+id.kursIndonesia.format(id.kembalian)+
	        		"\n\nTerima kasih telah berbelanja di toko kami :D\n\n\n\n\n\n\n\n\n\n");
	        //Deklarasi scanner untuk memulai program kembali setelah menekan Enter
	        input.nextLine();
	        //Memanggil method reset dari class Identifikasi
	        id.reset();
    	}
    }
}


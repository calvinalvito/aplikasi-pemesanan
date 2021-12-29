package Pembeli;

//class DaftarMenu adalah subclass dari class Nama
public class DaftarMenu extends Nama{
	//Constructor yang nantinya akan menampilkan daftar kopi
    public DaftarMenu() {
        System.out.println(
        		"                 PROGRAM PENJUALAN BUBUK KOPI                 \n\n" +
        		"------------------- GREEN BEAN COFFEE SHOP -------------------\n\n" +
                "1.Green Bean Arabika Aceh Gayo                   Rp.105.000/Kg\n" +
                "2.Green Bean Arabika lintong                     Rp.111.000/Kg\n" +
                "3.Green Bean Arabika Mandheling Ankola Sipirok   Rp.115.000/Kg\n" +
                "4.Green Bean Arabika Mandheling Lake Toba        Rp.121.000/Kg\n" +
                "5.Green Bean Arabika Bali Kintamani              Rp.113.000/Kg\n" +
                "6.Green Bean Arabika Toraja                      Rp.151.000/Kg\n" +
                "7.Green Bean Arabika Flores Bajawa               Rp.117.000/Kg\n" +
                "8.Green Bean Arabika Bengkulu                    Rp.140.000/Kg\n" +
                "9.Green Bean Arabika Malino Sulawesi             Rp.107.000/Kg\n" +
                "10.Green Bean Arabika Papua Wamena               Rp.150.000/Kg\n");
    }
}

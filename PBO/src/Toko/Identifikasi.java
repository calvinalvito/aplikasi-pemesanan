package Toko;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Identifikasi {
    //Deklarasi variabel instance
    int i = 0;
    static double total_bayar = 0;
    static double dibayar = 0;
    static double kembalian = 0;
    //Deklarasi array
    int[] kode = new int[11];
    int[] qty = new int[11];
    int[] harga = new int[11];
    double[] sub_total = new double[11];
    double[] diskon = new double[11];
    String[] barang = new String[11];

    //Deklarasi scanner
    Scanner input = new Scanner(System.in);

    //Deklarasi formatter
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();


    public int menu() {
        int jum = 100; //Deklarasi local variable
        for (i = 0; i < jum; i++) {
            System.out.print("Masukan Kode Barang Ke-" + (i + 1) + " : ");
            kode[i] = input.nextInt();
            if (kode[i] != 0) {
                System.out.print("Masukan QTY Barang Ke-" + (i + 1) + "  : ");
                qty[i] = input.nextInt();
            }else {
            	break;
            }
            //Menentukan barang berdasarkan kode yang dimasukan
            switch (kode[i]) {
                case 1:
                    barang[i] = "Green Bean Arabika Aceh Gayo                   ";
                    harga[i] = 105000;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    barang[i] = "Green Bean Arabika Lintong                     ";
                    harga[i] = 111000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    barang[i] = "Green Bean Arabika Mandheling Ankola Sipirok   ";
                    harga[i] = 115000;
                    diskon[i] = 0.09;
                    break;
                case 4:
                    barang[i] = "Green Bean Arabika Mandheling Lake Toba        ";
                    harga[i] = 121000;
                    diskon[i] = 0.2;
                    break;
                case 5:
                    barang[i] = "Green Bean Arabika Bali Kintamani              ";
                    harga[i] = 113000;
                    diskon[i] = 0.1;
                    break;
                case 6:
                    barang[i] = "Green Bean Arabika Toraja                      ";
                    harga[i] = 151000;
                    diskon[i] = 0.1;
                    break;
                case 7:
                    barang[i] = "Green Bean Arabika Flores Bajawa               ";
                    harga[i] = 117000;
                    diskon[i] = 0.1;
                    break;
                case 8:
                    barang[i] = "Green Bean Arabika Bengkulu                    ";
                    harga[i] = 140000;
                    diskon[i] = 0.1;
                    break;
                case 9:
                    barang[i] = "Green Bean Arabika Malino Sulawesi             ";
                    harga[i] = 107000;
                    diskon[i] = 0.1;
                    break;
                case 10:
                    barang[i] = "Green Bean Arabika Papua Wamena                ";
                    harga[i] = 150000;
                    diskon[i] = 0.1;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia  ");
            }
            //Memanggil method hitung()
            this.hitung();
        }
        return i;
    }

    //Deklarasi void hitung()
    void hitung() {
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        sub_total[i] = ((qty[i] * harga[i]) - (qty[i] * harga[i] * diskon[i]));
        total_bayar += sub_total[i];
        System.out.println("No             Nama Barang                               Harga       QTY   Diskon       Sub Total");
        System.out.println(i + 1 + "    " + barang[i] + kursIndonesia.format(harga[i]) + "    " + qty[i] + "     " + (int) (diskon[i] * 100) + "%" + "     " + kursIndonesia.format(sub_total[i]));
    }
    
    //Deklarasi method non void kembali
    double kembalian(double dibayar) {
    	this.dibayar = dibayar;
    	kembalian = dibayar - this.total_bayar;
    	return kembalian;
    }
    
    //Deklarasi void reset()
    void reset() {
    	i = 0;
    	total_bayar = 0;
    }
}

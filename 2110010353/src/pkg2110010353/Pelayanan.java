/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010353;
import laundry.*;
/**
 *
 * @author Adam
 */
public class Pelayanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Overload Constructor");
        
        PelayananHeader objku = new PelayananHeader();
        System.out.println("Data Pelayanan Header : "+objku.dataPelayananHeader("21100 ", "00221 ","00242 ","03-13-2000 ","5000 ","Lunas "));
        
        Layanan objku2 = new Layanan();
        System.out.println("Data Layanan : "+objku2.dataLayanan("004 ", "ekstra ","7000 "));
        
        Pegawai objku3 = new Pegawai();
        System.out.println("Data Pegawai : "+objku3.dataPegawai("033 ", "Galuh ","Kilat ","557 ","Tanjung ","081232245"));
        
        PelayananDetail objku4 = new PelayananDetail();
        System.out.println("Data Pelayanan Detail : "+objku4.dataPelayananDetail("021 ", "007 ","Kilat ","8000 ","12 ","96000"));
        
        Pelanggan objku5 = new Pelanggan();
        System.out.println("Data Pelanggan : "+objku5.dataPelanggan("023 ", "Mada ","Banjarmasin ","082948292 "));
        
        PembayaranHeader objku6 = new PembayaranHeader();
        System.out.println("Data Pembayaran Header : "+objku6.dataPembayaranHeader("441 ", "009 ","556 ","05-05-2000 ","07-05-2000 ","10000 ","20000 "," 10000"," lunas"));
        
        PembayaranDetail objku7 = new PembayaranDetail();
        System.out.println("Data Pembayaran Detail : "+objku7.dataPembayaranDetail("021 ", "Galuh ","Kilat ","557 ","Lunas ","081232245"));
        
        System.out.println(" ");
        
        System.out.println("Method Overload ");
        PelayananHeader objku8 = new PelayananHeader("21100 ", "00221 ","00242 ","03-13-2000 ","5000 ","Lunas ");
        System.out.println("Data Pelayanan Header : "+objku8.dataPelayananHeader());
        
        Layanan objku9 = new Layanan("004 ", "ekstra ","7000 ");
        System.out.println("Data Layanan : "+objku9.dataLayanan());
        
        Pegawai objku10 = new Pegawai("033 ", "Galuh ","Kilat ","557 ","Tanjung ","081232245");
        System.out.println("Data Pegawai : "+objku10.dataPegawai());
        
        PelayananDetail objku11 = new PelayananDetail("021 ", "007 ","Kilat ","8000 ","12 ","96000");
        System.out.println("Data Pelayanan Detail : "+objku11.dataPelayananDetail());
        
        Pelanggan objku12 = new Pelanggan("023 ", "Mada ","Banjarmasin ","082948292 ");
        System.out.println("Data Pelanggan : "+objku12.dataPelanggan());
        
        PembayaranHeader objku13 = new PembayaranHeader("441 ", "009 ","556 ","05-05-2000 ","07-05-2000 ","10000 ","20000 "," 10000"," Lunas");
        System.out.println("Data Pembayaran Header : "+objku13.dataPembayaranHeader());
        
        PembayaranDetail objku14 = new PembayaranDetail("021 ", "Galuh ","Kilat ","557 ","Lunas ","081232245");
        System.out.println("Data Pembayaran Detail : "+objku14.dataPembayaranDetail());
        
    }
     
}
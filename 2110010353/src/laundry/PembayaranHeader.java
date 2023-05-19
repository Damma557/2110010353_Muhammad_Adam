/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class PembayaranHeader {
    private String NoPembayaran;
    private String IdLaundry;
    private String IdPelanggan;
    private String TglMasuk;
    private String TglBayar;
    private String Total;
    private String Bayar;
    private String Kembalian;
    private String Catatan;
   
    
    public PembayaranHeader(){}
    public PembayaranHeader(String a){
        setNoPembayaran(a);
    }
    
    public PembayaranHeader(String a,String b){
        setNoPembayaran(a);
        setIdLaundry(b);
    }
    public PembayaranHeader(String a,String b,String c){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
    }
     public PembayaranHeader(String a,String b,String c,String d ){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
       
     }
     public PembayaranHeader(String a,String b,String c,String d,String e ){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
    }
     public PembayaranHeader(String a,String b,String c,String d,String e,String f){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
        setTotal(f);
     }
     
     public PembayaranHeader(String a,String b,String c,String d,String e,String f,String g){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
        setTotal(f);
        setBayar(g);
    }
     
    public PembayaranHeader(String a,String b,String c,String d,String e,String f,String g,String h ){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
        setTotal(f);
        setBayar(g);
        setKembalian(h);
    }
    
    public PembayaranHeader(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
        setTotal(f);
        setBayar(g);
        setKembalian(h);
        setCatatan(i);

    }
    
    public void setNoPembayaran (String a){
        this.NoPembayaran=a;
    }
    public String getNoPembayaran(){
        return this.NoPembayaran;
    }
    public void setIdLaundry (String b){
        this.IdLaundry=b;
    }
    public String getIdLaundry(){
        return this.IdLaundry;
    }
    public void setIdPelanggan (String c){
        this.IdPelanggan=c;
    }
    public String getIdPelanggan(){
        return this.IdPelanggan;
    }
    public void setTglMasuk (String d){
        this.TglMasuk=d;
    }
    public String getTglMasuk(){
        return this.TglMasuk;
    }
    public void setTglBayar (String e){
        this.TglBayar=e;
    }
    public String getTglBayar(){
        return this.TglBayar;
    }
    
    public void setTotal (String f){
        this.Total=f;   
    }
    
    public String getTotal(){
        return this.Total;
   
    }
     public void setBayar (String g){
        this.Bayar=g;
    }
    public String getBayar(){
        return this.Bayar;
    }
    public void setKembalian (String h){
        this.Kembalian=h;
    }
    public String getKembalian(){
        return this.Kembalian;
    }
    public void setCatatan (String i){
        this.Catatan=i;   
    }
    
    public String getCatatan(){
        return this.Catatan;
   
    }
    public String dataPembayaranHeader(){
        return getNoPembayaran()+getIdLaundry()+getIdPelanggan()+getTglMasuk()+getTglBayar()+getTotal()+getBayar()+getKembalian()+getCatatan(); 
    }
    public String dataPembayaranHeader(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        setNoPembayaran(a);
        setIdLaundry(b);
        setIdPelanggan(c);
        setTglMasuk(d);
        setTglBayar(e);
        setTotal(f);
        setBayar(g);
        setKembalian(h);
        setCatatan(i);
       
       return getNoPembayaran()+getIdLaundry()+getIdPelanggan()+getTglMasuk()+getTglBayar()+getTotal()+getBayar()+getKembalian()+getCatatan(); 

    }
}

    


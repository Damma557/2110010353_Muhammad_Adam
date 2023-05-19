/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class PelayananHeader {
    private String IdLaundry;
    private String IdPegawai;
    private String IdPelanggan;
    private String Tgl;
    private String TotalBayar;
    private String Catatan;
   
    
    public PelayananHeader(){}
    public PelayananHeader(String a){
        setIdLaundry(a);
    }
    
    public PelayananHeader(String a,String b){
        setIdLaundry(a);
        setIdPegawai(b);
    }
    public PelayananHeader(String a,String b,String c){
        setIdLaundry(a);
        setIdPegawai(b);
        setIdPelanggan(c);
    }
     public PelayananHeader(String a,String b,String c,String d ){
        setIdLaundry(a);
        setIdPegawai(b);
        setIdPelanggan(c);
        setTgl(d);
    }
     public PelayananHeader(String a,String b,String c,String d,String e){
        setIdLaundry(a);
        setIdPegawai(b);
        setIdPelanggan(c);
        setTgl(d);
        setTotalBayar(e);
     }
     
     public PelayananHeader(String a,String b,String c,String d,String e,String f){
        setIdLaundry(a);
        setIdPegawai(b);
        setIdPelanggan(c);
        setTgl(d);
        setTotalBayar(e);
        setCatatan(f);
    }
   
    
    public void setIdLaundry (String a){
        this.IdLaundry=a;
    }
    public String getIdLaundry(){
        return this.IdLaundry;
    }
    public void setIdPegawai (String b){
        this.IdPegawai=b;
    }
    public String getIdPegawai(){
        return this.IdPegawai;
    }
    public void setIdPelanggan (String c){
        this.IdPelanggan=c;
    }
    public String getIdPelanggan(){
        return this.IdPelanggan;
    }
    public void setTgl (String d){
        this.Tgl=d;
    }
    public String getTgl(){
        return this.Tgl;
    }
    public void setTotalBayar (String e){
        this.TotalBayar=e;
    }
    public String getTotalBayar(){
        return this.TotalBayar;
    }
    public void setCatatan (String f){
        this.Catatan=f;   
    }
    public String getCatatan(){
        return this.Catatan;
   
    }
    public String dataPelayananHeader(){
        return getIdLaundry()+getIdPegawai()+getIdPelanggan()+getTgl()+getTotalBayar()+getCatatan(); 
    }
    public String dataPelayananHeader(String a,String b,String c,String d,String e,String f){
        setIdLaundry(a);
        setIdPegawai(b);
        setIdPelanggan(c);
        setTgl(d);
        setTotalBayar(e);
        setCatatan(f);
       
       return getIdLaundry()+getIdPegawai()+getIdPelanggan()+getTgl()+getTotalBayar()+getCatatan(); 

    }
}

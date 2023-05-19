/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
   public class Pelanggan {
    private String IdPelanggan;
    private String NamaPelanggan;
    private String Alamat;
    private String NoHp;
   
    
    public Pelanggan(){}
    
    public Pelanggan(String a){
        setIdPelanggan(a);
    }
    
    public Pelanggan(String a,String b){
        setIdPelanggan(a);
        setNamaPelanggan(b);
    }
        public Pelanggan(String a,String b,String c){
        setIdPelanggan(a);
        setNamaPelanggan(b);
        setAlamat(c);
     }
        public Pelanggan(String a,String b,String c,String d){
        setIdPelanggan(a);
        setNamaPelanggan(b);
        setAlamat(c);
        setNoHp(d);
    }
    public void setIdPelanggan (String a){
        this.IdPelanggan=a;
    }
    public String getIdPelanggan(){
        return this.IdPelanggan;
    }
    public void setNamaPelanggan (String b){
        this.NamaPelanggan=b;
    }
    public String getNamaPelanggan(){
        return this.NamaPelanggan;
    }
    public void setAlamat(String c){
        this.Alamat=c;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public void setNoHp(String d){
        this.NoHp=d;
    }
    public String getNoHp(){
        return this.NoHp;
    }
    
    
    public String dataPelanggan(){
     return getIdPelanggan()+getNamaPelanggan()+getAlamat()+getNoHp();
    }
    public String dataPelanggan(String a,String b,String c,String d){
        setIdPelanggan(a);
        setNamaPelanggan(b);
        setAlamat(c);
        setNoHp(d);
        
       return getIdPelanggan()+getNamaPelanggan()+getAlamat()+getNoHp();
    }

}

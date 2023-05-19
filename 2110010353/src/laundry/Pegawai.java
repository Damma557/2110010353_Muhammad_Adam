/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class Pegawai {
    private String IdPegawai;
    private String NamaPegawai;
    private String Level;
    private String Password;
    private String Alamat;
    private String NoHp;
   
    
    public Pegawai(){}
    
    public Pegawai(String a){
        setIdPegawai(a);
    }
    
    public Pegawai(String a,String b){
        setIdPegawai(a);
        setNamaPegawai(b);
    }
    public Pegawai(String a,String b,String c){
        setIdPegawai(a);
        setNamaPegawai(b);
        setLevel(c);
    }
     public Pegawai(String a,String b,String c,String d ){
        setIdPegawai(a);
        setNamaPegawai(b);
        setLevel(c);
        setPassword(d);
    }
     public Pegawai(String a,String b,String c,String d,String e){
        setIdPegawai(a);
        setNamaPegawai(b);
        setLevel(c);
        setPassword(d);
        setAlamat(e);
     }
     
     public Pegawai(String a,String b,String c,String d,String e,String f){
        setIdPegawai(a);
        setNamaPegawai(b);
        setLevel(c);
        setPassword(d);
        setAlamat(e);
        setNoHp(f);
    }
     public void setIdPegawai (String a){
        this.IdPegawai=a;
    }
    public String getIdPegawai(){
        return this.IdPegawai;
        }
     public void setNamaPegawai (String b){
        this.NamaPegawai=b;
    }
    public String getNamaPegawai(){
        return this.NamaPegawai;
}
      public void setLevel (String c){
        this.Level=c;
    }
    public String getLevel(){
        return this.Level;
        }
      public void setPassword (String d){
        this.Password=d;
    }
    public String getPassword(){
        return this.Password;
        }
      public void setAlamat (String e){
        this.Alamat=e;
    }
    public String getAlamat(){
        return this.Alamat;
        }
      public void setNoHp (String f){
        this.NoHp=f;
    }
    public String getNoHp (){
        return this.NoHp ;
        }
    
  public String dataPegawai(){
        return getIdPegawai()+getNamaPegawai()+getLevel()+getPassword()+getAlamat()+getNoHp(); 
    }
    public String dataPegawai(String a,String b,String c,String d,String e,String f){
        setIdPegawai(a);
        setNamaPegawai(b);
        setLevel(c);
        setPassword(d);
        setAlamat(e);
        setNoHp(f);
    
       
        return getIdPegawai()+getNamaPegawai()+getLevel()+getPassword()+getAlamat()+getNoHp(); 
    }
}


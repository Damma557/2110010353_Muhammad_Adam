/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class Layanan {
    private String KodeLayanan;
    private String NamaLayanan;
    private String Harga;
   
    
    public Layanan(){}
    
    public Layanan(String a){
        setKodeLayanan(a);
    }
    
    public Layanan(String a,String b){
        setKodeLayanan(a);
        setNamaLayanan(b);
    }
        public Layanan(String a,String b,String c){
        setKodeLayanan(a);
        setNamaLayanan(b);
        setHarga(c);
    }
    public void setKodeLayanan (String a){
        this.KodeLayanan=a;
    }
    public String getKodeLayanan(){
        return this.KodeLayanan;
    }
    public void setNamaLayanan (String b){
        this.NamaLayanan=b;
    }
    public String getNamaLayanan(){
        return this.NamaLayanan;
    }
    public void setHarga (String c){
        this.Harga=c;
    }
    public String getHarga(){
        return this.Harga;
    }
    
    
    public String dataLayanan(){
        return getKodeLayanan()+getNamaLayanan()+getHarga(); 
    }
    public String dataLayanan(String a,String b,String c){
        setKodeLayanan(a);
        setNamaLayanan(b);
        setHarga(c);
      
      return getKodeLayanan()+getNamaLayanan()+getHarga(); 

    }
}
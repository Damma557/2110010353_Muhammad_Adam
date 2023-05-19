/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class PembayaranDetail {
    private String NoPembayaran;
    private String KodeLayanan;
    private String NamaLayanan;
    private String Harga;
    private String Qty;
    private String Subtotal;
   
    
    public PembayaranDetail(){}
    
    public PembayaranDetail(String a){
        setNoPembayaran(a);
    }
    
    public PembayaranDetail(String a,String b){
        setNoPembayaran(a);
        setKodeLayanan(b);
    }
    public PembayaranDetail(String a,String b,String c){
        setNoPembayaran(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
    }
     public PembayaranDetail(String a,String b,String c,String d ){
        setNoPembayaran(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
    }
     public PembayaranDetail(String a,String b,String c,String d,String e){
        setNoPembayaran(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
     }
     
     public PembayaranDetail(String a,String b,String c,String d,String e,String f){
        setNoPembayaran(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
        setSubtotal(f);
    }
     public void setNoPembayaran (String a){
        this.NoPembayaran=a;
    }
    public String getNoPembayaran(){
        return this.NoPembayaran;
        }
     public void setKodeLayanan (String b){
        this.KodeLayanan=b;
    }
    public String getKodeLayanan(){
        return this.KodeLayanan;
}
      public void setNamaLayanan (String c){
        this.NamaLayanan=c;
    }
    public String getNamaLayanan(){
        return this.NamaLayanan;
        }
      public void setHarga (String d){
        this.Harga=d;
    }
    public String getHarga(){
        return this.Harga;
        }
      public void setQty (String e){
        this.Qty=e;
    }
    public String getQty(){
        return this.Qty;
        }
      public void setSubtotal (String f){
        this.Subtotal=f;
    }
    public String getSubtotal (){
        return this.Subtotal ;
        }
    
  public String dataPembayaranDetail(){
        return getNoPembayaran()+getKodeLayanan()+getNamaLayanan()+getHarga()+getQty()+getSubtotal(); 
    }
    public String dataPembayaranDetail(String a,String b,String c,String d,String e,String f){
        setNoPembayaran(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
        setSubtotal(f);
    
       
        return getNoPembayaran()+getKodeLayanan()+getNamaLayanan()+getHarga()+getQty()+getSubtotal(); 
    }
}




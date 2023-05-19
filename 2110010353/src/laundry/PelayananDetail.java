/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Adam
 */
public class PelayananDetail {
    private String IdLaundry;
    private String KodeLayanan;
    private String NamaLayanan;
    private String Harga;
    private String Qty;
    private String Subtotal;
   
    
    public PelayananDetail(){}
    
    public PelayananDetail(String a){
        setIdLaundry(a);
    }
    
    public PelayananDetail(String a,String b){
        setIdLaundry(a);
        setKodeLayanan(b);
    }
    public PelayananDetail(String a,String b,String c){
        setIdLaundry(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
    }
     public PelayananDetail(String a,String b,String c,String d ){
        setIdLaundry(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
    }
     public PelayananDetail(String a,String b,String c,String d,String e){
        setIdLaundry(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
     }
     
     public PelayananDetail(String a,String b,String c,String d,String e,String f){
        setIdLaundry(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
        setSubtotal(f);
    }
     public void setIdLaundry (String a){
        this.IdLaundry=a;
    }
    public String getIdLaundry(){
        return this.IdLaundry;
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
    
  public String dataPelayananDetail(){
        return getIdLaundry()+getKodeLayanan()+getNamaLayanan()+getHarga()+getQty()+getSubtotal(); 
    }
    public String dataPelayananDetail(String a,String b,String c,String d,String e,String f){
        setIdLaundry(a);
        setKodeLayanan(b);
        setNamaLayanan(c);
        setHarga(d);
        setQty(e);
        setSubtotal(f);
    
       
        return getIdLaundry()+getKodeLayanan()+getNamaLayanan()+getHarga()+getQty()+getSubtotal(); 
    }
}


    


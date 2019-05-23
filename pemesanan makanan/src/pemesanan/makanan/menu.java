/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanan.makanan;

/**
 *
 * @author Satya Hidayat
 */
public class menu {
    
    private int ttljumlah, jumlah;
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getjumlah(){
        return jumlah;    
    }
    public int getHasil(){
        return ttljumlah;    
    }
    public void total1(){
        this.ttljumlah=this.jumlah*10000;
    }
    public void total2(){
        this.ttljumlah=this.jumlah*12000;
    }
   public void total3(){
        this.ttljumlah=this.jumlah*15000;
    }
    public void total4(){
        this.ttljumlah=this.jumlah*20000;
    }
    public void total5(){
        this.ttljumlah=this.jumlah*13000;
    }
    public void total6(){
        this.ttljumlah=this.jumlah*3000;
    }
    public void total7(){
        this.ttljumlah=this.jumlah*4000;
    }
    public void total8(){
        this.ttljumlah=this.jumlah*9000;
    }
    public void total9(){
        this.ttljumlah=this.jumlah*1000;
    }
    public void total10(){
        this.ttljumlah=this.jumlah*5000;
    }
}

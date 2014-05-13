/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Minuman {
   
    private String Id;
    private String nama;
    private double harga;
    private int stok;
    private jenis[] daftarMinuman;

    Minuman(String m1, String air_mineral, double harga, int i) {
        this.Id=m1;
        this.nama=air_mineral;
        this.harga=harga;
        this.stok=i;
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Minuman() {
        
    }

    /**
     * @return the nomor
     */
    

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the daftarMinuman
     */
    public jenis[] getDaftarMinuman() {
        return daftarMinuman;
    }

    /**
     * @param daftarMinuman the daftarMinuman to set
     */
    public void setDaftarMinuman(jenis[] daftarMinuman) {
        this.daftarMinuman = daftarMinuman;
    }

   
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vm;

/**
 *
 * @author User
 */
public class Member {
    private int nomor;
    private String id;
    private String nama;
    private String noRekening;
    private double saldo;
    private String alamat;
    private String noTelp;
    private String tempatLahir;
    private String tanggalLahir;
    
    
    public Member(String id, String nama, String noRekening, double saldo , 
            String alamat, String noTelp, String tempatLahir, String tanggalLahir){
      
        this.id=id;
        this.nama=nama;
        this.noRekening=noRekening;
        this.saldo=saldo;
        this.alamat=alamat;
        this.noTelp=noTelp;
        this.tempatLahir=tempatLahir;
        this.tanggalLahir=tanggalLahir;
    
    }

    Member() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     
    

    /**
     * @param id the id to set
     */
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
     * @return the noRekening
     */
    public String getNoRekening() {
        return noRekening;
    }

    /**
     * @param noRekening the noRekening to set
     */
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the noTelp
     */
    public String getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    /**
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the id
     */
    
}

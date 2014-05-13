/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import transaksi.pembelian;
import vm.Member;
import vm.Minuman;

/**
 *
 * @author Rahmi Maulidina N
 */
public class koneksi {

    Connection conn = null;

    public koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "vendingmachine", "root", "");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public void insertMember(Member a) {
        if (a != null) {
            try {
                PreparedStatement ps;
                ps = conn.prepareStatement("insert member values"
                        + "(?,?,?,?,?,?,?,?)");
                ps.setString(1, a.getId());
                 ps.setString(2, a.getNama());
                ps.setString(3, a.getNoRekening());
                ps.setDouble(4, a.getSaldo());
                ps.setString(5, a.getAlamat());
                ps.setString(6, a.getNoTelp());
                ps.setString(7, a.getTempatLahir());
                ps.setString(8, a.getTanggalLahir());
                ps.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertMinuman(Minuman a) {
        if (a != null) {
            try {
                PreparedStatement ps;
                ps = conn.prepareStatement("insert into barang values"
                        + "(?,?,?,?)");
                
                ps.setString(1, a.getId());
                ps.setString(2, a.getNama());
                ps.setDouble(3, a.getHarga());
                ps.setInt(4, a.getStok());
                ps.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    public void insertPembelian(pembelian a) {
        if (a != null) {
            try {
                PreparedStatement ps;
                ps = conn.prepareStatement("insert into mahasiswa values"
                        + "(?,?,?,?,?)");
                ps.setInt(1, a.getNomor());
                ps.setString(2, a.getId_pembelian());
                ps.setDate(3,(Date) a.getTanggalPembelian());
                ps.setString(4, a.getBarang());
                ps.setInt(5, a.getJumlah());
                ps.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public Minuman cariMinuman(String id) {
        PreparedStatement ps = null;
        Minuman a=new Minuman();
        try {
            ps = conn.prepareStatement("select * from barang where kode_barang=?");
            ps.setString(1, id);
            ps.executeQuery();
            if (ps.getResultSet().first())
            {
                a.setId(ps.getResultSet().getString(1));
                a.setNama(ps.getResultSet().getString(2));
                a.setHarga(ps.getResultSet().getDouble(3));
                a.setStok(ps.getResultSet().getInt(4));
            }
            else
                System.out.println("Ga ada data");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }
    
    /**
     *
     * @param id
     * @return
     */
    
    /*public Peminjaman cariPeminjaman(String idTransaksi) {
        PreparedStatement ps = null;
        Peminjaman a=new Peminjaman();
        try {
            ps = conn.prepareStatement("select * from buku where kd_buku=?");
            ps.setString(1, idTransaksi);
            ps.executeUpdate();
            a.setIdTransaksi(ps.getResultSet().getString(1));
            a.setTanggalPinjam(ps.getResultSet().getDate(2));
            a.setTanggalHarusKembali(ps.getResultSet().getDate(3));
            a.setTanggalKembali(ps.getResultSet().getDate(4));
            a.setDenda(ps.getResultSet().getDouble(5));
            a.setNIM(ps.getResultSet().getString(6));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }
    
    
    public void deletePeminjaman(Peminjaman a) {
        if (a != null) {
            try {
                PreparedStatement ps;
                ps = conn.prepareStatement("delete from peminjaman "
                        + "where id_transaksi=?");

                ps.setString(1, a.getIdTransaksi());
                ps.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    */
    public void updateMinuman(Minuman a) {
        if (a != null) {
            try {
                PreparedStatement ps;
                ps = conn.prepareStatement("update barang set nama=?,"
                        + "harga=?,stok=? where kode_barang=?");

                ps.setString(1, a.getNama());
                ps.setDouble(2, a.getHarga());
                ps.setInt(3, a.getStok());
                ps.setString(4, a.getId());
                
                ps.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    
    
   
    public Minuman cariMinuman(boolean id_minuman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

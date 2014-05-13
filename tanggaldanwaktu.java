/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class TanggalDanWaktu {
    
    private static TanggalDanWaktu instance = null;

    protected  TanggalDanWaktu() {
    
    }
    
    public static TanggalDanWaktu getInstance() {
        if (instance == null) {
            instance = new TanggalDanWaktu();
        }
        
        return instance;
    }
    
    
    public void waktu(final JTextField txtJam, final JTextField txtMenit, final JTextField txtDetik, final JLabel lblTgl) {
        // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                
                // Membuat Date
                Date dt = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy"); 
                
                // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                
                // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
                if (nilai_jam <= 9) {
                    // Tambahkan "0" didepannya
                    nol_jam = "0";
                }
                // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
                if (nilai_menit <= 9) {
                    // Tambahkan "0" didepannya
                    nol_menit = "0";
                }
                // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
                if (nilai_detik <= 9) {
                    // Tambahkan "0" didepannya
                    nol_detik = "0";
                }
                // Membuat String JAM, MENIT, DETIK
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                
                // Menampilkan pada Layar
                txtJam.setText(jam);
                txtMenit.setText(menit);
                txtDetik.setText(detik);
                lblTgl.setText(sdf.format(dt));
            }
        };
        // Timer
        new Timer(1000, taskPerformer).start();
    }
}

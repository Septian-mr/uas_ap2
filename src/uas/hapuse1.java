package uas;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class hapuse1 {
    
    public koneks1 konek = new koneks1();

    public void hapus(int nim) {
    
        try {
            konek.koneksi();
            try (java.sql.Statement perintah = konek.con.createStatement()) {
                String sql = "delete from list_mahasiswa where NIM = '" + nim + "'";
                perintah.executeUpdate(sql);
            }
            
            int hps = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null,"Yakin ingin hapus data?");
            if(hps == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            } else{
                
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, ada kesalahan teknis");
        }
    }
}

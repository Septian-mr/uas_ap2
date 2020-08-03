package uas
;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class tambahe1 {

    public koneks1 konek = new koneks1();

    public void insert(int nim, String nama, String alamat, String jk, String beasiswa, String email) {

        try {
            konek.koneksi();
            try (java.sql.Statement perintah = konek.con.createStatement()) {
                String sql = "insert into list_mahasiswa values('" + nim + "','" + nama + "','" + alamat + "','"+ jk + "','" + beasiswa +"','" + email +"')";
                perintah.executeUpdate(sql);
            }

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

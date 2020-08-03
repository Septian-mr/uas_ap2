package uas;

import javax.swing.JOptionPane;

/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class updatei1 {

    public koneks1 konek = new koneks1();

    public void update(int nim, String nama, String alamat, String jk, String beasiswa, String email) {

        try {
            konek.koneksi();
            try (java.sql.Statement statement = konek.con.createStatement()) {
                String sql_nama = "update list_mahasiswa set Nama = '" + nama + "'where Nim = '" + nim + "'";
                String sql_alamat = "update list_mahasiswa set Alamat = '" + alamat + "'where Nim = '" + nim + "'";
                String sql_email = "update list_mahasiswa set Email = '" + email + "'where Nim = '" + nim + "'";
                String sql_beas = "update list_mahasiswa set Beasiswa = '" + beasiswa + "'where Nim = '" + nim + "'";
                String sql_jk = "update list_mahasiswa set Gender = '" + jk + "'where Nim = '" + nim + "'";
                String sql_nim = "update list_mahasiswa set Nim = '" + nim + "'where Nama = '" + nama + "'";
                
                statement.executeUpdate(sql_nim);
                statement.executeUpdate(sql_nama);
                statement.executeUpdate(sql_alamat);
                statement.executeUpdate(sql_jk);
                statement.executeUpdate(sql_beas);
                statement.executeUpdate(sql_email);
            }
            JOptionPane.showMessageDialog(null, "Sudah berubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

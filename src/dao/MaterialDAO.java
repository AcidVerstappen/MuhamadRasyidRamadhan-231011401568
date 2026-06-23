package dao;

import model.Material;
import java.sql.*;
import java.util.ArrayList;

public class MaterialDAO {

    Connection conn;

    public MaterialDAO() {
        conn = Koneksi.getConnection();
    }

    // 1. INSERT
    public void insert(Material m) {
        try {
            String sql = "INSERT INTO material (kode_material, nama_material, kategori, satuan, stok, harga, supplier) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, m.getKodeMaterial());
            ps.setString(2, m.getNamaMaterial());
            ps.setString(3, m.getKategori());
            ps.setString(4, m.getSatuan());
            ps.setInt(5, m.getStok());
            ps.setDouble(6, m.getHarga());
            ps.setString(7, m.getSupplier());

            ps.executeUpdate();

            System.out.println("Data berhasil ditambah");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 2. SELECT ALL
    public ArrayList<Material> getAll() {
        ArrayList<Material> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM material";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Material m = new Material();

                m.setIdMaterial(rs.getInt("id_material"));
                m.setKodeMaterial(rs.getString("kode_material"));
                m.setNamaMaterial(rs.getString("nama_material"));
                m.setKategori(rs.getString("kategori"));
                m.setSatuan(rs.getString("satuan"));
                m.setStok(rs.getInt("stok"));
                m.setHarga(rs.getDouble("harga"));
                m.setSupplier(rs.getString("supplier"));

                list.add(m);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
    //3.SEARCH
    public ArrayList<Material> search(String keyword) {

    ArrayList<Material> list = new ArrayList<>();

    try {

        String sql =
        "SELECT * FROM material WHERE nama_material LIKE ?";

        PreparedStatement ps =
        conn.prepareStatement(sql);

        ps.setString(1, "%" + keyword + "%");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            Material m = new Material();

            m.setIdMaterial(rs.getInt("id_material"));
            m.setKodeMaterial(rs.getString("kode_material"));
            m.setNamaMaterial(rs.getString("nama_material"));
            m.setKategori(rs.getString("kategori"));
            m.setSatuan(rs.getString("satuan"));
            m.setStok(rs.getInt("stok"));
            m.setHarga(rs.getDouble("harga"));
            m.setSupplier(rs.getString("supplier"));

            list.add(m);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    return list;
}

    // 3. UPDATE
    public void update(Material m) {
        try {
            String sql = "UPDATE material SET kode_material=?, nama_material=?, kategori=?, satuan=?, stok=?, harga=?, supplier=? WHERE id_material=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, m.getKodeMaterial());
            ps.setString(2, m.getNamaMaterial());
            ps.setString(3, m.getKategori());
            ps.setString(4, m.getSatuan());
            ps.setInt(5, m.getStok());
            ps.setDouble(6, m.getHarga());
            ps.setString(7, m.getSupplier());
            ps.setInt(8, m.getIdMaterial());

            ps.executeUpdate();

            System.out.println("Data berhasil diupdate");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 4. DELETE
    public void delete(int id) {
        try {
            String sql = "DELETE FROM material WHERE id_material=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

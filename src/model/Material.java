package model;

public class Material {

    private int idMaterial;
    private String kodeMaterial;
    private String namaMaterial;
    private String kategori;
    private String satuan;
    private int stok;
    private double harga;
    private String supplier;

    // getter & setter

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getKodeMaterial() {
        return kodeMaterial;
    }

    public void setKodeMaterial(String kodeMaterial) {
        this.kodeMaterial = kodeMaterial;
    }

    public String getNamaMaterial() {
        return namaMaterial;
    }

    public void setNamaMaterial(String namaMaterial) {
        this.namaMaterial = namaMaterial;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
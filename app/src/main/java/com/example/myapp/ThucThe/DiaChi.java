package com.example.myapp.ThucThe;

public class DiaChi {
    int maDiaChi;
    String tenDiaChi;
    String loaiDiaChi;
    String sdt;

    public DiaChi(int maDiaChi, String tenDiaChi, String loaiDiaChi, String sdt) {
        this.maDiaChi = maDiaChi;
        this.tenDiaChi = tenDiaChi;
        this.loaiDiaChi = loaiDiaChi;
        this.sdt = sdt;
    }
    public DiaChi() {
    }

    public int getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(int maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public String getTenDiaChi() {
        return tenDiaChi;
    }

    public void setTenDiaChi(String tenDiaChi) {
        this.tenDiaChi = tenDiaChi;
    }

    public String getLoaiDiaChi() {
        return loaiDiaChi;
    }

    public void setLoaiDiaChi(String loaiDiaChi) {
        this.loaiDiaChi = loaiDiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

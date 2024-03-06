package com.example.myapp.ThucThe;

public class ChiTietDiaChi {
    int maDiaChi;
    int maKhachHang;

    public ChiTietDiaChi(int maDiaChi, int maKhachHang) {
        this.maDiaChi = maDiaChi;
        this.maKhachHang = maKhachHang;
    }
    public ChiTietDiaChi() {
    }

    public int getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(int maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}

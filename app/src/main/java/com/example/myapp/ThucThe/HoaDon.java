package com.example.myapp.ThucThe;

import java.util.Date;
import java.util.Timer;

public class HoaDon {
    int maHoaDon;
    int maDonHang;
    Date ngayGiao;
    Timer gioGiao;

    public HoaDon() {

    }
    public HoaDon(int maHoaDon, int maDonHang, Date ngayGiao, Timer gioGiao) {
        this.maHoaDon = maHoaDon;
        this.maDonHang = maDonHang;
        this.ngayGiao = ngayGiao;
        this.gioGiao = gioGiao;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public Timer getGioGiao() {
        return gioGiao;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public void setGioGiao(Timer gioGiao) {
        this.gioGiao = gioGiao;
    }
}

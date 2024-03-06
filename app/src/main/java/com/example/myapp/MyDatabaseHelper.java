package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "AppCaffe";
    private static final int DATABASE_VERSION = 1;


    private static final String tbDiaChi = "DIACHI";
    private static final String dc_MaDC = "MADIACHI";
    private static final String dc_TenDC = "TENDIACHI";
    private static final String dc_LoaiDC = "LOAIDIACHI";
    private static final String dc_SDT = "SDT";

    private static final String tbHoaDon = "HOADON";
    private static final String hd_MaHD = "MAHOADON";
    private static final String hd_MaDH = "MADONHANG";
    private static final String hd_NgayGiao = "NGAYGIAO";
    private static final String hd_GioGiao = "GIOGIAO";

    private static final String tbCTDC = "CT_DIACHI";
    private static final String ctdc_MaDC = "MADIACHI";
    private static final String ctdc_MaKH = "MAKHACHHANG";



    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbNhanVien = "CREATE TABLE " + tbDiaChi + "("
                + dc_MaDC + " INTEGER PRIMARY KEY,"
                + dc_TenDC + " TEXT,"
                + dc_LoaiDC + " TEXT,"
                + dc_SDT + " TEXT,"

                + ")";
        db.execSQL(tbNhanVien);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tbDiaChi);
        onCreate(db);
    }
    public SQLiteDatabase open()
    {
        return this.getWritableDatabase();
    }
    // Thêm sản phẩm vào cơ sở dữ liệu
//    public void addProduct(String name, double price) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_NAME, name);
//        values.put(COLUMN_PRICE, price);
//        db.insert(TABLE_NAME, null, values);
//        db.close();
//    }

    // Lấy danh sách sản phẩm từ cơ sở dữ liệu
//    public List<String> getAllProducts() {
//        List<String> productList = new ArrayList<>();
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
//        if (cursor.moveToFirst()) {
//            do {
//                @SuppressLint("Range") String productName = cursor.getString(cursor.getColumnIndex(COLUMN_NAME));
//                productList.add(productName);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        db.close();
//        return productList;
//    }


}

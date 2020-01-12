package com.poly.admin.duanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.poly.admin.duanmau.Activity.ListBookActivity;
import com.poly.admin.duanmau.Activity.ListHoaDonActivity;
import com.poly.admin.duanmau.Activity.ListTheLoaiActivity;
import com.poly.admin.duanmau.Activity.NguoiDungActivity;
import com.poly.admin.duanmau.Activity.ThemSachActivity;
import com.poly.admin.duanmau.Adapter.BookAdapter;
import com.poly.admin.duanmau.Adapter.CartAdapter;
import com.poly.admin.duanmau.Adapter.HoaDonAdapter;
import com.poly.admin.duanmau.Adapter.NguoiDungAdapter;
import com.poly.admin.duanmau.Adapter.TheLoaiAdapter;
import com.poly.admin.duanmau.Modelclass.Sach;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Quan Li Sach");
    }

    public void viewNguoiDung(View view) {
        Intent intent = new Intent(getApplicationContext(), NguoiDungActivity.class);
        startActivity(intent);
    }

    public void viewTheLoai(View view) {
        Intent intent = new Intent(getApplicationContext(), ListTheLoaiActivity.class);
        startActivity(intent);
    }

    public void viewListBookActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ListBookActivity.class);
        startActivity(intent);
    }
    public void ViewListHoaDonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ListHoaDonActivity.class);
        startActivity(intent);
    }
    public void ViewTopSach(View view) {
        Intent intent = new Intent(getApplicationContext(), CartAdapter.class);
        startActivity(intent);
    }

}

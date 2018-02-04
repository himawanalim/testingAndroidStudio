package com.example.android.himawan_alim_1202152175__modul_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mMenuMakanan;
    private EditText mPorsiMakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuMakanan = (EditText) findViewById(R.id.menu_makanan);
        mPorsiMakanan = (EditText) findViewById(R.id.porsi_makanan);
    }

    public void launchEatbus(View view) {
        Intent intent = new Intent(this, Secondactivity.class);

        String MenuMakanan = mMenuMakanan.getText().toString();
        String PorsiMakanan = mPorsiMakanan.getText().toString();

        intent.putExtra("Harga", "50000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Warkop");

        startActivity(intent);
    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(this, Secondactivity.class);

        String MenuMakanan = mMenuMakanan.getText().toString();
        String PorsiMakanan = mPorsiMakanan.getText().toString();

        intent.putExtra("Harga", "30000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Abnormal");

        startActivity(intent);
    }
}

package com.timkebut.validasi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TentangKami extends AppCompatActivity {

    //toolbar
    TextView toolbarText;
    Button kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentangkami);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);

        toolbarText = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.toolbartext);
        toolbarText.setText("Tentang");

        kembali = (Button) getSupportActionBar().getCustomView().findViewById(R.id.kembali);
        kembali.setVisibility(View.VISIBLE);

        TextView tentang = findViewById(R.id.tentangvalidori);

        tentang.setText("Validasi merupakan aplikasi yang berfungsi untuk memvalidasi suatu produk original atau palsu "+
        "Validasi melindungi konsumen dari ketidaktahuan dalam membeli suatu produk. " +
        "Validasi juga melindung karya dan hak cipta dari produsen dari pemalsuan produk yang mereka buat. " +
        "Dengan menggunakan Validasi konsumen dan produsen saling diuntungkan dalam proses transaksi jual beli.");

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}

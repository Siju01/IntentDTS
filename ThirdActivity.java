package com.pens.intentdtssiju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv3NamaSaya;

    Button btnPindahActivity1;

    /*public static final String EXTRA_NAMA = "extra_nama";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv3NamaSaya = findViewById(R.id.tv3_nama_saya);
        btnPindahActivity1 = findViewById(R.id.btn_activty1);

        btnPindahActivity1.setOnClickListener(this);

        String namaSaya= getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        if (TextUtils.isEmpty(namaSaya)) {
            tv3NamaSaya.setText("Nama Saya Siju");
        } else {
            tv3NamaSaya.setText("Nama : " + namaSaya);
        }

    }

    @Override
    public void onClick(View v) {
        /*String namaSaya = tv3NamaSaya.getText().toString().trim();*/

        Intent moveIntent1= new Intent(ThirdActivity.this, MainActivity.class);

        /*moveIntent1.putExtra(this.EXTRA_NAMA, namaSaya);*/

        startActivity(moveIntent1);
    }
}
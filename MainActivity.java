package com.pens.intentdtssiju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edNama, edInstitusi;

    Button btnPindahTanpaData, btnPindahDenganData;

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_INSTITUSI = "extra_institusi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.ed_nama);
        edInstitusi = findViewById(R.id.ed_institusi);

        btnPindahTanpaData = findViewById(R.id.btn_pindah_tanpa_data);
        btnPindahDenganData = findViewById(R.id.btn_pindah_data);

        btnPindahTanpaData.setOnClickListener(this);
        btnPindahDenganData.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pindah_tanpa_data:
                PindahTanpaData();
                break;
            case R.id.btn_pindah_data:
                PindahData();
                break;
        }
    }

    private void PindahTanpaData() {
        Intent moveIntentWithoutData = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(moveIntentWithoutData);
    }

    private void PindahData() {
        String nama = edNama.getText().toString().trim();
        String institusi = edInstitusi.getText().toString().trim();

        Intent moveIntentWithData = new Intent(MainActivity.this, SecondActivity.class);

        moveIntentWithData.putExtra(this.EXTRA_NAMA, nama);
        moveIntentWithData.putExtra(this.EXTRA_INSTITUSI, institusi);

        startActivity(moveIntentWithData);
    }

    /*private void PindahActivity3() {
        String Nama = edNama.getText().toString().trim();

        Intent moveIntentWithData = new Intent(MainActivity.this, ThirdActivity.class);

        moveIntentWithData.putExtra(this.EXTRA_NAMA, Nama);

        startActivity(moveIntentWithData);
    }*/
}
package com.example.tugaskalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtPj,txtLb;
    TextView txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniComp();
    }

    private void iniComp(){
        txtPj = findViewById(R.id.txtPj);
        txtLb = findViewById(R.id.txtLb);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
    }

    public void hPersegi(View v){
        int panjang = Integer.parseInt(txtPj.getText().toString());
        int lebar = Integer.parseInt(txtLb.getText().toString());
        int luas = panjang * lebar;
        int keliling = 2*panjang+2*lebar;

        txtLuas.setText("rumus dari luas persegi adalah : "+panjang+
                " * "+lebar+" = "+luas);
        txtKeliling.setText("rumus dari keliling persegi adalah : 2 * "+panjang+" + 2 * "
                +lebar+" = "+keliling);
    }

    public void hSegitiga(View v){
        int alas = Integer.parseInt(txtPj.getText().toString());
        int panjang = Integer.parseInt(txtPj.getText().toString());
        int tinggi = Integer.parseInt(txtLb.getText().toString());
        int luas = (alas*tinggi)/2;
        int keliling = panjang + panjang + panjang;

        txtLuas.setText("rumus dari luas segitiga adalah : "+alas+" * "+tinggi+" / 2 = "+luas);
        txtKeliling.setText("rumus dari keliling segitiga adalah : "
                +panjang+" + "+panjang+" + "+panjang+" = "+keliling);
    }

    public void hLingkaran(View v){
        int diameter = Integer.parseInt(txtPj.getText().toString());
        double luas = 3.14 * (diameter * diameter)/4;
        double keliling = 3.14 * diameter;

        txtLuas.setText("rumus dari luas lingkaran adalah : 1/4" +
                " * 3.14 * ("+diameter+" * "+diameter+") = "+luas);
        txtKeliling.setText("rumus dari keliling lingkaran adalah : 3.14 * "
                +diameter+" = "+keliling);
    }
}
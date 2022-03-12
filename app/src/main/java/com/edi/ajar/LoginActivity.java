package com.edi.ajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnKembali;
    Context mContext;

    private String key = "DATA";
    private String key2 = "DATA-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mContext = this;

        Button btn;
        btn = findViewById(R.id.btn_kembali_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(mContext, "Cetak data get status : "+gethasil(10, 20), Toast.LENGTH_LONG).show();
                finish();
            }
        });


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String value = bundle.getString(key2);
            TextView textView = findViewById(R.id.tv_name_login);
            textView.setText(value);
        }

//        btnKembali = findViewById(R.id.btn_kembali_login);
    }

    private void getData(){
        String hasil= "";

        hasil = "Ini adalah hasil";
    }

    public String getStatus(){
        String hasil= "";

        hasil = "Ini adalah hasil";
        return hasil;
    }

    private int gethasil(int a, int b){
        return a+b;
    }

}
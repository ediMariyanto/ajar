package com.edi.ajar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.edi.ajar.dialog.JenisKelaminDialog;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnTutup;
    private Context mContext;
    private String key = "DATA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tvHello = findViewById(R.id.tv_hello);
//        tvHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                JenisKelaminDialog jankelDialog = new JenisKelaminDialog();
//                jankelDialog.show(getFragmentManager(), "TEST");
//            }
//        });

        mContext = this;


        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JenisKelaminDialog jankelDialog = new JenisKelaminDialog();
                jankelDialog.show(getFragmentManager(), "TEST");

//                Bundle bundle = new Bundle();
//                bundle.putString(key,"Ini Adalah mahasiswa unpam");
//
//                Intent intent = new Intent(mContext, LoginActivity.class);
//                intent.putExtras(bundle);
//
//                startActivity(intent);
                //finish();
            }
        });

        btnTutup = findViewById(R.id.btn_tutup);
        btnTutup.setOnClickListener(view -> {
            finish();
        });

    }
}
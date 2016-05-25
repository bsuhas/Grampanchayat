package com.grampanchayat.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

import com.grampanchayat.R;

/**
 * Created by SUHAS on 25/05/2016.
 */
public class LoginScreenActivity extends AppCompatActivity {
    private Spinner spVillage;
    private EditText edtUserName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_layout);
        init();
    }

    private void init() {
        spVillage = (Spinner)findViewById(R.id.sp_village);
        edtUserName = (EditText)findViewById(R.id.edt_username);
    }
}

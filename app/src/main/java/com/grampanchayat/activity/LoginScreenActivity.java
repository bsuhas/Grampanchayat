package com.grampanchayat.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.grampanchayat.R;

/**
 * Created by SUHAS on 25/05/2016.
 */
public class LoginScreenActivity extends AppCompatActivity implements View.OnClickListener {
    private Spinner spVillage;
    private EditText edtUserName;
    private String[] DayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private EditText edtEnterOtp;
    private Button btnLogin;
    private Button btnGenerateOTP;
    private LinearLayout llGenerateOTP;
    private LinearLayout llSubmitOTP;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_layout);
        init();
    }

    private void init() {
        spVillage = (Spinner) findViewById(R.id.sp_village);
        edtUserName = (EditText) findViewById(R.id.edt_username);
        edtEnterOtp = (EditText) findViewById(R.id.edt_enter_otp);

        btnGenerateOTP = (Button) findViewById(R.id.btn_generate_otp);
        btnLogin = (Button) findViewById(R.id.btn_login);

        llGenerateOTP = (LinearLayout) findViewById(R.id.ll_generate_otp);
        llSubmitOTP = (LinearLayout) findViewById(R.id.ll_submit_otp);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.sp_village_item, R.id.txt_village, DayOfWeek);
        spVillage.setAdapter(adapter);

        btnGenerateOTP.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_generate_otp:
                String userName = edtUserName.getText().toString().trim();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
                } else {

                    //TODO Call API to Generate OTP
                }
                break;
            case R.id.btn_login:
                String strOTP= edtEnterOtp.getText().toString().trim();
                if (TextUtils.isEmpty(strOTP)) {
                    Toast.makeText(this, "Please enter valid OTP", Toast.LENGTH_SHORT).show();
                } else {

                    //TODO Call API to Submit OTP & Login
                }

                break;

        }
    }
}

package com.grampanchayat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.grampanchayat.R;
import com.grampanchayat.utils.UserPreferences;

/**
 * Created by SUHAS on 25/05/2016.
 */
public class LoginScreenActivity extends AppCompatActivity implements View.OnClickListener {
//    private Spinner spVillage;
    private EditText edtMobileNumber;
//    private String[] DayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private EditText edtEnterOtp;
    private Button btnLogin;
    private Button btnGenerateOTP;
    private LinearLayout llGenerateOTP;
    private LinearLayout llSubmitOTP;
    private TextView txtResendOTP;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_layout);
        init();
    }

    private void init() {
//        spVillage = (Spinner) findViewById(R.id.sp_village);
        edtMobileNumber = (EditText) findViewById(R.id.edt_username);
        edtEnterOtp = (EditText) findViewById(R.id.edt_enter_otp);
        txtResendOTP = (TextView) findViewById(R.id.txt_resend_otp);

        btnGenerateOTP = (Button) findViewById(R.id.btn_generate_otp);
        btnLogin = (Button) findViewById(R.id.btn_login);

        llGenerateOTP = (LinearLayout) findViewById(R.id.ll_generate_otp);
        llSubmitOTP = (LinearLayout) findViewById(R.id.ll_submit_otp);

        boolean isLoggedIn = UserPreferences.getInstance(this).isUserLogin();
        if (isLoggedIn) {
            llGenerateOTP.setVisibility(View.GONE);
            llSubmitOTP.setVisibility(View.VISIBLE);
//            txtResendOTP.setVisibility(View.VISIBLE);

        } else {
            llGenerateOTP.setVisibility(View.VISIBLE);
            llSubmitOTP.setVisibility(View.GONE);
//            txtResendOTP.setVisibility(View.GONE);
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.sp_village_item, R.id.txt_village, DayOfWeek);
//        spVillage.setAdapter(adapter);

        edtMobileNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    getOTPToLogin();
                }
                return false;
            }
        });

        edtEnterOtp.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    submitOTP();
                }
                return false;
            }
        });

        btnGenerateOTP.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        txtResendOTP.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_generate_otp:
                    getOTPToLogin();
                break;
            case R.id.btn_login:
                submitOTP();
                break;
            case R.id.txt_resend_otp:
                llGenerateOTP.setVisibility(View.VISIBLE);
                llSubmitOTP.setVisibility(View.GONE);
//                txtResendOTP.setVisibility(View.GONE);
                break;
        }
    }

    private void getOTPToLogin() {
        String mobileNumber = edtMobileNumber.getText().toString().trim();
        if (TextUtils.isEmpty(mobileNumber)) {
            Toast.makeText(this, "Please enter mobile number", Toast.LENGTH_SHORT).show();
        }else if (mobileNumber.length()!= 10) {
            Toast.makeText(this, "Please enter valid mobile number", Toast.LENGTH_SHORT).show();
        }  else {

            //TODO Call API to Generate OTP
            llGenerateOTP.setVisibility(View.GONE);
            llSubmitOTP.setVisibility(View.VISIBLE);
        }
    }
    private void submitOTP(){
        String strOTP = edtEnterOtp.getText().toString().trim();
        if (TextUtils.isEmpty(strOTP)) {
            Toast.makeText(this, "Please enter valid OTP", Toast.LENGTH_SHORT).show();
        } else {
            UserPreferences.getInstance(this).saveUserInfo("",true);
            //TODO Call API to Submit OTP & Login
            Intent intent = new Intent(LoginScreenActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
    }
}

package com.example.jain.rotaryhospital.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.jain.rotaryhospital.DoctorsActivity;
import com.example.jain.rotaryhospital.FormActivity;
import com.example.jain.rotaryhospital.LoginActivity;
import com.example.jain.rotaryhospital.R;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void DoctorsAvailable(View view) {
        Intent intent = new Intent(HomeActivity.this, DoctorsActivity.class);
        startActivity(intent);
    }

    public void BookAppointment(View view) {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}

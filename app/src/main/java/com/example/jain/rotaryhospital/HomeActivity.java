package com.example.jain.rotaryhospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

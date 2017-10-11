package com.example.jain.rotaryhospital;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String msg = getString(R.string.info_msg);
        builder.setMessage(msg).setCancelable(
                false).setPositiveButton(getString(R.string.ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        startActivity(new Intent(HomeActivity.this, HomeActivity.class));
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();*/


    }

    public void DoctorsAvailable(View view) {
        Intent intent = new Intent(HomeActivity.this, DoctorsActivity.class);
        startActivity(intent);
    }

    public void BookAppointment(View view) {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);

    }

    public void InfoAlert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String msg = getString(R.string.info_alert_title)+ getString(R.string.info_alert_msg);
        builder.setMessage(msg).setCancelable(
                false).setPositiveButton(getString(R.string.ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent= new Intent(HomeActivity.this, HomeActivity.class);
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


}

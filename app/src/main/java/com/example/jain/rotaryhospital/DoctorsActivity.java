package com.example.jain.rotaryhospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DoctorsActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        ListView doctorsList= (ListView)findViewById(R.id.listViewDoctors);

        ArrayList<String> names= new ArrayList<>();
        names.add("Dr. Kailash Gupta");
        names.add("Dr. Satinder Pal");
        names.add("Dr. Kanak Anand");
        names.add("Dr. Manika Singh");
        names.add("Dr. Kalindi Khera");

        ArrayList<String> qualification= new ArrayList<>();
        qualification.add("MBBS(Skin specialist)");
        qualification.add("MBBS(heart specialist)");
        qualification.add("MBBS(ENT specialist)");
        qualification.add("MBBS(gynecologist)");
        qualification.add("MBBS(pediatrician)");


        ArrayList<String> availability= new ArrayList<>();
        availability.add("Thursday(11:00am to 2:00pm)");
        availability.add("Wednesday(11:00am to 2:00pm)");
        availability.add("Monday-Sunday(11:00am to 1:00pm)");
        availability.add("Monday-Sunday(11:00am to 1:00pm)");
        availability.add("Friday(11:00am to 2:00pm)");

        doctorsBaseAdapter adp=new doctorsBaseAdapter(this,names,qualification,availability);
        doctorsList.setAdapter(adp);

    }
}

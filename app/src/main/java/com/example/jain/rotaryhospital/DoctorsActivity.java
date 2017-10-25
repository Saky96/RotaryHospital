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
        names.add("Dr. Vijay Bansal");
        names.add("Dr. Varun Goel");
        names.add("Dr. S K Mathur");
        names.add("Dr. S Gupta");
        names.add("Dr. Rahul Trehan");
        names.add("Dr. Ajay Goel");
        names.add("Dr. Tushar Gupta");
        names.add("Dr. Ravinder Goyal");
        names.add("Dr. R K Tiwari");
        names.add("Dr. D Chaudhary");
        names.add("Dr. Sumit Gupta");
        names.add("Dr. Surinder Makkar");
        names.add("Dr. Samriti gupta");
        names.add("Dr. Tushar Gupta (A)");
        names.add("Dr. M K Gupta");
        names.add("Dr. Veni Mittal");
        names.add("Dr. Neha Pathania");
        names.add("Dr. Arjun");
        names.add("Dr. Krishan khudawla");
        names.add("Dr. Rahul Suri");
        names.add("Dr. Rajesh Gupta");
        names.add("Dr. Vandana Goyal");
        names.add("Dr. Abhishek Bhushan (A)");
        names.add("Dr. Hambir Majumdar");
        names.add("Dr. Mayank");
        names.add("Dr. Bhim Sen Kapoor");
        names.add("Dr. Taranjot Singh");
        names.add("Dr. Avtaar Singh Matharoo");
        names.add("Dr. Varun singla");
        names.add("Dr. Mudita Dhingra");
        names.add("Dr. Manish Singla");
        names.add("Dr. Shashi Joshi");
        names.add("Dr. Parvinder Singh");
        names.add("Dr. Sunita Sharma");
        names.add("Dr. Arjun Shankar");
        names.add("Dr. Kuljinder Sodhi");
        names.add("Dr. Rachna Sharma");

        ArrayList<String> qualification= new ArrayList<>();
        qualification.add("ENT specialist");
        qualification.add("Medicine specialist");
        qualification.add("Endocrinologist");
        qualification.add("Dermatologist");
        qualification.add("Cardiologist");
        qualification.add("Nephrologist");
        qualification.add("Orthopaedic Surgeon");
        qualification.add("Gastroenterologist");
        qualification.add("Nuerosurgeon");
        qualification.add("Urologist");
        qualification.add("Radiologist");
        qualification.add("Cosmetic and plastic Surgeon");
        qualification.add("MBBS");
        qualification.add("Orthopaedic");
        qualification.add("Surgeon");
        qualification.add("Gynaecologist");
        qualification.add("Dietician");
        qualification.add("MBBS");
        qualification.add("ENT Surgeon");
        qualification.add("MBBS");
        qualification.add("Psychiatrist");
        qualification.add("Pathologist");
        qualification.add("General Surgeon");
        qualification.add("Medicine Specialist");
        qualification.add("MBBS");
        qualification.add("MBBS");
        qualification.add("MBB)");
        qualification.add("Pain Management Specialist");
        qualification.add("Plastic Surgeon");
        qualification.add("Pediatrician");
        qualification.add("Urologist");
        qualification.add("MD, OBS and Gyane");
        qualification.add("Gastroenterologist");
        qualification.add("Dietician");
        qualification.add("Physiotherapist");
        qualification.add("Cancer specialist");
        qualification.add("MBBS");


        doctorsBaseAdapter adp=new doctorsBaseAdapter(this,names,qualification);
        doctorsList.setAdapter(adp);

    }
}

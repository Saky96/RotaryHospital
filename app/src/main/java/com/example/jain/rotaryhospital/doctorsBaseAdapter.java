package com.example.jain.rotaryhospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jain on 7/19/2017.
 */

public class doctorsBaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> doctorNameList;
    ArrayList<String> doctorQualificationList;
    ArrayList<String> doctorAvailabilityList;

    doctorsBaseAdapter(Context ctx, ArrayList<String> NamesList, ArrayList<String> QualificationList,ArrayList<String> AvailablilityList) {
        context = ctx;
        doctorNameList = NamesList;
        doctorQualificationList = QualificationList;
        doctorAvailabilityList=AvailablilityList;
    }

    @Override
    public int getCount() {
        return doctorNameList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.doctors_view, null);

        TextView tvName = (TextView) view.findViewById(R.id.textViewDoctorsName);
        String sampleName = doctorNameList.get(position);
        tvName.setText(sampleName);

        TextView tvQuali = (TextView) view.findViewById(R.id.textViewDoctorsQualification);
        String sampleQuali = doctorQualificationList.get(position);
        tvQuali.setText(sampleQuali);

        TextView tvAvailability = (TextView) view.findViewById(R.id.textViewDoctorsAvailability);
        String sampleAvailibility = doctorAvailabilityList.get(position);
        tvAvailability.setText(sampleAvailibility);

        return view;
    }
}

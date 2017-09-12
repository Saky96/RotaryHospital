package com.example.jain.rotaryhospital;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TimePicker;

public class BookAppointmentFragment extends Fragment {

    Spinner doclist;
    String[] items;

    public BookAppointmentFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       /* doclist = (Spinner) findViewById(R.id.SpinnerBookAppointmentFragmentDoctorList);
        items = new String[]{"Dr. Kailash Gupta", "Dr. Satinder Pal", "Dr. Kanak Anand", "Dr. Manika Singh", "Dr. Kalindi Khera"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(BookAppointmentFragment.this, android.R.layout.simple_spinner_dropdown_item, items);
        doclist.setAdapter(adapter); */

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.book_appointment_fragment, container, false);

        //?? problem here in getting context
       /* LayoutInflater inflater1= (LayoutInflater) getParentFragment().getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater1.inflate(R.layout.spinner_view, container, false);
        items = new String[]{"Dr. Kailash Gupta", "Dr. Satinder Pal", "Dr. Kanak Anand", "Dr. Manika Singh", "Dr. Kalindi Khera"};
        Spinner doclistspinner = (Spinner) v.findViewById(R.id.SpinnerBookAppointmentFragmentDoctorList);
        ArrayAdapter<String> adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item, items);
        doclistspinner.setAdapter(adapter);
        return v;*/
    }

    /*public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

    }*/
}


package com.example.jain.rotaryhospital;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

public class BookAppointmentFragment extends Fragment {

    Spinner doclist;
    String[] items;
    EditText etDate;
    int mYear;
    int mMonth;
    int mDay;

    public BookAppointmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.book_appointment_fragment, container, false);

    }

/*
    yourEditText.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View v) {
            //To show current date in the datepicker
            Calendar mcurrentDate=Calendar.getInstance();
            mYear=mcurrentDate.get(Calendar.YEAR);
            mMonth=mcurrentDate.get(Calendar.MONTH);
            mDay=mcurrentDate.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog mDatePicker=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
                    *//*      Your code   to get date and time    *//*
                }
            },mYear, mMonth, mDay);
            mDatePicker.setTitle("Select date");
            mDatePicker.show();  }
    });*/

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        doclist = (Spinner) getActivity().findViewById(R.id.SpinnerBookAppointmentFragmentDoctorList);
        items = new String[]{"Dr. Kailash Gupta (Skin specialist)", "Dr. Satinder Pal (heart specialist)", "Dr. Kanak Anand (ENT specialist)", "Dr. Manika Singh (gynecologist)", "Dr. Kalindi Khera (pediatrician)"};
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, items);
        doclist.setAdapter(adapter);

    }
}


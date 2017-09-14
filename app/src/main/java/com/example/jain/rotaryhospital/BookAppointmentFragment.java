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

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookAppointmentFragment extends Fragment {

    Spinner doclist;
    DatePicker pickerDate;
    TimePicker pickerTime;

    public BookAppointmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.book_appointment_fragment, container, false);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        doclist = (Spinner) getActivity().findViewById(R.id.SpinnerBookAppointmentFragmentDoctorList);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Doctor_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        doclist.setAdapter(adapter);


        pickerDate = (DatePicker) getActivity().findViewById(R.id.datePickerBookAppointmentFragmentDate);
        pickerTime = (TimePicker) getActivity().findViewById(R.id.timePickerBookAppointmentFragmentTime);
        java.util.Calendar calender = java.util.Calendar.getInstance();
        calender.clear();
        calender.set(java.util.Calendar.MONTH, pickerDate.getMonth());
        calender.set(java.util.Calendar.DAY_OF_MONTH, pickerDate.getDayOfMonth());
        calender.set(java.util.Calendar.YEAR, pickerDate.getYear());
        calender.set(java.util.Calendar.HOUR, pickerTime.getCurrentHour());
        calender.set(java.util.Calendar.MINUTE, pickerTime.getCurrentMinute());
        calender.set(java.util.Calendar.SECOND, 00);

        SimpleDateFormat formatter = new SimpleDateFormat(getString(R.string.hour_minutes));
        String timeString = formatter.format(new Date(calender.getTimeInMillis()));
        SimpleDateFormat dateformatter = new SimpleDateFormat(getString(R.string.dateformate));
        String dateString = dateformatter.format(new Date(calender.getTimeInMillis()));

        /* The variables timeString and dateString are to be used in the database...refer memo app Activity_create_note*/

    }
}


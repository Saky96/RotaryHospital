package com.example.jain.rotaryhospital;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyProfileFragment extends Fragment {

    TextView textViewUserName;
    TextView textViewFatherName;
    TextView textViewAge;
    TextView textViewEmail;
    TextView textViewPassword;
    TextView textViewGender;
    TextView textViewAddress;
    TextView textViewPhoneNumber;





    public MyProfileFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.my_profile_fragment, container, false);

        textViewUserName=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredUserName);
        textViewFatherName=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredFatherName);
        textViewAge=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredAge);
        textViewEmail=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredEmail);
        textViewPassword=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredPassword);
        textViewAddress=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredAddress);
        textViewPhoneNumber=(TextView)view.findViewById(R.id.textViewMyProfileFragmentEnteredPhoneNumber);



        return view;


    }
}

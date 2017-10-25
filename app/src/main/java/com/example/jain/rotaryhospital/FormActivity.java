package com.example.jain.rotaryhospital;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static java.lang.Integer.parseInt;

public class FormActivity extends AppCompatActivity {


    ProgressDialog progress;

    RadioGroup radioGroup;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    RadioButton radioButtonOther;

    private Button register;
    private EditText usernameInput;
    private EditText fatherNameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText addressInput;
    private EditText phoneInput;


    private RadioButton genderInput;

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mAuth = FirebaseAuth.getInstance();

        radioGroup = (RadioGroup) findViewById(R.id.radioButtonGroupForm);
        radioButtonMale = (RadioButton) findViewById(R.id.radioButtonFormMale);
        radioButtonFemale = (RadioButton) findViewById(R.id.radioButtonFormFemale);
        radioButtonOther = (RadioButton) findViewById(R.id.radioButtonFormOther);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.radioButtonFormMale) {
                    clearRadioChecked();
                    radioButtonMale.setChecked(true);

                } else if (checkedId == R.id.radioButtonFormFemale) {
                    clearRadioChecked();
                    radioButtonFemale.setChecked(true);

                } else if (checkedId == R.id.radioButtonFormOther) {
                    clearRadioChecked();
                    radioButtonOther.setChecked(true);

                }
            }
        });

        register = (Button) findViewById(R.id.buttonFormRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameInput = (EditText) findViewById(R.id.editTextFormName);
                fatherNameInput = (EditText) findViewById(R.id.editTextFormFathersName);
                emailInput = (EditText) findViewById(R.id.editTextFormEmail);
                passwordInput = (EditText) findViewById(R.id.editTextFormPassword);
                addressInput = (EditText) findViewById(R.id.editTextFormAddress);
                phoneInput = (EditText) findViewById(R.id.editTextFormTelephoneNumber);


                int id=radioGroup.getCheckedRadioButtonId();
                genderInput=(RadioButton)findViewById(id);



                String getUsername = usernameInput.getText().toString().trim();
                String getFatherName = fatherNameInput.getText().toString().trim();
                String getEmail = emailInput.getText().toString().trim();
                String getPassword = passwordInput.getText().toString().trim();
                String getAddress = addressInput.getText().toString().trim();

                String getGender=genderInput.getText().toString().trim();
                Toast.makeText(FormActivity.this,getGender,Toast.LENGTH_SHORT).show();

                String getphone = phoneInput.getText().toString().trim();

                if(TextUtils.isEmpty(getUsername)||TextUtils.isEmpty(getFatherName)||TextUtils.isEmpty(getEmail)||TextUtils.isEmpty(getPassword)||TextUtils.isEmpty(getAddress)||TextUtils.isEmpty(getphone)){
                    Toast.makeText(FormActivity.this,"Details must be flled correctly",Toast.LENGTH_SHORT).show();
                }
                else if(!LoginActivity.isEmailValid(getEmail)){
                    Toast.makeText(FormActivity.this,"Please enter valid email id",Toast.LENGTH_SHORT).show();

                }
                else if(!LoginActivity.isPasswordValid(getPassword))
                {
                    Toast.makeText(FormActivity.this,"Password should have minimum 6 characters",Toast.LENGTH_SHORT).show();
                }
                else {
                    callSignup(getEmail, getPassword);
                }







                progress = new ProgressDialog(FormActivity.this);
                progress.setTitle("Registration Process Running!!");
                progress.setMessage("Please Wait !!");
                progress.setCancelable(true);
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.show();
                /*Intent registerIntent = new Intent(FormActivity.this,LoginActivity.class);
                startActivity(registerIntent);*/

            }
        });
    }


    public void clearRadioChecked() {
        radioButtonMale.setChecked(false);
        radioButtonFemale.setChecked(false);
        radioButtonOther.setChecked(false);
    }

    private void callSignup(String email,String password)
    {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("Testing", "createUserWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            progress.dismiss();
                            Toast.makeText(FormActivity.this, "Registration Failed",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else {
                            RegistrationDetails details = new RegistrationDetails();
                            details.setUserName(usernameInput.getText().toString().trim());
                            details.setFatherName(fatherNameInput.getText().toString().trim());
                            details.setEmail(emailInput.getText().toString().trim());
                            details.setPassword(passwordInput.getText().toString().trim());
                            details.setAddress(addressInput.getText().toString().trim());
                            details.setPhoneNo(parseInt(phoneInput.getText().toString().trim()));
                            details.setGender(genderInput.getText().toString().trim());
                            DatabaseReference myRef = database.getReference("details");
                            myRef.child(myRef.push().getKey()).setValue(details);
                            startActivity(new Intent(FormActivity.this, LoginActivity.class));
                            Toast.makeText(FormActivity.this, "your Account created sucessfully",
                                    Toast.LENGTH_SHORT).show();
                        }



                        // ...
                    }
                });
    }

}



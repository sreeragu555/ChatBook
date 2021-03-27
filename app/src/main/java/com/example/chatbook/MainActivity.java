package com.example.chatbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText mEdit=(EditText) findViewById(R.id.editTextPhone);
        ImageButton btnAdd = (ImageButton) findViewById(R.id.imageButton);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"You have entered the mobile number",Toast.LENGTH_SHORT).show();
                //startPhoneNumberVerification(mEdit.getText().toString());
                Intent intent = new Intent(MainActivity.this, PhoneCodeAuth.class);
                intent.putExtra("mobile", mEdit.getText().toString().trim());
                startActivity(intent);
            }
        });
    }


//    private FirebaseAuth mAuth;
//
////   Next.setOnClickListener(new View.OnClickListener() {
////        public void onClick(View v) {
//
//
//
//    //  Toast.makeText(getApplicationContext(),"You have entered the mobile number",Toast.LENGTH_SHORT).show();
}
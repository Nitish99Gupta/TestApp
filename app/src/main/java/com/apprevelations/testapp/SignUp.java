package com.apprevelations.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);


    }

    public void signup(View v){
        Toast.makeText(this, "Next", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);



    }



}

package com.platzi.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.platzigram.view.CreateAcountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login)  ;
    }

    public void goCreateAccount(View view)
    {
        Intent intent = new Intent(LoginActivity.this, CreateAcountActivity.class); /*en donde estoy y a donde voy en este caso voy de LonguinActivity a CreateAccountActivity*/
        startActivity(intent);

    }
}

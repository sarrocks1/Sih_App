package com.win.sihapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;

public class LoginActivity extends AppCompatActivity {
EditText edtemaillg,edtpasslg;
Button btnlogin;
String email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtemaillg=findViewById(R.id.edtemaillg);
        edtpasslg=findViewById(R.id.edtpasslg);
        btnlogin=findViewById(R.id.btnlogin);

         email = edtemaillg.getText().toString();
         pass =edtpasslg.getText().toString();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.equals("sih@gmail.com")&&pass.equals("12345678"))
                {
                    Intent intent = new Intent(LoginActivity.this,VendorLogin.class);
                    startActivity(intent);
                }

            }
        });




    }
}

package com.win.sihapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class VendorLogin extends AppCompatActivity {
    private ListView lv;
    ArrayAdapter<String> arrayAdapter;
    EditText search;
    Button mapbtn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_vendor);

        mapbtn = findViewById(R.id.mapbtn);
        String places[] ={"VidhanSabha","VidhanParishad","Income Tax Department,Pune","Income Tax Department,Mumbai","Iker Vibhag,Nagpur","PWD,Nagpur","PWD,Pune",
                "PWD,Mumbai","PWD,Kolhapur","LokSabha","RajyaSabha","Dept. of Higher Education","District Court ,Pune","High Court, Mumbai","Supreme Court"};
        lv = (ListView)findViewById(R.id.list_view);
        search = (EditText)findViewById(R.id.inputSearch);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.place_name, places);
        lv.setAdapter(arrayAdapter);
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VendorLogin.this,MapActivity.class);
                startActivity(i);
                finish();
            }
        });
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                VendorLogin.this.arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

package com.example.vehiclebookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    String[] countries={"Palasa","Pathapatnam","Paralakhemundi","Uppalada","Tekkali","Srikakulum","Forest Gate","Centurion University"};
    String[] c1={"Palasa","Pathapatnam","Paralakhemundi","Uppalada","Tekkali","Srikakulum","Forest Gate","Centurion University"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1;

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,countries);
        AutoCompleteTextView textView=(AutoCompleteTextView)findViewById(R.id.act1);

        textView.setThreshold(1);
        textView.setAdapter(adapter);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,c1);
        AutoCompleteTextView textView2=(AutoCompleteTextView)findViewById(R.id.act2);
        textView.setThreshold(1);
        textView.setAdapter(adapter1);

        b1=findViewById(R.id.Boo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Booked.class);
                startActivity(intent);
            }
        });
    }
}
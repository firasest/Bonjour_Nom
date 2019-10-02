package com.frk.localisation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView.findviewById(R.id.textViewNom);
        editText.findViewById(R.id.EditTextNom);
        button.findViewById(R.id.ButtonEnvoyer);

        button.setOnclickListener(new View.OnClickListener(){

        });
    }
}

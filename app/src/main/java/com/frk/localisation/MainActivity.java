package com.frk.localisation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView.findViewById(R.id.TextViewBonjour);
        editText.findViewById(R.id.EditTextNom);
        button.findViewById(R.id.ButtonEnvoyer);
        button.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            String message = getResources().getString(R.string.message) + "" + editText.getText() + ",";
            textView.setText(message);

        }
    });

    }
}

package com.naoyaapp.staminamanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnKakunin = findViewById(R.id.btnKakunin);
        btnKakunin.setOnClickListener(buttonClick);
    }

    private View.OnClickListener buttonClick = new View.OnClickListener() {
        //final EditText staminaAll = findViewById(R.id.staminaAll);
        //final EditText staminaZan = findViewById(R.id.staminaZan);
        //final TextView txtStamina = findViewById(R.id.txtStamina);
        @Override
        public void onClick(View view){
            //txtStamina.setText(Integer.parseInt(staminaAll.getText().toString())  - Integer.parseInt(staminaZan.getText().toString()));
        }
    };
}
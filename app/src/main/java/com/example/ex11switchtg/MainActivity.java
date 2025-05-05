package com.example.ex11switchtg;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {


    private ConstraintLayout mainLayout;
    private RadioGroup radioGroup;
    private Button btnChange;
    private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.main);
        radioGroup = findViewById(R.id.radioGroup);
        btnChange = findViewById(R.id.btnChange);
        mySwitch = findViewById(R.id.mySwitch);
    }
}

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
        // Case 1: If the switch is ON, background changes immediately on radio button selection
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mySwitch.isChecked()) {
                    changeBackgroundColor(checkedId);
                }
            }
        });

        // Case 2: If the switch is OFF, background changes only when button is clicked
        btnChange.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if (!mySwitch.isChecked()) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    changeBackgroundColor(selectedId);
                }
            }
        });
    }
}

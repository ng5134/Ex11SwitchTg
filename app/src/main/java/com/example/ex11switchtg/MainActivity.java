package com.example.ex11switchtg;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
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
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mySwitch.isChecked()) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    changeBackgroundColor(selectedId);
                }
            }
        });
    }

    //changes the background color based on selected radio button
    private void changeBackgroundColor(int radioId) {
        if (radioId == R.id.radioRed) {
            mainLayout.setBackgroundColor(Color.RED);
        }
        else if (radioId == R.id.radioBlue) {
            mainLayout.setBackgroundColor(Color.BLUE);
        }
        else if (radioId == R.id.radioGreen) {
            mainLayout.setBackgroundColor(Color.GREEN);
        }
        else if (radioId == R.id.radioYellow) {
            mainLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}

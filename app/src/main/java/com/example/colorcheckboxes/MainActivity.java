package com.example.colorcheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox redCheckBox, greenCheckBox, blueCheckBox;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redCheckBox = findViewById(R.id.redCheckBox);
        greenCheckBox = findViewById(R.id.greenCheckBox);
        blueCheckBox = findViewById(R.id.blueCheckBox);
        textView = findViewById(R.id.textView);

        // Set initial background color
        updateBackgroundColor();

        // Set checkbox listeners
        redCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBackgroundColor();
            }
        });

        greenCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBackgroundColor();
            }
        });

        blueCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBackgroundColor();
            }
        });
    }

    private void updateBackgroundColor() {
        int backgroundColor = 0;

        if (redCheckBox.isChecked()) {
            backgroundColor += Color.RED;
        }

        if (greenCheckBox.isChecked()) {
            backgroundColor += Color.GREEN;
        }

        if (blueCheckBox.isChecked()) {
            backgroundColor += Color.BLUE;
        }

        textView.setBackgroundColor(backgroundColor);

        // Invert text color to match background
        int invertedColor = getInvertedColor(backgroundColor);
        textView.setTextColor(invertedColor);
    }

    private int getInvertedColor(int color) {
        int r = 255 - Color.red(color);
        int g = 255 - Color.green(color);
        int b = 255 - Color.blue(color);
        return Color.rgb(r, g, b);
    }
}
package com.example.rainbowcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private othercolors others = new othercolors();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickChooseColor(View view){
        TextView raincolors = (TextView) findViewById(R.id.raincolors);
        Spinner colors = (Spinner) findViewById(R.id.color);
        String colorType = String.valueOf(colors.getSelectedItem());

        List<String> otherList = others.getothers(colorType);
        StringBuilder colorsFormatted = new StringBuilder();
        for (String color : otherList) {
            colorsFormatted.append(color).append('\n');

        }
        //raincolors.setText(colorsFormatted);
        raincolors.setText(colorType);

    }
}

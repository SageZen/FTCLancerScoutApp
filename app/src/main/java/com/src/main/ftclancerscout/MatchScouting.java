package com.src.main.ftclancerscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatchScouting extends AppCompatActivity {
    int depotVal = 0;
    int GoldValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_scouting);

        Button DepotAdd = findViewById(R.id.DepotPlus);
        Button DepotMinus = findViewById(R.id.DepotSubtract);
        final Button GoldAdd = findViewById(R.id.GoldPlus);
        Button GoldMinus = findViewById(R.id.GoldSubtract);

        final TextView DepotText = findViewById(R.id.DepotValue);
        final TextView  GoldText = findViewById(R.id.GoldAmount);

        DepotAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            depotVal++;
            String  number = Integer.toString(depotVal);
            DepotText.setText(number);
            }
        });
        DepotMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                depotVal--;
                String  number = Integer.toString(depotVal);
                DepotText.setText(number);

                if(depotVal < 0){
                    depotVal = 0;
                    number = "0";
                    DepotText.setText(number);
                }
            }
        });

        GoldAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoldValue++;
                String  number = Integer.toString(GoldValue);
                GoldText.setText(number);
            }
        });
        GoldMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GoldValue--;
                String  number = Integer.toString(GoldValue);
                GoldText.setText(number);

                if(GoldValue < 0){
                    GoldValue = 0;
                    number = "0";
                    GoldText.setText(number);
                }
            }
        });
    }
}


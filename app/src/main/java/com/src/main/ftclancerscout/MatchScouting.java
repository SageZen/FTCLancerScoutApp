package com.src.main.ftclancerscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatchScouting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_scouting);

         Button DepotAdd = findViewById(R.id.DepotPlus);

        DepotAdd.setOnClickListener(new View.OnClickListener() {
            TextView DepotValue = findViewById(R.id.DepotValue);
            int depotVal = 0;

            @Override
            public void onClick(View v) {
                DepotValue.setText(depotVal++);
            }
        });
    }
}

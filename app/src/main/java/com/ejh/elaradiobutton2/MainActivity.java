package com.ejh.elaradiobutton2;

import static android.util.Log.d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rdoGroup;
    private RadioButton radioButton; //stand-in

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoGroup=findViewById(R.id.rdoGroup);

        rdoGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId)
            {
              radioButton=findViewById(checkedId);
                switch (radioButton.getId())
                {
                    case R.id.rdoBlue:
                        Log.d("RDO", "Blue");
                    break;
                    case R.id.rdoGreen:
                            Log.d("RDO", "Green");
                        break;
                }
            }
        });
    }
}
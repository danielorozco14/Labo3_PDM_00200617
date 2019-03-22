package com.example.labo3_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_pdm.utils.AppConstants;

public class Activity_Two extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__two);

        mText=findViewById(R.id.txt_activityTwo);
        Intent mIntent = this.getIntent();
        if (mIntent!=null){
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}

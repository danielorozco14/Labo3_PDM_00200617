package com.example.labo3_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView mtextViewShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        mtextViewShared=findViewById(R.id.text_shareActivity);
        Intent mIntent = getIntent();





        if (mIntent!=null) {
            mtextViewShared.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}

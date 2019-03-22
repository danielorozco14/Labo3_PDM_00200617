package com.example.labo3_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.labo3_pdm.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.bt_main);
        mButtonShare=findViewById(R.id.bt2_main);
        mButton.setOnClickListener(v->{
            Intent mIntent= new Intent(MainActivity.this, Activity_Two.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,"Hola, Activity Two!");
            startActivity(mIntent);
        });

        mButtonShare.setOnClickListener(v -> {
            Intent mIntenr= new Intent();
            mIntenr.setAction(Intent.ACTION_SEND);
            mIntenr.setType("text/plain");
            mIntenr.putExtra(Intent.EXTRA_TEXT, "HEE HEEE!!");
            startActivity(mIntenr);
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG," On Pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG," On Stop");
    }


}

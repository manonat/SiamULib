package com.virtualsiamu.siamulib;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void siamulibcilck (View view){
        Intent  siamulibIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.virtualsiamu.com/siamulib"));
        startActivity(siamulibIntent);
    }

}

package com.virtualsiamu.siamulib;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //เริ่ม
        ScrollView scrollView_contentsmain = (ScrollView) findViewById(R.id.scrollablecontents);
        getLayoutInflater().inflate(R.layout.manicontents, scrollView_contentsmain);

    }



    public void siamulibcilck (View view){
        Intent  siamulibIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.siamulibapp.virtualsiamu.com/"));
        startActivity(siamulibIntent);
    }
    public void recbookclick (View view){
        Intent recbookclick = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xxx.com"));
        startActivity(recbookclick);
    }

}

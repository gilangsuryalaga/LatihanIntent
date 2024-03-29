package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button explicitintent;
Button implicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitcontent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitcontent);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitcontent:
                Intent explicit = new Intent(MainActivity.this, IntenActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitcontent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3achool.com"));
                startActivity(implicit);
                break;
                default:
                    break;
        }
    }
}

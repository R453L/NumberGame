package com.example.rasel.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String lifecycle_tag = "Activity_Lifecycle";

    private void showLog(String text){
        Log.d(lifecycle_tag,text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getApplicationContext(),"Login success!",Toast.LENGTH_SHORT).show();

        showLog("Activity Created");
        setContentView(R.layout.activity_main);
    }
}

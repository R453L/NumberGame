package com.example.rasel.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class radio extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        sp1=findViewById(R.id.sp1);

        String numbers[] = getResources().getStringArray(R.array.arr);
        ArrayAdapter<String> adapterobj = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,R.id.sp1,numbers);
        adapterobj.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapterobj);

        sp1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
            Toast.makeText(this, "first is selected", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "something is selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

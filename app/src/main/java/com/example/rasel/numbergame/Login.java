package com.example.rasel.numbergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btn_login;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = findViewById(R.id.userid);
                pass = findViewById(R.id.passwd);

                String struser= user.getText().toString();
                String strpass= pass.getText().toString();

                if(struser.equals(strpass) && !strpass.isEmpty()){
                    Intent i=new Intent(Login.this,MainActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Login failed!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

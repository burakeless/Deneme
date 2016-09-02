package com.example.burak.deneme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by burak on 02.09.2016.
 */
public class LoginActivity extends AppCompatActivity {

    EditText ed1,ed2;
    ImageView iv1, iv2;
    TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        iv1=(ImageView)findViewById(R.id.imageView2);
        iv2=(ImageView)findViewById(R.id.imageView3);
        tv1=(TextView) findViewById(R.id.textView1);
        tv2=(TextView) findViewById(R.id.textView2);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(ed1.getText().toString().equals("admin") &&

                    ed2.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
            else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }

    });

        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });



    }
}

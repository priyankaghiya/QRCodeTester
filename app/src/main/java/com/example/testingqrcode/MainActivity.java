package com.example.testingqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{
    EditText etcode;
    Button btgen,btscan;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etcode=findViewById(R.id.etCode);
        btgen=findViewById(R.id.btnCreate);
        btscan=findViewById(R.id.btnScan);


        btgen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String code=etcode.getText().toString();

                Intent i1=new Intent(getApplicationContext(),QRCodeGenerate.class);
                i1.putExtra("QRCode",code);
                startActivity(i1);

            }
        });

        btscan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }
}
package com.example.testingqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRCodeScanner extends Activity implements ZXingScannerView.ResultHandler
{
    ZXingScannerView scanView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_q_r_code_scanner);

        scanView=new ZXingScannerView(getApplicationContext()); //this will open the camera
        setContentView(scanView);

        scanView.setResultHandler(this);// the camera app
        //for starting the camera
        scanView.startCamera();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        scanView.stopCamera(); //for stoping the camera after reading the hiddden msg
    }

    @Override
    public void handleResult(Result rawResult)
    {
        Toast.makeText(getApplicationContext(),"CODE : "+rawResult.getText(),Toast.LENGTH_LONG).show();

    }
}
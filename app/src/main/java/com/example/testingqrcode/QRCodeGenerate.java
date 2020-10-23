package com.example.testingqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerate extends AppCompatActivity
{

    ImageView iv;
    QRCodeWriter writer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_r_code_generate);

        iv=findViewById(R.id.iv);

        Intent i1=getIntent();
        String code=i1.getStringExtra("QRCode");

        writer=new QRCodeWriter();
        try
        {
            //generates 2D matrix
            BitMatrix bm=writer.encode(code, BarcodeFormat.QR_CODE,512,512);//this will hide our text and generate ann image i the true flase for that is biary image will be genarated

            int width=512;
            int height=512;

            Bitmap bmp=Bitmap.createBitmap(width,height,Bitmap.Config.RGB_565); // this is blank canvas like image

            for(int x=0;x<width;x++)
            {
                for(int y=0;y<height;y++)
                {
                    if(bm.get(x,y)==false)
                    {
                        bmp.setPixel(x,y, Color.BLACK);
                    }
                    else
                    {
                        bmp.setPixel(x,y,Color.WHITE);
                    }
                }
            }
            iv.setImageBitmap(bmp);
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"qrcode generate error"+e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}
package com.example.andriod.singlescreenapp;

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
    public void sendConfideEmail (View view){
        // https://developer.android.com/guide/components/intents-filters#Types
        // https://developer.android.com/guide/components/intents-common.


        // send email with a mail app only
        Intent sendEmail = new Intent (Intent.ACTION_SENDTO);
        sendEmail.setData(Uri.parse("mailto:bonbonco@gmail.com"));
        //check if a device has a mailing app
        if(sendEmail.resolveActivity(getPackageManager())!=null){
            startActivity(sendEmail);
        }

    }
    public void openMap (View view){
        // https://developer.android.com/guide/components/intents-filters#Types
        // https://developer.android.com/guide/components/intents-common.

        Intent showConfideOnMap = new Intent (Intent.ACTION_VIEW);
        showConfideOnMap.setData(Uri.parse("geo:0,0?q=Mahatma Gandhi Marg+Lucknow+Uttar Pradesh"));
        //check if a device has an app that supports maps
        if (showConfideOnMap.resolveActivity(getPackageManager())!=null){
            startActivity(showConfideOnMap);
        }

    }
    public void dialConfide (View view){
        // https://developer.android.com/guide/components/intents-filters#Types
        // https://developer.android.com/guide/components/intents-common.


        //open a dialer on a user`s device
        Intent makeCall = new Intent (Intent.ACTION_DIAL);
        makeCall.setData(Uri.parse("tel:8299582995"));
        //check if a device has an app, which can handle intent
        if(makeCall.resolveActivity(getPackageManager())!=null){
            startActivity(makeCall);
        }

    }
}







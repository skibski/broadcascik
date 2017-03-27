package com.burzynski.jakub.broadcascik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by student on 27.03.2017.
 */

public class smsik extends AppCompatActivity {
    private int mMessageSentParts;
    private int mMessageSentTotalParts;
    private int mMessageSentCount;
    String SENT = "SMS_SENT";
    String Delivered = "SMS_DELIVERED";
    Button b10;
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms);

        b10 = (Button) findViewById(R.id.b10);
        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefon = e1.getText().toString();
                String wiadomosc = e2.getText().toString();
                sendSMS(telefon, wiadomosc);
            }
        });


    }
    private void sendSMS(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }



}



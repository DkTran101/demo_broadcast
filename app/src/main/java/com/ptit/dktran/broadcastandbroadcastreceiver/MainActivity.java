package com.ptit.dktran.broadcastandbroadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSend;
    private ReceiverClass broadcastReceiver;
    private IntentFilter intentFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @Override
    protected void onResume() {
        //registerReceiver(broadcastReceiver,intentFilter);
        super.onResume();
    }

    private void initViews() {
        tvSend = (TextView)findViewById(R.id.tv_send_broadcast);
        broadcastReceiver = new ReceiverClass();
        //intentFilter = new IntentFilter(Constant.ACTION_SEND_BROADCAST_DEMO);
        tvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Constant.ACTION_SEND_BROADCAST_DEMO);
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        //unregisterReceiver(broadcastReceiver);
        super.onPause();
    }
}

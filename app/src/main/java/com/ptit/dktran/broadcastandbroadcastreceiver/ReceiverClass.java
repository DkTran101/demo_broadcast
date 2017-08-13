package com.ptit.dktran.broadcastandbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by dktran on 8/12/2017.
 */
public class ReceiverClass extends BroadcastReceiver {
    public ReceiverClass() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("--------","Receiver good "+intent.getAction());
    }
}

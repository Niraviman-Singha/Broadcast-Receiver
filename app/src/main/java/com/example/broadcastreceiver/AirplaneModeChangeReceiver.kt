package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {


        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return


        if (isAirplaneModeEnabled) {

            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            // showing the toast message if airplane mode is disabled
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }

}
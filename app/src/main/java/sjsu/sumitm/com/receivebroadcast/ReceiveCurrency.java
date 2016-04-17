package sjsu.sumitm.com.receivebroadcast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveCurrency extends BroadcastReceiver {
    public static String msg;

    @Override
    public void onReceive(Context context, Intent intent) {
        msg = intent.getStringExtra("message");
        Toast.makeText(context, "Intent Received :" , Toast.LENGTH_LONG).show();
    }
}


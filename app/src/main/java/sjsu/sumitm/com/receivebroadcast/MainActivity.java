package sjsu.sumitm.com.receivebroadcast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void exitApp(View v){

        finish();
        System.exit(0);

    }



    @Override
    protected void onResume()
    {
        super.onResume();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }

    @Override
    protected void onPause()
    {
        super.onPause();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }
}

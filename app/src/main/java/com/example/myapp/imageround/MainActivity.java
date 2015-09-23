package com.example.myapp.imageround;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

//http://code.tutsplus.com/tutorials/android-user-interface-design-frame-layouts--mobile-4877
public class MainActivity extends ActionBarActivity {
    // http://stackoverflow.com/questions/6010231/android-configuring-click-listener-for-frame-layout
   TextView mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FrameLayout frame1=(FrameLayout) findViewById(R.id.frame1);
        final FrameLayout frame2=(FrameLayout) findViewById(R.id.frame2);
        final FrameLayout frame3=(FrameLayout) findViewById(R.id.frame3);

        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View mainLayout = findViewById(R.id.mainlayout);
                //View mainLayoutRoot = mainLayout.getRootView();
                //mainLayoutRoot.setBackgroundColor(Color.parseColor("#ffffff"));
                //mainLayoutRoot.setBackgroundColor(0xccffcccc);
                mainLayout.setBackgroundColor(0xff0000ff);
                mytext=(TextView)findViewById(R.id.mytext);
                mytext.setText("Clicked");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

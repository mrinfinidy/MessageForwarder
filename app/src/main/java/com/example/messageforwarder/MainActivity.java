package com.example.messageforwarder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get screen size
        int screenHeight = getScreenHeight();
        int screenWidth = getScreenWidth();

        //display layout
        TextView topBar = (TextView)findViewById(R.id.topBar);
        RelativeLayout.LayoutParams topBarParams = (RelativeLayout.LayoutParams)topBar.getLayoutParams();
        topBarParams.height = screenHeight / 6;
        topBar.setTextSize(screenHeight/(float)60);
    }

    private int getScreenHeight() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    private int getScreenWidth() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }
}

package com.example.messageforwarder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //display layout
        setTopBarLayout();
        //icons
        ImageView arrowRight = findViewById(R.id.arrow_right);
        ImageView whatsapp = findViewById(R.id.whatsappIcon);
        ImageView signal = findViewById(R.id.signalIcon);

        setForwardRuleLayout(arrowRight, whatsapp, signal);

        final Boolean optionsDisplayed = new Boolean(false);
        FloatingActionButton addForwardRuleBtn = findViewById(R.id.addForwardRule);
        addForwardRuleBtn.setOnClickListener(new ExternalOnClickListener(optionsDisplayed, arrowRight, whatsapp, signal));
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

    private void setTopBarLayout() {
        int screenHeight = getScreenHeight();
        TextView topBar = findViewById(R.id.topBar);
        RelativeLayout.LayoutParams topBarParams = (RelativeLayout.LayoutParams)topBar.getLayoutParams();
        topBarParams.height = screenHeight / 6;
        topBar.setTextSize(screenHeight/(float)60);
    }

    private void setForwardRuleLayout(ImageView arrowRight, ImageView whatsapp, ImageView signal) {
        /*
        int screenHeight = getScreenHeight();
        FloatingActionButton addForwardRule = (FloatingActionButton)findViewById(R.id.addForwardRule);
        RelativeLayout.LayoutParams addForwardRuleParams = (RelativeLayout.LayoutParams)addForwardRule.getLayoutParams();
        addForwardRuleParams.height = screenHeight / 8;
        addForwardRuleParams.width = screenHeight / 8;
        addForwardRuleParams.bottomMargin = screenHeight / 16;
        */

        int screenHeight = getScreenHeight();
        //load icons and set their layout
        //arrow
        RelativeLayout.LayoutParams iconParams = (RelativeLayout.LayoutParams)arrowRight.getLayoutParams();
        iconParams.height = screenHeight / 9;
        iconParams.width = getScreenHeight() / 9;
        //whatsapp
        iconParams = (RelativeLayout.LayoutParams)whatsapp.getLayoutParams();
        iconParams.height = screenHeight / 9;
        iconParams.width = getScreenHeight() / 9;
        //signal
        iconParams = (RelativeLayout.LayoutParams)signal.getLayoutParams();
        iconParams.height = screenHeight / 9;
        iconParams.width = getScreenHeight() / 9;
    }


}

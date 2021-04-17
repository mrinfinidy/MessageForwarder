package com.example.messageforwarder.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.messageforwarder.R;
import com.example.messageforwarder.onclicklisteners.AddForwardRule;
import com.example.messageforwarder.onclicklisteners.WhatsappToSignal;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public static Context mainContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainContext = getApplicationContext();

        //topbar layout
        setTopBarLayout();
        //icons layout
        ImageView arrowRight = findViewById(R.id.arrow_right);
        ImageView whatsapp = findViewById(R.id.whatsappIcon);
        ImageView signal = findViewById(R.id.signalIcon);
        TextView whatsappToSignalLayer = findViewById(R.id.whatsappToSignalLayer);
        setForwardRuleLayout(arrowRight, whatsapp, signal, whatsappToSignalLayer);

        //add forward rule (display)
        Boolean optionsDisplayed = new Boolean(false);
        FloatingActionButton addForwardRuleBtn = findViewById(R.id.addForwardRule);
        addForwardRuleBtn.setOnClickListener(new AddForwardRule(optionsDisplayed, arrowRight, whatsapp, signal, whatsappToSignalLayer));
        //Rule:WhatsApp to Signal
        whatsappToSignalLayer.setOnClickListener(new WhatsappToSignal(mainContext));
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

    private void setForwardRuleLayout(ImageView arrowRight, ImageView whatsapp, ImageView signal, TextView whatsappToSignalLayer) {
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
        //WhatsApp to Signal Layer
        iconParams = (RelativeLayout.LayoutParams)whatsappToSignalLayer.getLayoutParams();
        iconParams.height = screenHeight / 9;
        iconParams.width = screenHeight / 3 + 30; //30sp offset for margin between icons --> make relative
    }


}

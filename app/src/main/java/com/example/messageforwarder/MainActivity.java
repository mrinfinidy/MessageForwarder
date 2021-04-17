package com.example.messageforwarder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
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
        setAddForwardRuleLayout();
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
        TextView topBar = (TextView)findViewById(R.id.topBar);
        RelativeLayout.LayoutParams topBarParams = (RelativeLayout.LayoutParams)topBar.getLayoutParams();
        topBarParams.height = getScreenHeight() / 6;
        topBar.setTextSize(getScreenHeight()/(float)60);
    }

    private void setAddForwardRuleLayout() {
        FloatingActionButton addForwardRule = (FloatingActionButton)findViewById(R.id.addForwardRule);
        RelativeLayout.LayoutParams addForwardRuleParams = (RelativeLayout.LayoutParams)addForwardRule.getLayoutParams();
        addForwardRuleParams.height = getScreenHeight() / 8;
        addForwardRuleParams.width = getScreenHeight() / 8;
    }
}

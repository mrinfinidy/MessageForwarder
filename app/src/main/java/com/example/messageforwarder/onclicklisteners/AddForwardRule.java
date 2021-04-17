package com.example.messageforwarder.onclicklisteners;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AddForwardRule implements View.OnClickListener {

    private Boolean optionsDisplayed;
    private ImageView arrowRight;
    private ImageView whatsapp;
    private ImageView signal;
    private TextView whatsappToSignalLayer;

    public AddForwardRule(Boolean optionsDisplayed, ImageView arrowRight, ImageView whatsapp,
                          ImageView signal, TextView whatsappToSignalLayer) {
        this.optionsDisplayed = optionsDisplayed;
        this.arrowRight = arrowRight;
        this.whatsapp = whatsapp;
        this.signal = signal;
        this.whatsappToSignalLayer = whatsappToSignalLayer;
    }

    @Override
    public void onClick(View v) {
        displayWhatsappToSignal();
    }

    private void displayWhatsappToSignal() {
        //set icon visibility based on if already displayed
        if (optionsDisplayed) {
            arrowRight.setVisibility(View.INVISIBLE);
            whatsapp.setVisibility(View.INVISIBLE);
            signal.setVisibility(View.INVISIBLE);
            whatsappToSignalLayer.setVisibility(View.INVISIBLE);
            whatsappToSignalLayer.setClickable(false);
        } else {
            arrowRight.setVisibility(View.VISIBLE);
            whatsapp.setVisibility(View.VISIBLE);
            signal.setVisibility(View.VISIBLE);
            whatsappToSignalLayer.setVisibility(View.VISIBLE);
            whatsappToSignalLayer.setClickable(true);
        }
        optionsDisplayed = !optionsDisplayed;
    }
}

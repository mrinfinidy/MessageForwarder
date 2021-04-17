package com.example.messageforwarder;

import android.view.View;
import android.widget.ImageView;

public class ExternalOnClickListener implements View.OnClickListener {

    private Boolean optionsDisplayed;
    private ImageView arrowRight;
    private ImageView whatsapp;
    private ImageView signal;

    public ExternalOnClickListener(Boolean optionsDisplayed, ImageView arrowRight, ImageView whatsapp, ImageView signal) {
        this.optionsDisplayed = optionsDisplayed;
        this.arrowRight = arrowRight;
        this.whatsapp = whatsapp;
        this.signal = signal;
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
        } else {
            arrowRight.setVisibility(View.VISIBLE);
            whatsapp.setVisibility(View.VISIBLE);
            signal.setVisibility(View.VISIBLE);
        }
        optionsDisplayed = !optionsDisplayed;
    }
}

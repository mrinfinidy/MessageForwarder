package com.example.messageforwarder.onclicklisteners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.messageforwarder.activities.NewRule;

public class WhatsappToSignal implements View.OnClickListener {

    private Context mainContext;

    public WhatsappToSignal(Context mainContext) {
        this.mainContext = mainContext;
    }

    @Override
    public void onClick(View v) {
        newRuleActivity(v);
    }

    private void newRuleActivity(View v) {
        Intent newRule = new Intent(mainContext, NewRule.class);
        mainContext.startActivity(newRule);
    }
}

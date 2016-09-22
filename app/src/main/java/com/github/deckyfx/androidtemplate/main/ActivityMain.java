package com.github.deckyfx.androidtemplate.main;

/**
 * Created by decky on 9/22/16.
 */

import android.os.Bundle;

import com.github.deckyfx.androidtemplate.R;
import com.github.deckyfx.androidutilities.etc.ExtendedActivity;

public class ActivityMain extends ExtendedActivity {
    private ActivityMain me;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.me = this;
    }
}
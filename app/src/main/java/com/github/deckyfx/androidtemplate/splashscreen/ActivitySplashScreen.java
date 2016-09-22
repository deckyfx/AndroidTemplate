package com.github.deckyfx.androidtemplate.splashscreen;

import android.os.Bundle;

import com.github.deckyfx.androidtemplate.R;
import com.github.deckyfx.androidutilities.etc.ExtendedActivity;

/**
 * Created by decky on 9/22/16.
 */
public class ActivitySplashScreen extends ExtendedActivity {
    private ActivitySplashScreen me;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_splash_screen);
        this.me = this;
    }
}

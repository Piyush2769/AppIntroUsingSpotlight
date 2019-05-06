package com.Projects.appintrousingspotlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

import com.takusemba.spotlight.OnSpotlightStateChangedListener;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    //private static final LocalDate Spotlight = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Spotlight.with(this)
        //  .setOverlayColor(R.color.background)
        //.setDuration(1000L)
        //.setAnimation(new DecelerateInterpolator(2f))
        // .setTargets(firstTarget, secondTarget, thirdTarget ...)
        //.setClosedOnTouchedOutside(false)
        //.setOnSpotlightStateListener(new OnSpotlightStateChangedListener() {
    }

}

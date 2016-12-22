package me.jrubio.ZeroStress;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        /*
        addSlide(firstFragment);

        addSlide(secondFragment);
        addSlide(thirdFragment);
        addSlide(fourthFragment);
        */
        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Welcome to SaaS S.A.G.", "The Security Assessment Guide for SaaS Applications", R.mipmap.logo_app, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Your Checklist, all organised", "Make Your Assessment easier with pre-configured checklist.", R.mipmap.checklist, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Swipe Left. Swipe Right.", "To check and uncheck elements, you can either, swipe or click on it and check 'Complete'", R.mipmap.swipe, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Keep your Data Secure.", "Keep your checklist secure with our unique Account Management System.", R.mipmap.security, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("You are all set. Enjoy SaaS S.A.G.", "GET STARTED.", R.mipmap.check_mark, getResources().getColor(R.color.colorPrimary)));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(getResources().getColor(R.color.colorPrimary));
        setSeparatorColor(getResources().getColor(R.color.colorPrimary));

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        Intent i = new Intent(IntroActivity.this, CompanyLoginActivity.class);
        startActivity(i);

        // close this activity
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        Intent i = new Intent(IntroActivity.this, CompanyLoginActivity.class);
        startActivity(i);

        // close this activity
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}

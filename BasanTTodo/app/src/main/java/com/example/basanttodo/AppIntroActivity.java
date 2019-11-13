package com.example.basanttodo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_intro);
        addSlide(AppIntroFragment.newInstance("Welcome", "create",
                R.drawable.one, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("", "write",
                R.drawable.two, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryLight)));
        addSlide(AppIntroFragment.newInstance("", "priority",
                R.drawable.three, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("", "add",
                R.drawable.four, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("", "show And Delete",
                R.drawable.five, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryLight)));
        addSlide(AppIntroFragment.newInstance("", "Update",
                R.drawable.six, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}
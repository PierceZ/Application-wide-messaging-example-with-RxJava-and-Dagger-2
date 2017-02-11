package com.piercezaifman.daggerbus;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        TopFragment topFragment = TopFragment.newInstance();
        fragmentManager.beginTransaction()
                .replace(R.id.top, topFragment)
                .commit();

        BottomFragment bottomFragment = BottomFragment.newInstance();
        fragmentManager.beginTransaction()
                .replace(R.id.bottom, bottomFragment)
                .commit();
    }
}

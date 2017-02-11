package com.piercezaifman.daggerbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by piercezaifman on 2017-02-11.
 */

public class TopFragment extends Fragment {
    public static TopFragment newInstance() {
        return new TopFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_top, container, false);

        v.findViewById(R.id.fragment_top_button).setOnClickListener(view -> {
            //TODO post something
        });

        //TODO subscribe

        return v;
    }
}

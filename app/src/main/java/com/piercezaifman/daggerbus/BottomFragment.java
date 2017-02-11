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

public class BottomFragment extends Fragment {
    public static BottomFragment newInstance() {
        return new BottomFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bottom, container, false);

        v.findViewById(R.id.fragment_bottom_button).setOnClickListener(view -> {
            //TODO post something
        });

        //TODO subscribe

        return v;
    }
}

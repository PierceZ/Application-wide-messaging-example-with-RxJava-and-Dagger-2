package com.piercezaifman.daggerbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rx.Subscription;

/**
 * Created by piercezaifman on 2017-02-11.
 */

public class BottomFragment extends BaseFragment {

    private TextView mMessageView;

    public static BottomFragment newInstance() {
        return new BottomFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bottom, container, false);

        mMessageView = (TextView) v.findViewById(R.id.fragment_bottom_textview);

        v.findViewById(R.id.fragment_bottom_button).setOnClickListener(view -> {
            // send a message to subscribers of the bottom
            App.getBusComponent().getBottomSubject().onNext(getString(R.string.hello_from_bottom));
        });

        // listen for messages from the top
        Subscription subscription = App.getBusComponent().getTopSubject().subscribe((message) -> {
            mMessageView.setText(message);
        });

        getCompositeSubscription().add(subscription);

        return v;
    }
}

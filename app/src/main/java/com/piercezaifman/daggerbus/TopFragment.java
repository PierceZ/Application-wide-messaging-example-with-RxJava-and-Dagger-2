package com.piercezaifman.daggerbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rx.Subscription;

import static com.piercezaifman.daggerbus.App.getBusComponent;

/**
 * Created by piercezaifman on 2017-02-11.
 */

public class TopFragment extends BaseFragment {

    private TextView mMessageView;

    public static TopFragment newInstance() {
        return new TopFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_top, container, false);

        mMessageView = (TextView) v.findViewById(R.id.fragment_top_textview);

        v.findViewById(R.id.fragment_top_button).setOnClickListener(view -> {
            // send a message to subscribers of the top
            getBusComponent().getTopSubject().onNext(getString(R.string.hello_from_top));
        });

        // listen for messages from the bottom
        Subscription subscription = App.getBusComponent().getBottomSubject().subscribe((message) -> {
            mMessageView.setText(message);
        });

        getCompositeSubscription().add(subscription);

        return v;
    }
}

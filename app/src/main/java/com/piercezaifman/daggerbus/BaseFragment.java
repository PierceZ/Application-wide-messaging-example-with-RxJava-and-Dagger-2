package com.piercezaifman.daggerbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by piercezaifman on 2017-02-11.
 */

public class BaseFragment extends Fragment {

    private CompositeSubscription mSubscriptions;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSubscriptions = new CompositeSubscription();
    }

    protected CompositeSubscription getCompositeSubscription() {
        return mSubscriptions;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mSubscriptions.unsubscribe();
    }
}

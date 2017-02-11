package com.piercezaifman.daggerbus;

import android.app.Application;

/**
 * Created by piercezaifman on 2017-02-11.
 */

public class App extends Application {

    private static App sApp;
    private static BusComponent sBusComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
        sBusComponent = DaggerBusComponent.create();
    }

    public static BusComponent getBusComponent() {
        return sBusComponent;
    }

    public static App getApp() {
        return sApp;
    }
}

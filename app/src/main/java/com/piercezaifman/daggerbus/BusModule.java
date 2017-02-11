package com.piercezaifman.daggerbus;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rx.subjects.PublishSubject;

/**
 * Created by piercezaifman on 2017-02-11.
 */

@Module
public class BusModule {

    public static final String PROVIDER_TOP_SUBJECT = "PROVIDER_TOP_SUBJECT";
    public static final String PROVIDER_BOTTOM_SUBJECT = "PROVIDER_BOTTOM_SUBJECT";

    @Provides
    @Singleton
    @Named(PROVIDER_TOP_SUBJECT)
    static PublishSubject<String> provideTopSubject() {
        return PublishSubject.create();
    }

    @Provides
    @Singleton
    @Named(PROVIDER_BOTTOM_SUBJECT)
    static PublishSubject<String> provideBottomSubject() {
        return PublishSubject.create();
    }
}

package com.piercezaifman.daggerbus;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import rx.subjects.PublishSubject;

/**
 * Created by piercezaifman on 2017-02-11.
 */
@Component(modules = BusModule.class)
@Singleton
public interface BusComponent {

    @Named(BusModule.PROVIDER_TOP_SUBJECT)
    PublishSubject<String> getTopSubject();

    @Named(BusModule.PROVIDER_BOTTOM_SUBJECT)
    PublishSubject<String> getBottomSubject();
}

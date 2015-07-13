package com.bolyartech.daggertestsub;

import com.bolyartech.mylibrary.MyLibraryComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ogre on 2015-07-12
 */
@Component(modules = Mod2.class)
@Singleton
public interface MyAppComponent extends MyLibraryComponent {
    void injectMainActivity(MainActivity act);
    MyLibraryComponent newMyLibraryComponent();
}

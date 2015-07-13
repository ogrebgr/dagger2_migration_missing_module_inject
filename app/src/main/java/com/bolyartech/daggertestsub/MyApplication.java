package com.bolyartech.daggertestsub;

import android.app.Application;

import com.bolyartech.mylibrary.MyLibDependencyInjectionHelper;
import com.bolyartech.mylibrary.MyLibraryComponent;

/**
 * Created by ogre on 2015-07-13
 */
public class MyApplication extends Application implements MyLibDependencyInjectionHelper.MyLibraryComponentProvider {
    private MyAppComponent mAppDependencyInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppDependencyInjector = DaggerMyAppComponent.builder().build();
    }

    public MyAppComponent getAppDependencyInjector() {
        return mAppDependencyInjector;
    }


    @Override
    public MyLibraryComponent getMyLibraryComponent() {
        return (MyLibraryComponent) mAppDependencyInjector;
    }
}

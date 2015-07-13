package com.bolyartech.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import javax.inject.Inject;

/**
 * Created by ogre on 2015-07-13
 */
public class ActLogin extends Activity {
    @Inject
    Mod1Interface2 mMod1Interface2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ...
        MyLibDependencyInjectionHelper.getMyLibraryComponent(getApplication()).injectActLogin(this);
        // ...

        int i = 0;
        i++; // place for debug breakpoint to check the inject
    }
}

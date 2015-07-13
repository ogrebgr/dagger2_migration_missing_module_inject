package com.bolyartech.mylibrary;

import android.app.Application;

/**
 * Created by ogre on 2015-07-13
 */
public class MyLibDependencyInjectionHelper {
    public static MyLibraryComponent getMyLibraryComponent(Application app) {
        if (app instanceof MyLibraryComponentProvider) {
            return ((MyLibraryComponentProvider) app).getMyLibraryComponent();
        } else {
            throw new IllegalStateException("The Application is not implementing MyLibDependencyInjectionHelper.MyLibraryComponentProvider");
        }
    }


    public interface MyLibraryComponentProvider {
        MyLibraryComponent getMyLibraryComponent();
    }
}

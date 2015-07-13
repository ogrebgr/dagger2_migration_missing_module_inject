package com.bolyartech.mylibrary;

import dagger.Subcomponent;

/**
 * Created by ogre on 2015-07-12
 */
@Subcomponent(modules = Mod1.class)
public interface MyLibraryComponent {
    void injectActLogin(ActLogin act);
    void inject(Mod1Interface1 in);
}

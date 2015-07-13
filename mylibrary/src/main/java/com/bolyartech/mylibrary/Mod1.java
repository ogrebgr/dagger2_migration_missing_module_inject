package com.bolyartech.mylibrary;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ogre on 2015-07-12
 */
@Module
public class Mod1 {
    @Provides
    @Singleton
    Mod1Interface1 provideMod1Interface1(Mod1Interface1Impl ret) {
        return ret;
    }

    @Provides
    @Singleton
    Mod1Interface2 provideMod1Interface2(Mod1Interface2Impl ret) {return ret;}

}

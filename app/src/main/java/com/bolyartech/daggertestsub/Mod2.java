package com.bolyartech.daggertestsub;

import com.bolyartech.mylibrary.Mod1;
import com.bolyartech.mylibrary.Mod2Interface1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ogre on 2015-07-12
 */
@Module(includes = Mod1.class)
public class Mod2 {
    @Provides
    @Singleton
    Mod2Interface1 provideMod2Interface1(Mod2Interface1Impl ret) {
        return ret;
    }
}

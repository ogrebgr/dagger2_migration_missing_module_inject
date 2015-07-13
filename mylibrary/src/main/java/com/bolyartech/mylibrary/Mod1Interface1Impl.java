package com.bolyartech.mylibrary;

import javax.inject.Inject;

/**
 * Created by ogre on 2015-07-12
 */
public class Mod1Interface1Impl implements Mod1Interface1 {
    @Inject
    public Mod1Interface1Impl(Mod2Interface1 mod2Interface1) {
        mMod2Interface1 = mod2Interface1;
    }


    @Inject
    Mod2Interface1 mMod2Interface1;
}

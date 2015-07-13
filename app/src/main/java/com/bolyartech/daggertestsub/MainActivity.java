package com.bolyartech.daggertestsub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bolyartech.mylibrary.ActLogin;
import com.bolyartech.mylibrary.Mod1Interface1Impl;
import com.bolyartech.mylibrary.Mod1Interface2;

import javax.inject.Inject;


public class MainActivity extends Activity {
    @Inject
    Mod1Interface1Impl mMod1Interface1Impl;

    @Inject
    Mod1Interface2 mMod1Interface2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getAppDependencyInjector().injectMainActivity(this);

        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActLogin.class);
                startActivity(intent);
            }
        });
    }
}

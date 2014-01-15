package com.sarabadani.android.parandroid.activity;

import com.badlogic.gdx.Game;
import com.sarabadani.android.parandroid.worlds.SimpleScreen;

/**
 * Created by soroosh on 1/15/14.
 */
public class Parandroid extends Game {

    @Override
    public void create() {
        setScreen(new SimpleScreen());
    }
}

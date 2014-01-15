package com.sarabadani.android.parandroid.application;

import com.badlogic.gdx.Game;
import com.sarabadani.android.parandroid.worlds.SimpleScreen;

/**
 * Created by soroosh on 1/15/14.
 */
public class ParandroidGame extends Game {
    @Override
    public void create() {
        setScreen(new SimpleScreen());
    }
}

package com.sarabadani.android.parandroid.activity;

import com.badlogic.gdx.Game;
import screens.GameScreen;

public class StarAssault extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}

}

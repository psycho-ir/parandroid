package com.sarabadani.android.parandroid.worlds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

/**
 * Created by soroosh on 1/15/14.
 */
public class SimpleScreen implements Screen {
    @Override
    public void render(float v) {
        	    Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        	    Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//        	    renderer.render();

    }

    @Override
    public void resize(int i, int i2) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}

package com.sarabadani.android.parandroid.worlds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.sarabadani.android.parandroid.activity.ParRenderer;

/**
 * Created by soroosh on 1/15/14.
 */
public class SimpleScreen implements Screen, InputProcessor {
    private Sample world = new Sample();

    ParRenderer renderer = new ParRenderer(world);
    int width = 0;
    int height = 0;

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0.1f, 1.0f, 0.1f, 0.0f);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        renderer.render();
    }

    @Override
    public void resize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override
    public void show() {

        Gdx.input.setInputProcessor(this);
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

    @Override
    public boolean keyDown(int i) {
        return false;
    }

    @Override
    public boolean keyUp(int i) {
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    @Override
    public boolean touchDown(int i, int i2, int i3, int i4) {
        world.getRocket().moveRight();
        return true;
    }

    @Override
    public boolean touchUp(int i, int i2, int i3, int i4) {
        world.getRocket().stop();
        return true;
    }

    @Override
    public boolean touchDragged(int i, int i2, int i3) {
        return false;
    }

    @Override
    public boolean mouseMoved(int i, int i2) {
        return false;
    }

    @Override
    public boolean scrolled(int i) {
        return false;
    }
}

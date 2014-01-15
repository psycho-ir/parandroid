package com.sarabadani.android.parandroid.activity;

import android.util.Log;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sarabadani.android.parandroid.model.Rocket;
import com.sarabadani.android.parandroid.worlds.Sample;

/**
 * Created by soroosh on 1/15/14.
 */
public class ParRenderer {
    private static final float CAMERA_WIDTH = 10f;
    private static final float CAMERA_HEIGHT = 7f;
    private static final float RUNNING_FRAME_DURATION = 0.06f;
    private SpriteBatch spriteBatch;

    public ParRenderer(Sample world) {
        this.world = world;
        this.spriteBatch = new SpriteBatch();

    }

    private Sample world;


    private Texture rocketTexture = new Texture("rocket.png");

    public void render() {
        spriteBatch.begin();
        Rocket rocket = world.getRocket();
//        float movementx = Gdx.input.getAccelerometerX();
        float movementy = Gdx.input.getAccelerometerY();
//        float movementz = Gdx.input.getAccelerometerZ();
Log.i("MOVE:",String.valueOf(movementy));
    if(movementy >2){
        rocket.moveRight();
    }
        else if(movementy < -2){
            rocket.moveLeft();
        }
        else rocket.stop();
        rocket.update(movementy);
        spriteBatch.draw(rocketTexture, rocket.getPosition().x, rocket.getPosition().y);
        spriteBatch.end();
    }

}

package com.sarabadani.android.parandroid.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by soroosh on 1/15/14.
 */
public class Rocket {

    private final Vector2 position;
    Rectangle bounds = new Rectangle();

    public Rocket(Vector2 position) {
        this.position = position;
        this.bounds.width = DEFAULT_SIZE;
        this.bounds.height = DEFAULT_SIZE;

    }

    public enum State {
        IDLE,
        MOVING
    }

    static final float DEFAULT_SPEED = 2.0f;
    static final float DEFAULT_SIZE = 0.5f;

}

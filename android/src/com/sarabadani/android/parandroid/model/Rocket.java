package com.sarabadani.android.parandroid.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by soroosh on 1/15/14.
 */
public class Rocket {

    private final Vector2 position;
    Rectangle bounds = new Rectangle();
    static final float DEFAULT_SPEED = 2.0f;
    static final float DEFAULT_SIZE = 0.5f;


    private State state = State.IDLE;

    public Rocket(Vector2 position) {
        this.position = position;
        this.bounds.width = DEFAULT_SIZE;
        this.bounds.height = DEFAULT_SIZE;

    }

    public Vector2 getPosition() {
        return position;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void update() {
        switch (this.state) {
            case MOVING_RIGHT:
                this.position.add(1, 0);
                break;
            case MOVING_LEFT:
                this.position.add(-1, 0);
                break;
            case IDLE:
                return;
        }

    }

    public enum State {
        IDLE,
        MOVING_RIGHT,
        MOVING_LEFT

    }

    public void moveRight() {
        this.state = State.MOVING_RIGHT;
    }

    public void stop() {
        this.state = State.IDLE;
    }

}

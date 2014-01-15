package com.sarabadani.android.parandroid.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by soroosh on 1/15/14.
 */
public class Block {
    private final int score;
    static final float SIZE = 1f;
    private final Vector2 position;
    Rectangle bounds = new Rectangle();

    public Block(int score, Vector2 position) {
        this.score = score;
        this.position = position;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;


    }
}

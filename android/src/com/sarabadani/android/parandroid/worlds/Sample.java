package com.sarabadani.android.parandroid.worlds;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.sarabadani.android.parandroid.model.Block;
import com.sarabadani.android.parandroid.model.Rocket;

/**
 * Created by soroosh on 1/15/14.
 */
public class Sample {

    private Array blocks;
    private Rocket rocket;

    public Sample(){
        createBlocks();
    }

    private void createBlocks(){
        blocks = new Array();
        rocket = new Rocket(new Vector2(20,0));
        blocks.add(new Block(1,new Vector2(100,100)));
    }

    public Rocket getRocket() {
        return rocket;
    }
}


package com.sarabadani.android.parandroid.application;
import android.graphics.Color;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class HelloApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    private BitmapFont bitmapFont;
    private  Texture rocketImg;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
        rocketImg = new Texture("rocket.png");

        this.bitmapFont= new BitmapFont();
        this.bitmapFont.setScale(4.0f);
        bitmapFont.setColor(Color.BLUE);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(rocketImg, 100, 0);
//        bitmapFont.draw(batch,"Soroosh Studio presents.",100,300);
        batch.end();
	}
}

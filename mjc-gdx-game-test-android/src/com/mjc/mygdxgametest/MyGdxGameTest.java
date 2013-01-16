package com.mjc.mygdxgametest;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class MyGdxGameTest implements ApplicationListener {

	Texture backgroundTexture;
	Texture texture;
	SpriteBatch batch;
	Rectangle bgSourceRect;
	Rectangle bgDestRect;
	Rectangle sourceRect;
	Rectangle destRect;
	
	@Override
	public void create() {
		batch = new SpriteBatch();		
		texture = new Texture(Gdx.files.internal("blob.png"));
		backgroundTexture = new Texture(Gdx.files.internal("blue_sky.png"));
		bgSourceRect = new Rectangle (0,0,backgroundTexture.getWidth(), backgroundTexture.getHeight());
		bgDestRect = new Rectangle(0,0,100,100);
		sourceRect = new Rectangle(0,0,texture.getWidth(), texture.getHeight());
		destRect = new Rectangle (0,0, 640, 480);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // This cryptic line clears the screen.
		batch.begin();
		batch.draw(texture, sourceRect.x, sourceRect.y, sourceRect.width, sourceRect.height, (int)destRect.x, (int)destRect.y, (int)destRect.width, (int)destRect.height, false, false);
		batch.draw(backgroundTexture, bgSourceRect.x, bgSourceRect.y, bgSourceRect.width, bgSourceRect.height, (int)bgDestRect.x, (int)bgDestRect.y, (int)bgDestRect.width, (int)bgDestRect.height, false, false);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	

}

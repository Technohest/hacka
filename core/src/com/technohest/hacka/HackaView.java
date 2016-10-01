package com.technohest.hacka;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HackaView extends ApplicationAdapter {
	SpriteBatch batch;
	HackaModel model;
    HackaController controller;
    Texture img;
	@Override
	public void create () {
        model = new HackaModel();
		controller = new HackaController(model);
		batch = new SpriteBatch();
        img = new Texture("assets/hack_button.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(img,Gdx.graphics.getWidth()/2-160,Gdx.graphics.getHeight()/2,320,160);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
        img.dispose();
	}
}

package nl.sygnal.mario;

import nl.sygnal.mario.screens.SplashScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Mario extends Game{
	//* FIELDS */
	private SpriteBatch batch;
	private SplashScreen splashScreen;
	
	@Override
	public void create(){		
		this.splashScreen = new SplashScreen(this);
		this.setScreen(splashScreen);
	}

	@Override
	public void dispose(){
		batch.dispose();
		super.dispose();
	}

	@Override
	public void render(){		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		super.render();
	}

	@Override
	public void resize(int width, int height){
		super.resize(width, height);
	}

	@Override
	public void pause(){
		super.pause();
	}

	@Override
	public void resume(){
		super.resume();
	}
}

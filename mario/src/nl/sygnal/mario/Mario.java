package nl.sygnal.mario;

import nl.sygnal.mario.screens.GameScreen;
import nl.sygnal.mario.screens.SplashScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public class Mario extends Game{
	// FIELDS
	private SplashScreen splashScreen;
	private GameScreen gameScreen;
	
	//PROPERTIES
	public GameScreen getGameScreen(){
		return this.gameScreen;
	}
	
	@Override
	public void create(){		
		//screens aanmaken
		this.splashScreen = new SplashScreen(this);
		this.gameScreen = new GameScreen(this);
		
		//screen selecteren
		this.setScreen(splashScreen);
	}

	@Override
	public void dispose(){
		super.dispose();
	}

	@Override
	public void render(){		
		float delta = 1/60;
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		splashScreen.render(delta);
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

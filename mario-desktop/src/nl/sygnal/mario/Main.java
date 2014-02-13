package nl.sygnal.mario;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Mario";
		cfg.useGL20 = true;
		cfg.width = 960;
		cfg.height = 640;
		
		new LwjglApplication(new Mario(), cfg);
	}
}

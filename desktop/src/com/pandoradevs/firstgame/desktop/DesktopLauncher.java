package com.pandoradevs.firstgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pandoradevs.firstgame.FirstGame;
import com.pandoradevs.firstgame.extendGameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = 800;
		config.height = 480;

		new LwjglApplication(new extendGameClass(), config);
	}
}

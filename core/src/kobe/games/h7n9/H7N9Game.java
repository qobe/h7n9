package kobe.games.h7n9;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import kobe.games.h7n9.kobe.games.h7n9.screens.GameScreen;

public class H7N9Game extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		setScreen(new GameScreen());
	}
}

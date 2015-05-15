package kobe.games.h7n9.kobe.games.h7n9.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import kobe.games.h7n9.kobe.games.h7n9.model.World;
import kobe.games.h7n9.kobe.games.h7n9.view.WorldRenderer;

/**
 * Created by mkobe on 5/14/2015.
 */
public class GameScreen implements Screen {

    private World world;
    private WorldRenderer renderer;

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();
    }

    @Override
    public void show() {
        this.world = new World();
        this.renderer = new WorldRenderer(world);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose(){

    }
}

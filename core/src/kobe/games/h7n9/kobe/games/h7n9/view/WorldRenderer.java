package kobe.games.h7n9.kobe.games.h7n9.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

import kobe.games.h7n9.kobe.games.h7n9.model.Block;
import kobe.games.h7n9.kobe.games.h7n9.model.Gob;
import kobe.games.h7n9.kobe.games.h7n9.model.World;

/**
 * Created by mkobe on 5/15/2015.
 */
public class WorldRenderer {

    private World world;
    private OrthographicCamera cam;

    //For debug rendering
    ShapeRenderer debugRenderer = new ShapeRenderer();

    public WorldRenderer(World world){
        this.world = world;
        this.cam = new OrthographicCamera();
        this.cam.position.set(5, 3.5f, 0);
        this.cam.update();
    }

    public void render(){
        //render blocks
        debugRenderer.setProjectionMatrix(cam.combined);
        debugRenderer.begin(ShapeRenderer.ShapeType.Line);
        for (Block block : world.getBlocks()){
            Rectangle rect = block.getBounds();
            float x1 = block.getPosition().x + rect.x;
            float y1 = block.getPosition().y + rect.y;
            debugRenderer.setColor(new Color(255,0,0,1));
            debugRenderer.rect(x1, y1, rect.width, rect.height);

        }

        Gob gob = world.getGob();
        Rectangle rect = gob.getBounds();
        float x1 = gob.getPosition().x + rect.x;
        float y1 = gob.getPosition().y + rect.y;
        debugRenderer.setColor(new Color(0,255,0,1));
        debugRenderer.rect(x1, y1, rect.width, rect.height);
        debugRenderer.end();
    }
}

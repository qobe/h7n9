package kobe.games.h7n9.kobe.games.h7n9.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by mkobe on 5/14/2015.
 */
public class World {

    Array blocks = new Array();
    //Hero Gob to save the day
    Gob gob;

    public Array getBlocks(){
        return blocks;
    }
    public Gob getGob(){
        return gob;
    }

    public World(){
        createDemoWorld();
    }

    private void createDemoWorld(){
        gob = new Gob(new Vector2(7,2)); //set spawn point for Gob

        for (int i = 0; i < 10; i++){
            blocks.add(new Block(new Vector2(i, 1)));
        }
        blocks.add(new Block(new Vector2(9, 2)));
        blocks.add(new Block(new Vector2(9, 3)));
        blocks.add(new Block(new Vector2(9, 4)));
        blocks.add(new Block(new Vector2(9, 5)));

        blocks.add(new Block(new Vector2(6, 3)));
        blocks.add(new Block(new Vector2(6, 4)));
        blocks.add(new Block(new Vector2(6, 5)));

    }
}

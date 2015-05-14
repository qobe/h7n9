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
    }
}

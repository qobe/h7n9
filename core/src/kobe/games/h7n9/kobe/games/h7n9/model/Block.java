package kobe.games.h7n9.kobe.games.h7n9.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by mkobe on 5/14/2015.
 */
public class Block {

    static final float SIZE = 1f;

    Vector2 position = new Vector2();
    Rectangle bounds = new Rectangle();

    public Block(Vector2 pos){
        this.position = pos;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;

    }

    public Rectangle getBounds (){
        return this.bounds;
    }
    public Vector2 getPosition(){
        return this.position;
    }
}

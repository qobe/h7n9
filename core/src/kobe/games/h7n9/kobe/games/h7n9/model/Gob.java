package kobe.games.h7n9.kobe.games.h7n9.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

/**
 * Created by mkobe on 5/14/2015.
 */
public class Gob {
    public enum State {
        IDLE, WALKING, JUMPING, DYING
    }

    static final float SPEED = 2f; //unit per second
    static final float SIZE = 0/5f; //half a unit

    Vector2 position = new Vector2();
    Vector2 acceleration = new Vector2();
    Vector2 velocity = new Vector2();
    Rectangle bounds = new Rectangle();
    State state = State.IDLE;
    boolean facingLeft = true;

    /**
     * Gob constructor. Set bounds for actor drawing. actor will take up half a unit
     * @param position; Vector2 type
     */

    public Gob(Vector2 position){
        this.position = position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }
}

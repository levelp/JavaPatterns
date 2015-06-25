package behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class MementoTest extends Assert {

    @Test
    public void testMemento() throws FileNotFoundException {
        GameXO gameXO = new GameXO();
        GameStorage gs1 = new GameStorage(gameXO);
        gs1.save("xo_game.dat");

        // ...
        gs1.load("xo_game.dat");


    }

}

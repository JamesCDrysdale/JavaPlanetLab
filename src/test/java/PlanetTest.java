import org.example.Planet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet mars;

    @Before
    public void before(){
        mars = new Planet("Mars", 908973);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", mars.getName() );
    }

    @Test
    public void hasSize(){
        assertEquals(908973, mars.getSize() );
    }

    @Test
    public void canChangeName(){
        mars.setName("Pluto");
        assertEquals("Pluto", mars.getName() );
    }

    @Test
    public void canChangeSize(){
        mars.setSize(303030);
        assertEquals(303030, mars.getSize() );
    }

    @Test
    public void planetCanExplode(){
        assertEquals("Kaboom!", mars.explode() );
    }


}

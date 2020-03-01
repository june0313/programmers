package testdome.ship;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShipTest {
    @Test
    public void test1() {
        Ship ship = new Ship(10, containerIndex -> containerIndex);
        int cargo = ship.peekContainer(9);
        assertEquals(cargo, 9);
    }
}
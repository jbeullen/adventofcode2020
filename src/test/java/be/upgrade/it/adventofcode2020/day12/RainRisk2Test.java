package be.upgrade.it.adventofcode2020.day12;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainRisk2Test {
    @Test
    public void getManhattanDistance_given_testInput(){
        assertEquals(286, new RainRisk2(Utils.resourceToStringList("day12/input.test.txt"), 10, 1).getManhattanDistance());
    }

    @Test
    public void getManhattanDistance_given_actualInput(){
        assertEquals(42073, new RainRisk2(Utils.resourceToStringList("day12/input.txt"), 10, 1).getManhattanDistance());
    }
}
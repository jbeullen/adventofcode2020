package be.upgrade.it.adventofcode2020.day12;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainRiskTest {
    @Test
    public void getManhattanDistance_given_testInput(){
        assertEquals(25, new RainRisk(Utils.resourceToStringList("day12/input.test.txt")).getManhattanDistance());
    }

    @Test
    public void getManhattanDistance_given_actualInput(){
        assertEquals(420, new RainRisk(Utils.resourceToStringList("day12/input.txt")).getManhattanDistance());
    }


}
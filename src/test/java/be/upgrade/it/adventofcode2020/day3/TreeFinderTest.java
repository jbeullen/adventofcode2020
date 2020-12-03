package be.upgrade.it.adventofcode2020.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeFinderTest {
    @Test
    void findTreesAtSlope_given_testInput() {
        TreeFinder treeFinder = new TreeFinder("day3/input.test.txt");
        Assertions.assertEquals(7, treeFinder.findTreesAtSlope(3, 1));
    }

    @Test
    void findTreesAtSlope_given_actualInput() {
        TreeFinder treeFinder = new TreeFinder("day3/input.txt");
        Assertions.assertEquals(274, treeFinder.findTreesAtSlope(3, 1));
    }


    @Test
    void checkAllSlopes_given_testInput() {
        TreeFinder treeFinder = new TreeFinder("day3/input.test.txt");
        Assertions.assertEquals(336, treeFinder.checkAllSlopes());
    }

    @Test
    void checkAllSlopes_given_actualInput() {
        TreeFinder treeFinder = new TreeFinder("day3/input.txt");
        Assertions.assertEquals(6050183040L, treeFinder.checkAllSlopes());
    }
}
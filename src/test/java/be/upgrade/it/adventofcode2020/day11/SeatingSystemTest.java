package be.upgrade.it.adventofcode2020.day11;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatingSystemTest {
    @Test
    public void getOccupiedSeats_given_testInput(){
        SeatingSystem seatingSystem = new SeatingSystem(Utils.resourceToStringList("day11/input.test.txt"));
        while (!seatingSystem.doRound(true)){}
        assertEquals(37, seatingSystem.getOccupiedSeats());
    }

    @Test
    public void getOccupiedSeats_given_actualInput(){
        SeatingSystem seatingSystem = new SeatingSystem(Utils.resourceToStringList("day11/input.txt"));
        while (!seatingSystem.doRound(true)){}
        assertEquals(2438, seatingSystem.getOccupiedSeats());
    }

    @Test
    public void getOccupiedSeats2_given_testInput(){
        SeatingSystem seatingSystem = new SeatingSystem(Utils.resourceToStringList("day11/input.test.txt"));
        while (!seatingSystem.doRound(false)){}
        assertEquals(26, seatingSystem.getOccupiedSeats());
    }

    @Test
    public void getOccupiedSeats2_given_actualInput(){
        SeatingSystem seatingSystem = new SeatingSystem(Utils.resourceToStringList("day11/input.txt"));
        while (!seatingSystem.doRound(false)){}
        assertEquals(2174, seatingSystem.getOccupiedSeats());
    }

}
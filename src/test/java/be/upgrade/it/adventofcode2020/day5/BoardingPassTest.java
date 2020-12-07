package be.upgrade.it.adventofcode2020.day5;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {

    @Test
    public void getRowId_given_testInput(){
        String[] input = Utils.resourceToStringList("day5/input.test.txt");

        assertEquals(70, new BoardingPass(input[0]).getRow());
        assertEquals(14, new BoardingPass(input[1]).getRow());
        assertEquals(102, new BoardingPass(input[2]).getRow());
    }

    @Test
    public void getColumnId_given_testInput(){
        String[] input = Utils.resourceToStringList("day5/input.test.txt");

        assertEquals(7, new BoardingPass(input[0]).getColumn());
        assertEquals(7, new BoardingPass(input[1]).getColumn());
        assertEquals(4, new BoardingPass(input[2]).getColumn());
    }

    @Test
    public void getSeatId_given_testInput(){
        String[] input = Utils.resourceToStringList("day5/input.test.txt");

        assertEquals(567, new BoardingPass(input[0]).getSeatId());
        assertEquals(119, new BoardingPass(input[1]).getSeatId());
        assertEquals(820, new BoardingPass(input[2]).getSeatId());
    }


    @Test
    public void getHighestSeatId_given_testInput(){
        String[] input = Utils.resourceToStringList("day5/input.test.txt");

        assertEquals(820, BoardingPass.getHighestSeatId(input));
    }

    @Test
    public void getHighestSeatId_given_actualInput(){
        String[] input = Utils.resourceToStringList("day5/input.txt");

        assertEquals(959, BoardingPass.getHighestSeatId(input));
    }


    @Test
    public void findMySeatId_given_actualInput(){
        String[] input = Utils.resourceToStringList("day5/input.txt");

        assertEquals(527, BoardingPass.findMySeatId(input));
    }

}
package be.upgrade.it.adventofcode2020.day13;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShuttleSearchTest {
    @Test
    void getWaitingTime_given_testInput(){
        String[] lines = Utils.resourceToStringList("day13/input.test.txt");
        int start = Integer.parseInt(lines[0]);
        String[] busses = lines[1].split(",");

        assertEquals(295L, new ShuttleSearch(start, busses).getWaitingTime());
    }
    @Test
    void getWaitingTime_given_actualInput(){
        String[] lines = Utils.resourceToStringList("day13/input.txt");
        int start = Integer.parseInt(lines[0]);
        String[] busses = lines[1].split(",");

        assertEquals(171L, new ShuttleSearch(start, busses).getWaitingTime());
    }

    @Test
    void getGoldCoinTime_given_testInput(){
        int start = 1068773;
        String[] busses = "7,13,x,x,59,x,31,19".split(",");

        assertEquals(1068781, new ShuttleSearch(start, busses).getGoldCoinTime());
    }
    @Test
    void getGoldCoinTime_given_actualInput(){
        String[] lines = Utils.resourceToStringList("day13/input.txt");
        long start = 100000000000000L;
        String[] busses = lines[1].split(",");

        assertEquals(539746751134958L, new ShuttleSearch(start, busses).getGoldCoinTime());
    }

}
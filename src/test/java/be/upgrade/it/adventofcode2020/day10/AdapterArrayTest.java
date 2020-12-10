package be.upgrade.it.adventofcode2020.day10;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterArrayTest {
    @Test
    public void getVoltage_given_testInput(){
        assertEquals(220, new AdapterArray(Utils.resourceToStringList("day10/input.test.txt")).getVoltage());
    }

    @Test
    public void getVoltage_given_actualInput(){
        assertEquals(2040, new AdapterArray(Utils.resourceToStringList("day10/input.txt")).getVoltage());
    }


    @Test
    public void getPossibleAdapterCombinations_given_testInput(){
        assertEquals(19208L, new AdapterArray(Utils.resourceToStringList("day10/input.test.txt")).getPossibleAdapterCombinations());
    }

    @Test
    public void getPossibleAdapterCombinations_given_actualInput(){
        assertEquals(28346956187648L, new AdapterArray(Utils.resourceToStringList("day10/input.txt")).getPossibleAdapterCombinations());
    }

}
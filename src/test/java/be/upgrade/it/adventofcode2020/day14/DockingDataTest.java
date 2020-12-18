package be.upgrade.it.adventofcode2020.day14;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DockingDataTest {
    @Test
    public void getSumOffAllRegisters_withValuesMasking_given_testInput(){
        assertEquals(165L, new DockingData(Utils.resourceToStringList("day14/input.test.txt"), true).getSumOffAllRegisters());
    }
    @Test
    public void getSumOffAllRegisters_withValuesMasking_given_actualInput(){
        assertEquals(14839536808842L, new DockingData(Utils.resourceToStringList("day14/input.txt"), true).getSumOffAllRegisters());
    }

    @Test
    public void getSumOffAllRegisters_withAddressMasking_given_testInput(){
        String[] instructions = {
                "mask = 000000000000000000000000000000X1001X",
                "mem[42] = 100",
                "mask = 00000000000000000000000000000000X0XX",
                "mem[26] = 1"
        };
        assertEquals(208L, new DockingData(instructions, false).getSumOffAllRegisters());
    }
    @Test
    public void getSumOffAllRegisters_withAddressMasking_given_actualInput(){
        assertEquals(4215284199669L, new DockingData(Utils.resourceToStringList("day14/input.txt"), false).getSumOffAllRegisters());
    }

}
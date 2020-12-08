package be.upgrade.it.adventofcode2020.day7;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuggageRuleTest {
    @Test
    public void getNumberOfOuterBagsForColor_given_testInput(){
        assertEquals(4, LuggageRule.getNumberOfOuterBagsForColor(Utils.resourceToStringList("day7/input.test.txt"), "shiny gold"));
    }

    @Test
    public void getNumberOfOuterBagsForColor_given_actualInput(){
        assertEquals(115, LuggageRule.getNumberOfOuterBagsForColor(Utils.resourceToStringList("day7/input.txt"), "shiny gold"));
    }

    @Test
    public void getTotalNumberOfBagsForColor_given_testInput(){
        assertEquals(32, LuggageRule.getTotalNumberOfBagsForColor(Utils.resourceToStringList("day7/input.test.txt"), "shiny gold"));
    }

    @Test
    public void getTotalNumberOfBagsForColor_given_actualInput(){
        assertEquals(1250, LuggageRule.getTotalNumberOfBagsForColor(Utils.resourceToStringList("day7/input.txt"), "shiny gold"));
    }

}
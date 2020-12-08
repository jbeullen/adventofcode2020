package be.upgrade.it.adventofcode2020.day8;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandheldGameConsoleTest {

    @Test
    void runDiagnostics_give_testInput() {
        HandheldGameConsole handheldGameConsole = new HandheldGameConsole(Utils.resourceToStringList("day8/input.test.txt"));
        assertFalse(handheldGameConsole.runDiagnostics());
        assertEquals(5, handheldGameConsole.getAccumulator());
    }
    @Test
    void runDiagnostics_give_actualInput() {
        HandheldGameConsole handheldGameConsole = new HandheldGameConsole(Utils.resourceToStringList("day8/input.txt"));
        assertFalse(handheldGameConsole.runDiagnostics());
        assertEquals(1087, handheldGameConsole.getAccumulator());
    }


    @Test
    void findFixed_give_testInput() {
        HandheldGameConsole fixed = HandheldGameConsole.generateFixed(Utils.resourceToStringList("day8/input.test.txt"));
        assertNotNull(fixed);
        assertEquals(8, fixed.getAccumulator());
    }

    @Test
    void findFixed_give_actualInput() {
        HandheldGameConsole fixed = HandheldGameConsole.generateFixed(Utils.resourceToStringList("day8/input.txt"));
        assertNotNull(fixed);
        assertEquals(780, fixed.getAccumulator());
    }
}
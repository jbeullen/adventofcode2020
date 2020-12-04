package be.upgrade.it.adventofcode2020.day4;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PassportValidatorTest {

    @Test
    void getNumberOfValidPassports_given_testInput() {
        long numberOfValidPassports = new PassportValidator(Utils.resourceToStringList("day4/input.test1.txt")).getNumberOfValidPassports();
        Assertions.assertEquals(2L, numberOfValidPassports);
    }

    @Test
    void getNumberOfValidPassports_given_actualInput() {
        long numberOfValidPassports = new PassportValidator(Utils.resourceToStringList("day4/input.txt")).getNumberOfValidPassports();
        Assertions.assertEquals(256L, numberOfValidPassports);
    }

    @Test
    void getNumberOfValidPassportsIncludeValueCheck_given_testInput() {
        long numberOfValidPassports = new PassportValidator(Utils.resourceToStringList("day4/input.test2.txt")).getNumberOfValidPassports(true);
        Assertions.assertEquals(4L, numberOfValidPassports);
    }

    @Test
    void getNumberOfValidPassportsIncludeValueCheck_given_actualInput() {
        long numberOfValidPassports = new PassportValidator(Utils.resourceToStringList("day4/input.txt")).getNumberOfValidPassports(true);
        Assertions.assertEquals(198L, numberOfValidPassports);
    }
}
package be.upgrade.it.adventofcode2020.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void getNumberOfValidPasswords_given_testInput() {
        Assertions.assertEquals(2, new PasswordValidator().getNumberOfValidPasswords("day2/input.test.txt"));
    }

    @Test
    void getNumberOfValidPasswords_given_actualInput() {
        Assertions.assertEquals(515, new PasswordValidator().getNumberOfValidPasswords("day2/input.txt"));
    }

    @Test
    void getNumberOfValidPasswordsNewPolicy_given_testInput() {
        Assertions.assertEquals(1, new PasswordValidator().getNumberOfValidPasswordsNewPolicy("day2/input.test.txt"));
    }

    @Test
    void getNumberOfValidPasswordsNewPolicy_given_actualInput() {
        Assertions.assertEquals(711, new PasswordValidator().getNumberOfValidPasswordsNewPolicy("day2/input.txt"));
    }
}
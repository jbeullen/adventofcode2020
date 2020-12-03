package be.upgrade.it.adventofcode2020.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExpenseReportTest {
    @Test
    void calculateExpenses_given_testInput() {
        long expenses = new ExpenseReport().calculateExpensesWithSumOfTwoBeing2020("day1/input1.test.txt");
        Assertions.assertEquals(514579, expenses);
    }

    @Test
    void calculateExpenses_given_actualInput() {
        long expenses = new ExpenseReport().calculateExpensesWithSumOfTwoBeing2020("day1/input1.txt");
        Assertions.assertEquals(997899, expenses);
    }

    @Test
    void calculateExpenses2_given_testInput() {
        long expenses = new ExpenseReport().calculateExpensesWithSumOfThreeBeing2020("day1/input1.test.txt");
        Assertions.assertEquals(241861950, expenses);
    }

    @Test
    void calculateExpenses2_given_actualInput() {
        long expenses = new ExpenseReport().calculateExpensesWithSumOfThreeBeing2020("day1/input1.txt");
        Assertions.assertEquals(131248694, expenses);
    }
}
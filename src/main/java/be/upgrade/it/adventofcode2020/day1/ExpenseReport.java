package be.upgrade.it.adventofcode2020.day1;

import be.upgrade.it.adventofcode2020.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseReport {

    public long calculateExpensesWithSumOfTwoBeing2020(String file){
        List<Long> numbers = getNumbers(file);
        return calculateCost(numbers, 2020L);
    }

    public long calculateExpensesWithSumOfThreeBeing2020(String file){
        List<Long> numbers = getNumbers(file);
        for (Long number : numbers) {
            long sum = 2020L - number;
            long cost = calculateCost(numbers, sum);
            if(cost != 0L){
                return number * cost;
            }
        }
        return 0L;
    }

    private long calculateCost(List<Long> numbers, Long sum) {
        for (Long number : numbers) {
            long difference = sum - number;
            if(numbers.contains(difference)){
                return number * (difference);
            }
        }
        return 0L;
    }

    private List<Long> getNumbers(String file) {
        String[] input = Utils.resourceToStringList(file);
        return Arrays.stream(input).map(Long::valueOf).collect(Collectors.toList());
    }
}

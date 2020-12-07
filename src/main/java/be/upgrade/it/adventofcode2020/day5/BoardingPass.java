package be.upgrade.it.adventofcode2020.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BoardingPass {
    private final String row;
    private final String column;

    public BoardingPass(final String input) {
        row = input.substring(0, 7);
        column = input.substring(7);
    }

    public final long getRow(){
        String binaryRow = row.replace('B', '1').replace('F', '0');
        long l = Long.parseLong(binaryRow, 2);
        return l;
    }

    public final long getColumn(){
        String binaryColumn = column.replace('R', '1').replace('L', '0');
        long l = Long.parseLong(binaryColumn, 2);
        return l;
    }

    public long getSeatId(){
        return getRow() * 8 + getColumn();
    }

    public final static long getHighestSeatId(String[] input){
        Optional<Long> optional = Arrays.stream(input)
                .map(s -> new BoardingPass(s).getSeatId())
                .sorted(Comparator.reverseOrder())
                .findFirst();

        return optional.orElse(0L);
    }

    public final static long findMySeatId(String[] input){
        List<Long> seatIdsSorted = Arrays.stream(input)
                .map(s -> new BoardingPass(s).getSeatId())
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < seatIdsSorted.size() - 1; i++) {
            long l1 = seatIdsSorted.get(i);
            long l2 = seatIdsSorted.get(i+1);

            if(l2-l1 != 1){
                return l1+1;
            }

        }
        return -1L;
    }
}

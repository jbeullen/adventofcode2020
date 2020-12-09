package be.upgrade.it.adventofcode2020.day9;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {
    @Test
    public void findFirstEncodingError_given_testInput(){
        assertEquals(127L, new Encoder(5,Utils.resourceToStringList("day9/input.test.txt")).findFirstEncodingError());

    }

    @Test
    public void findFirstEncodingError_given_actualInput(){
        assertEquals(133015568L, new Encoder(25,Utils.resourceToStringList("day9/input.txt")).findFirstEncodingError());
    }


    @Test
    public void findEncryptionWeakness_given_testInput(){
        assertEquals(62L, new Encoder(5,Utils.resourceToStringList("day9/input.test.txt")).findEncryptionWeakness());

    }

    @Test
    public void findEncryptionWeakness_given_actualInput(){
        assertEquals(16107959L, new Encoder(25,Utils.resourceToStringList("day9/input.txt")).findEncryptionWeakness());
    }

}
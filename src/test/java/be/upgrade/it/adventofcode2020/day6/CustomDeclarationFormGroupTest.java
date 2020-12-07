package be.upgrade.it.adventofcode2020.day6;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomDeclarationFormGroupTest {
    @Test
    public void getNumberOfYesQuestions_given_staticInput(){
        assertEquals(3, new CustomDeclarationFormGroup("abc").getNumberOfYesQuestions());
        assertEquals(3, new CustomDeclarationFormGroup("abac").getNumberOfYesQuestions());
        assertEquals(1, new CustomDeclarationFormGroup("aaaa").getNumberOfYesQuestions());
        assertEquals(1, new CustomDeclarationFormGroup("b").getNumberOfYesQuestions());
    }

    @Test
    public void getTotalNumberOfYesQuestionsForAllGroups_given_testInput(){
        assertEquals(11, CustomDeclarationFormGroup.getTotalNumberOfYesQuestionsForAllGroups(Utils.resourceToStringList("day6/input.test.txt")));
    }

    @Test
    public void getTotalNumberOfYesQuestionsForAllGroups_given_actualInput(){
        assertEquals(11, CustomDeclarationFormGroup.getTotalNumberOfYesQuestionsForAllGroups(Utils.resourceToStringList("day6/input.txt")));
    }

}
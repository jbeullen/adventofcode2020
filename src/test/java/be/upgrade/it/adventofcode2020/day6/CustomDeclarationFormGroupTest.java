package be.upgrade.it.adventofcode2020.day6;

import be.upgrade.it.adventofcode2020.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomDeclarationFormGroupTest {
    @Test
    public void getNumberOfYesQuestions_given_staticInput(){
        assertEquals(3, new CustomDeclarationFormGroup("abc").getNumberOfYesQuestions());
        assertEquals(3, new CustomDeclarationFormGroup("a","b","c").getNumberOfYesQuestions());
        assertEquals(3, new CustomDeclarationFormGroup("ab","ac").getNumberOfYesQuestions());
        assertEquals(1, new CustomDeclarationFormGroup("a","a","a","a").getNumberOfYesQuestions());
        assertEquals(1, new CustomDeclarationFormGroup("b").getNumberOfYesQuestions());
    }

    @Test
    public void getTotalNumberOfYesQuestionsForAllGroups_given_testInput(){
        assertEquals(11, CustomDeclarationFormGroup.getTotalNumberOfYesQuestionsForAllGroups(Utils.resourceToStringList("day6/input.test.txt")));
    }

    @Test
    public void getTotalNumberOfYesQuestionsForAllGroups_given_actualInput(){
        assertEquals(6662, CustomDeclarationFormGroup.getTotalNumberOfYesQuestionsForAllGroups(Utils.resourceToStringList("day6/input.txt")));
    }

    @Test
    public void getNumberOfQuestionsWhereEveryOneAnsweredYes_given_staticInput(){
        assertEquals(3, new CustomDeclarationFormGroup("abc").getNumberOfQuestionsWhereEveryOneAnsweredYes());
        assertEquals(0, new CustomDeclarationFormGroup("a","b","c").getNumberOfQuestionsWhereEveryOneAnsweredYes());
        assertEquals(1, new CustomDeclarationFormGroup("ab","ac").getNumberOfQuestionsWhereEveryOneAnsweredYes());
        assertEquals(1, new CustomDeclarationFormGroup("a","a","a","a").getNumberOfQuestionsWhereEveryOneAnsweredYes());
        assertEquals(1, new CustomDeclarationFormGroup("b").getNumberOfQuestionsWhereEveryOneAnsweredYes());
    }

    @Test
    public void getTotalNumberOfQuestionsWhereEveryOneAnsweredYesForAllGroups_given_testInput(){
        assertEquals(6, CustomDeclarationFormGroup.getTotalNumberOfQuestionsWhereEveryOneAnsweredYesForAllGroups(Utils.resourceToStringList("day6/input.test.txt")));
    }

    @Test
    public void getTotalNumberOfQuestionsWhereEveryOneAnsweredYesForAllGroups_given_actualInput(){
        assertEquals(3382, CustomDeclarationFormGroup.getTotalNumberOfQuestionsWhereEveryOneAnsweredYesForAllGroups(Utils.resourceToStringList("day6/input.txt")));
    }
}
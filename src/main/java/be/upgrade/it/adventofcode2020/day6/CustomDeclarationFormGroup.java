package be.upgrade.it.adventofcode2020.day6;

import java.util.*;

public class CustomDeclarationFormGroup {
    private final String[] forms;

    public CustomDeclarationFormGroup(String... forms) {
        this.forms = forms;
    }

    public final int getNumberOfYesQuestions(){
        Set<Character> unique = new HashSet<>();
        for (String form : forms) {
            for (char c : form.toCharArray()) {
                unique.add(c);
            }
        }
        return unique.size();
    }

    public final int getNumberOfQuestionsWhereEveryOneAnsweredYes(){
        String first = forms[0];
        Set<Character> intersect = toSet(first);

        for (int i = 1; i < forms.length; i++) {
            intersect.retainAll(toSet(forms[i]));
        }

        return intersect.size();
    }

    private Set<Character> toSet(String first) {
        Set<Character> set = new HashSet<>();
        for (char c : first.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    public static final int getTotalNumberOfYesQuestionsForAllGroups(String[] input) {
        List<CustomDeclarationFormGroup> groups = extractGroups(input);

        int sum = 0;
        for (CustomDeclarationFormGroup group : groups) {
            sum += group.getNumberOfYesQuestions();
        }
        return sum;
    }

    public static final int getTotalNumberOfQuestionsWhereEveryOneAnsweredYesForAllGroups(String[] input) {
        List<CustomDeclarationFormGroup> groups = extractGroups(input);

        int sum = 0;
        for (CustomDeclarationFormGroup group : groups) {
            sum += group.getNumberOfQuestionsWhereEveryOneAnsweredYes();
        }
        return sum;
    }

    private static List<CustomDeclarationFormGroup> extractGroups(String[] input) {
        List<String> strings = Arrays.asList(input);
        List<CustomDeclarationFormGroup> groups = new ArrayList<>();

        int start = 0;
        int end = -1;

        for (int i = 0; i < input.length; i++) {
            if ("".equals(input[i])) {
                end = i;
                CustomDeclarationFormGroup formGroup = new CustomDeclarationFormGroup(strings.subList(start, end).toArray(new String[0]));
                groups.add(formGroup);
                start = end + 1;
                end = -1;
            }
        }

        CustomDeclarationFormGroup formGroup = new CustomDeclarationFormGroup(strings.subList(start, strings.size()).toArray(new String[0]));
        groups.add(formGroup);
        return groups;
    }
}

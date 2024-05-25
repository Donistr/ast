package task4;

import java.util.*;

public class Test {

    private static final int COUNT = 5;

    public static void main(String[] args) {
        List<String> strings = getStringsFromInput(COUNT);

        findMinAndMaxStrings(strings); //task 1
        findLessAvgStrings(strings); //task 2
        findFirstUniqueWord(strings); //task 3
        duplicateChars(strings.get(0)); //task 4
    }

    private static List<String> getStringsFromInput(int count) {
        List<String> res = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Enter string: ");
            res.add(scanner.nextLine());
        }

        return res;
    }

    private static void findMinAndMaxStrings(List<String> strings) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).compareTo(strings.get(minIndex)) < 0) {
                minIndex = i;
            } else if (strings.get(i).compareTo(strings.get(maxIndex)) > 0) {
                maxIndex = i;
            }
        }

        System.out.println("min string: " + strings.get(minIndex) + " length: " + strings.get(minIndex).length());
        System.out.println("max string: " + strings.get(maxIndex) + " length: " + strings.get(maxIndex).length());
    }

    private static void findLessAvgStrings(List<String> strings) {
        double avg = 0;
        for (String string : strings) {
            avg += string.length();
        }
        avg /= strings.size();

        System.out.println("less than avg: ");
        for (String string : strings) {
            if (string.length() < avg) {
                System.out.println(string + " length: " + string.length());
            }
        }
    }

    private static void findFirstUniqueWord(List<String> strings) {
        Set<String> words = new LinkedHashSet<>();
        for (String string : strings) {
            string = string.trim();
            String[] arr = string.split(" ");

            words.addAll(Arrays.asList(arr));
        }

        for (String word : words) {
            Set<Character> letters = new LinkedHashSet<>();
            boolean unique = true;

            for (char ch : word.toCharArray()) {
                if (letters.contains(ch)) {
                    unique = false;
                    break;
                }

                letters.add(ch);
            }

            if (unique) {
                System.out.println("first unique word: " + word);
                return;
            }
        }

        System.out.println("no unique words");
    }

    private static void duplicateChars(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : string.toCharArray()) {
            stringBuilder.append(ch).append(ch);
        }

        System.out.println("duplicated chars string: " + stringBuilder);
    }
}

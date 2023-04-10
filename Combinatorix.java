import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinatorix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères pour trouver ses combinaisons : ");
        String input = scanner.nextLine();
        scanner.close();

        List<String> combinations = getCombinations(input);
        for (String string : combinations) {
            System.out.println(string);
        }
    }

    public static List<String> getCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return combinations;
        }
        if (input.length() == 1) {
            combinations.add(input);
            return combinations;
        }
        for (int i = 0; i < input.length(); i++) {
            String first = String.valueOf(input.charAt(i));
            String rest = input.substring(0, i) + input.substring(i + 1);
            List<String> subCombinations = getCombinations(rest);
            for (String subCombination : subCombinations) {
                combinations.add(first + subCombination);
            }
        }
        return combinations;
    }
}
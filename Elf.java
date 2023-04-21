import java.util.Scanner;

public class Elf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        int numsToBeRemoved = 0;
        int[] letterCount = new int[26];

        for (char allChars : firstWord.toCharArray()) {
            letterCount[allChars - 'a']++;
        }

        for (char allChars : secondWord.toCharArray()) {
            letterCount[allChars - 'a']--;
        }

        for (int count : letterCount) {
            numsToBeRemoved += Math.abs(count);
        }

        System.out.println("Result: " + numsToBeRemoved);

    }
}

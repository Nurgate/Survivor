import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> countOfBalls = new HashMap<>();

        while (!input.equals("End")) {
            String[] parts = input.split(": ");
            String color = parts[0];
            int counter = Integer.parseInt(parts[1]);
            countOfBalls.put(color, counter);

            input = scanner.nextLine();
        }

        int ballsToBeRemoved = Integer.MAX_VALUE;
        for (int count : countOfBalls.values()) {
            ballsToBeRemoved = Math.min(ballsToBeRemoved, count);
        }
        System.out.println(ballsToBeRemoved);
    }
}

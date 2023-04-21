public class CarrotGarden {

    public static void main(String[] args) {
        int[][] garden = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 1}
        };

        int jumps = calculateJumps(garden);
        System.out.println(jumps);
    }

    public static int calculateJumps(int[][] garden) {
        int jumps = 0;
        int rows = garden.length;
        int cols = garden[1].length;

        // Iterate through each cell in the garden
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (garden[i][j] == 1) { // If carrot is found in current cell

                    // Check if there are no carrots in adjacent cells (left and right)

                    if ((j == 0 || garden[i][j - 1] == 0) && (i == rows - 1 || garden[i + 1][j] == 0)) {
                        jumps++;
                    }
                }
            }
        }
        return jumps;
    }
}
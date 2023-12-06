package basicProgramming.inputOutput;

import java.util.Scanner;

public class CostOfBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int greenBalloonCost = scanner.nextInt();
            int purpleBalloonCost = scanner.nextInt();
            int greenBallonSolved = 0;
            int purpleBallonSolved = 0;

            scanner.nextLine();

            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                int greenProblemSolver = scanner.nextInt();
                if (greenProblemSolver == 1) {
                    greenBallonSolved++;
                }

                int purpleProblemSolver = scanner.nextInt();
                if (purpleProblemSolver == 1) {
                    purpleBallonSolved++;
                }
            }
            int totalGreenBallonCostOption1 = greenBallonSolved * greenBalloonCost;
            int totalPurpleBallonCostOption1 = purpleBallonSolved * purpleBalloonCost;

            int temp = greenBallonSolved;
            greenBallonSolved = purpleBallonSolved;
            purpleBallonSolved = temp;

            int totalGreenBallonCostOption2 = greenBallonSolved * greenBalloonCost;
            int totalPurpleBallonCostOption2 = purpleBallonSolved * purpleBalloonCost;

            int totalCostOption1 = totalGreenBallonCostOption1 + totalPurpleBallonCostOption1;
            int totalCostOption2 = totalGreenBallonCostOption2 + totalPurpleBallonCostOption2;

            int minimumCost = Math.min(totalCostOption1, totalCostOption2);

            System.out.println(minimumCost);
        }
        scanner.close();
    }
}

package week2;

import java.util.Random;

public class diceGambling {
    public static void main(String[] args) {
        int totalWinnings;
        int i = 0;

        for(totalWinnings = 0; totalWinnings < 50; i++){
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            System.out.println("Dice is:" + die);

            if ((die == 1) || (die == 2)) {
                System.out.println("Game over!!");
                break;
            }
            if (die == 3) {
                totalWinnings = totalWinnings + 0;
                System.out.println("The dice is rolled again." + "Dice is:" + die);
                System.out.println("Total Winnings is: " + totalWinnings);
                die = random.nextInt(6) + 1;
            }
            if (die == 4) {
                totalWinnings = totalWinnings + 4;
                System.out.println("The dice is rolled again." + "Dice is:" + die);
                System.out.println("Total Winnings is: " + totalWinnings);
                die = random.nextInt(6) + 1;
            }
            if (die == 5) {
                totalWinnings = totalWinnings + 5;
                System.out.println("The dice is rolled again." + "Dice is:" + die);
                System.out.println("Total Winnings is: " + totalWinnings);
                die = random.nextInt(6) + 1;
            }
            if (die == 6) {
                totalWinnings = totalWinnings + 6;
                System.out.println("The dice is rolled again." + "Dice is:" + die);
                System.out.println("Total Winnings is: " + totalWinnings);
                die = random.nextInt(6) + 1;
            }
        }
        if (totalWinnings >= 50) {
            System.out.println("You have earned the maximum amount of money you can earn." + "Total Winnings is: " + totalWinnings);
        }

        }
    }
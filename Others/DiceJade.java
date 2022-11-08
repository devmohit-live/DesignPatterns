import java.util.Scanner;

public class DiceJade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter 3 space seperated numbers between 1 and 6");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1 || num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Number not is range , Shutting down the game!");
            System.exit(0);

        }

        int sum = num1 + num2 + num3;
        int sumDIceRolls = roll1 + roll2 + roll3;

        boolean ans = checkWin(sum, sumDIceRolls);
        if (ans)
            System.out.println("Congratulations !!!!");
        else
            System.out.println("Oops try next time");

        sc.close();
    }

    /**
     * checkWin
     * 
     * @param userScore (int)
     * @param diceScore (int)
     * @return boolean
     * 
     *         Check wheter user has won the game or not by comparign scores
     */
    private static boolean checkWin(int userScore, int diceScore) {
        return userScore < diceScore;
    }

    /**
     * rollDice
     * 
     * @return int
     * 
     *         Return a random number between 1 and 6 inclusive
     */
    public static int rollDice() {
        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;
    }

}

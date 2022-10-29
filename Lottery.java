import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Class to generate a random lottery ticket of 6 numbers
 */
public class Lottery {
    ArrayList<Integer> lotteryTicket = new ArrayList<Integer>();
    int[] winningNumbers = {3, 16, 20, 28, 36, 45};
    int matchCounter = 0;
    ArrayList<Integer> matches = new ArrayList<Integer>();

    /**
     * Generate array with 6 random numbers
     * @return array of lottery numbers
     */
    public ArrayList<Integer> generateTicket() {
        if (lotteryTicket.size() > 6) {
            lotteryTicket.clear();
        }

        for (int i = 0; i < 6; i++) {
            int num = generateRandom();

            lotteryTicket.add(num);
        }

        Collections.sort(lotteryTicket);

        return lotteryTicket;
    }

    /**
     * Method to compare lottery numbers with winning numbers
     */
    public void compare() {
        matchCounter = 0;
        matches.clear();
        
        for (int i = 0; i < 6; i++) {
            if (lotteryTicket.get(i) == winningNumbers[i]) {
                matchCounter++;
                matches.add(winningNumbers[i]);
            }
        }

        switch (matchCounter) {
            case 0:
                System.out.println("Matches are: " + matches + " ===> Not a Winner");
                break;
            case 1:
                System.out.println("Matches are: " + matches + " ===> Not a Winner");
                break;
            case 2:
                System.out.println("Matches are: " + matches + " ===> Won Free Ticket");
                break;
            case 3:
                System.out.println("Matches are: " + matches + " ===> Won $10");
                break;
            case 4:
                System.out.println("Matches are: " + matches + " ===> Won a share from %9.5 of the pot");
                break;
            case 5:
                System.out.println("Matches are: " + matches + " ===> Won a share from %5 of the pot");
                break;
            case 6:
                System.out.println("Matches are: " + matches + " ===> Won Jackpot!");
                break;
            default:
                break;
        }
    }

    /**
     * Method to generate one random number from 1 to 99
     * @return
     */
    public int generateRandom() {
        Random rand = new Random();
        int min = 1;
        int max = 49;
        return rand.nextInt(max + 1 - min) + min;
    }
}
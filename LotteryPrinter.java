import java.util.Scanner;

/**
 * Ask user to generate lottery ticket or not
 * Will keep asking until user declines
 */
public class LotteryPrinter {
    public static void main(String[] args)
    {
        String response = "y";
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want a random ticket? (Y/N): ");
            response = in.next();

            if (response.equals("n") || response.equals("N")) {
                break;
            } else if (response.equals("y") || response.equals("Y")) {

                Lottery ticket = new Lottery();
                System.out.println("Random Ticket #: " + ticket.generateTicket());
                System.out.println("The Winning Draw Numbers are: [3, 16, 20, 28, 36, 45]");
                ticket.compare();

            } else {
                System.out.println("Answer only with Y or N");
            }
        };
        
        in.close();
    }

}

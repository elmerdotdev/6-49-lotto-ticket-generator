/**
 * Tester class to test different methods
 */
public class LotteryTester {
    public static void main(String[] args)
    {
        Lottery generator = new Lottery();
        System.out.println("Random Ticket #: " + generator.generateTicket());
        System.out.println("The Winning Draw Numbers are: [3, 16, 30, 58, 72, 82]");
        generator.compare();
    }
    
}

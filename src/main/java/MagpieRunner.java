import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{
    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
    	Magpie maggie = new Magpie();
    	
    	System.out.println (maggie.getGreeting());
    	Scanner in = new Scanner (System.in);
    	String statement = in.nextLine();
    	
    	while (!statement.equals("Bye"))
    	{
            if (statement.indexOf("cat") != -1){
            System.out.println("Tell me more about your pets");
            statement = in.nextLine();
        }
            if (statement.indexOf("dog") != -1 ){
            System.out.println("Tell me more about your pets");
            statement = in.nextLine();
            }
            if (statement.indexOf("Mr.") != -1|| statement.indexOf("Miss") != -1){
                System.out.println("He sounds like a good teacher.");
                statement = in.nextLine();
            }
            if (statement.trim().length() == 0) {
                System.out.println("Please say something please")
            }
            else {
                System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
        }
        in.close();
    }
}

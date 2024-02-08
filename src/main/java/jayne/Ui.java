package jayne;

import java.util.Scanner;
/**
 * Handles interactions with the user, including reading input and displaying messages.
 */
public class Ui {
    /**
     * Reads a command from the user.
     *
     * @return the command entered by the user as a String.
     */
    public String readCommand() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * Displays a welcome message to the user when the application starts.
     */
    public String showWelcome() {
//        System.out.println("___________________________________");
//        System.out.println("Hello! I'm Jayne");
//        System.out.println("What can I do for you?");
//        System.out.println("___________________________________");
        return "Wakey Wakey Snowiee\n" + "its time for schooooll.\n"
                + "What do you need?";
    }
    /**
     * Provides a generic question prompt when the user enters an unrecognized command.
     *
     * @return a String containing a message asking the user to input a valid command.
     */
    public String question() {
//        System.out.println("___________________________________");
//        System.out.println("What are you typing. please include either bye, list, mark, "
//                + "umark, todo, deadline or event in your inputs please");
//        System.out.println("___________________________________");
        return "What are you typing. please include either bye, list, mark, "
                + "umark, todo, deadline or event in your inputs please";
    }

}

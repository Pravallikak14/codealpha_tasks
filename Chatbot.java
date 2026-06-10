import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started");
        System.out.println("Type 'bye' to exit");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("hello")) {
                System.out.println("Bot: Hi there!");
            }
            else if (input.equals("how are you")) {
                System.out.println("Bot: I am fine.");
            }
            else if (input.equals("what is your name")) {
                System.out.println("Bot: I am CodeAlpha Chatbot.");
            }
            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}

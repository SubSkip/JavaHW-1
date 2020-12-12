
/*This simple program will take user input of an animal and print 
* out a sentance says what the animal sounds like.
* If the animal is not recognized, the program will have a default reponse.
*/
import java.util.Scanner;

//comment
public class animals {
    // Scanner userInput = new Scanner(System.in); Can't declare the variable here
    // and use it.
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Name an animal:");
        String animal = userInput.nextLine();
        if (animal.equals("cat")) {
            System.out.printf("The %s says, Meow!", animal); // Changed to use %s for input variable.
        } else if (animal.equals("dog")) {
            System.out.printf("The %s says, Bark!", animal);
        } else if (animal.equals("cow")) {
            System.out.printf("The %s says, Moo!", animal);
        } else if (animal.equals("pig")) {
            System.out.printf("The %s says, Oink!", animal);
        } else {
            System.out.printf("I do not recognize that animal.");
        }
        userInput.close(); // adding this at the end will remove the "Resource leak: 'foo' is never closed"
                           // warning.
    }
}


/*This simple program will take user input of an animal and print 
* out a sentance says what the animal sounds like.
* If the animal is not recognized, the program will have a default reponse.
*/
import java.util.Scanner;

//comment
public class animals {
    // Scanner userInput = new Scanner(System.in); Can't declare the variable here
    // and use it
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Name an animal:");
        String animal = userInput.nextLine();
        if (animal.equals("cat")) {
            System.out.printf("The cat says Meow!");
        } else if (animal.equals("dog")) {
            System.out.printf("The dog says Bark!");
        } else if (animal.equals("cow")) {
            System.out.printf("The cow says Moo!");
        } else if (animal.equals("pig")) {
            System.out.printf("The pig says Oink!");
        } else {
            System.out.printf("I do not recognize that animal.");
        }
    }
}

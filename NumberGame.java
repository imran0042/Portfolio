import java.util.*;

class Game{
    void play() {
        Scanner sc = new Scanner(System.in);
        int random,guess,numberOfGuesses = 1;
        Random rand = new Random();
        random = rand.nextInt(100);

        do {
            System.out.println("Guess the number between 1 to 100: ");
            guess = sc.nextInt();
            if(guess>random) {
                System.out.println("Too High");
            }
            else if(guess<random) {
                System.out.println("Too Low");
            }
            else {
                System.out.println("You guessed it in "+numberOfGuesses+" attempts");
            }
            if(numberOfGuesses == 10) {
                System.out.println("You have completed your 10 attempts...........");
                break;
            }
            numberOfGuesses++;
        }while(guess!=random);
    }
}
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        while(true) {
            game.play();
            System.out.println("Press 1 to play again: \nPress any key to exit: ");
            if(sc.nextInt() == 1) {
                System.out.println("Your new round has started....................");
            }
            else {
                return;
            }
        }
    }
}


import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do { 
            System.out.println("Guess my number(1 - 100) : ");
            userNumber = scanner.nextInt();
            if(userNumber == myNumber){
                System.out.println("OHOOO...CORRECT NUMBER");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        } while (userNumber >= 0);

        System.out.println("myNumber was : " + myNumber);
        
    }
    
}

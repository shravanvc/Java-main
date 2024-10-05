
import java.util.Scanner;



public class Loop {
    public static void main(String[] args) {

     //   for(int i=100;i>=0;i--) {
      //      System.out.println(i);

        //}
    //    int j = 100;
    //    while(j >= 1){
    //        System.out.println(j);
    //        j = j - 1;
    //    }

        // Do while
 //       int k = 100;
 //       do { 
 //          System.out.println(k);
 //          k = k - 1; 
 //       } while (k >= 1);
             
     
      Scanner scanner = new Scanner(System.in);
      int number = 0;
      do { 
          System.out.println("input a number");
          number = scanner.nextInt();
          System.out.println("the input number is : " + number);
      } while (number >= 0);

      System.out.println("The end");
  }         
}

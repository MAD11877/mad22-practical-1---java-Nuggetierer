import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter Height: ");
    double height = in1.nextDouble();
    
    Scanner in2 = new Scanner(System.in);
    System.out.println("Enter Weight: ");
    double weight = in2.nextDouble();
    
    double BMI = weight / (height  * height);
    System.out.println(BMI);
  }
}

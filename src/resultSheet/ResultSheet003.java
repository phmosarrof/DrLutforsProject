import java.util.Scanner;

package resultSheet;

/**
 * @author Mosarrof Hossain
 *
 */
public class ResultSheet003 {

	
	public ResultSheet003() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			
			    Scanner keyboard = new Scanner(System.in);
			
			    int testScoreA;
			
			    int testScoreB;
			
			    int testScoreC;
			
			    int testScoreD;
			
			    int testScoreE;
			
			    System.out.print("Enter your first test score: ");
			
			    testScoreA = keyboard.nextInt();
			
			    System.out.print("Enter your second test score: ");
			
			    testScoreB = keyboard.nextInt();
			
			    System.out.print("Enter your third test score: ");
			
			    testScoreC = keyboard.nextInt();
			
			    System.out.print("Enter your fourth test score: ");
			
			    testScoreD = keyboard.nextInt();
			
			    System.out.print("Enter your fifth test score: ");
			
			    testScoreE = keyboard.nextInt();
			
			    keyboard.nextLine();
			
			    double average = calcAverage(testScoreA,testScoreB, testScoreC, testScoreD, testScoreE);
			
			    System.out.println("The average is: ");
		
			    determineGrade(average);
			
			    }
			
			 
			
			    public static double calcAverage(int testScoreA, int testScoreB, int testScoreC, int testScoreD, int testScoreE)
			
			    {
			
			        double average = (testScoreA + testScoreB + testScoreC + testScoreD + testScoreE) / 5;
			
			        return average;
			
			         
			
			    }
			
			 
			
			    public static double determineGrade(double average)
			
			    {
			
			        if (average>90)
			
			        {
			
			            System.out.println("You got an A");
			
			        }
			
			        else if (average>=80)
		
			        {
			
			            System.out.println("You got a B");
			
			        }
			
			        else if (average>=70)
			
			        {
			
			            System.out.println("You got a C");
			
			        }
			
			        else if (average>=60)
			
			        {
			
			            System.out.println("You got a D");
		
			        }
			
			        else if (average<60)
			
			        {
			
			            System.out.println("You got an F");
			
			        }

		
	}

}

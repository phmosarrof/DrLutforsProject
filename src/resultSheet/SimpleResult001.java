package resultSheet;

public class SimpleResult001 {

	public SimpleResult001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Total = "100"; // Total Mark.
		
		int A,B,C,D,F;
						/*
						 * A = mark of student roll-01, Karim 
						 * B = mark of student roll-02, Rahim
						 * C = mark of student roll-03, Rakib
						 * M = mark of student roll-04;	Hossain
						 */
		
					/* if you change the value of the below list than
					   you can get the expected result*/
		
		A = 74; 	// Range >=75 to <=100,
		B = 65; 	// Range >=65 to <=75,
		C = 55; 	// Range >=55 to <=65,
		D = 30; 	// Range >=40 to <=55,
		F = 30; 	// Range >=0 to <=40,
		
		
		if(A>=75)
			
		{	
			System.out.println("Roll  : 01");
			System.out.println("Name  : Abdul karim");
			System.out.println("Grade : A");
		}
		
		else if(B>=65 && A<75)
			
		{
			System.out.println("Roll  : 02");
			System.out.println("Name  : Abdur Rahim");
			System.out.println("Grade : B");
		}
		
		else if (C>=55 && C<=65)
			
		{
			System.out.println("Roll  : 03");
			System.out.println("Name  : Rakib Hasan");
			System.out.println("Grade : C");
		}
		
		else if (D>=40 && D<=55)
			
		{
			System.out.println("Roll  : 04");
			System.out.println("Name  : Dalowar Hossain");
			System.out.println("Grade : D");
		}
		
		else 
		
		{
			System.out.println("Sorry! You should practice more. (That means you are fail)");
		}
	}

}

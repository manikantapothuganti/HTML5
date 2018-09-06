import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Guess the number Limit : 1 to 50 ");
		int a=sn.nextInt();
		if ((a<1)||(a>50))
		{
			System.out.println("Entered number is out of bounds");
		}
		else if (a>23)
		{
			System.out.println("Entered number is greater than the actual number");
		}
		else if (a<23)
		{
			System.out.println("Entered number is  less than the actual number");
		}
		else
		{
			System.out.println("Entered number is  equal to the actual number");
		}
		

	}

}

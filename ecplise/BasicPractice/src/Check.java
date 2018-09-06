import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		String s;
		Scanner sn = new Scanner(System.in);
		s=sn.nextLine();
				char c = s.charAt(0);
				if (Character.isUpperCase(c))
			    {
			    	System.out.println("Capital letter");
			    }
				else if (Character.isLowerCase(c))
			    {
			    	System.out.println("Small case letter");
			    }
				else if (Character.isDigit(c))
			    {
			    	System.out.println("Number");
			    }
				else 
			    {
			    	System.out.println("special symbol");
			    }

			

	}

}

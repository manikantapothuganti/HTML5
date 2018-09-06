import java.util.*;

public class RepeatString {

	public static void main(String[] args) {
		int k=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sn.nextLine();
		System.out.println("Enter the integer");
		int n = sn.nextInt();
		int j=s.length()-n;
		char z[] = new char[s.length()];
		for (int i=j;i<s.length();i++)
		{
			z[k]=s.charAt(i);
			k++;
		}
		System.out.print(s);
		
		for (int x=0;x<j;x++)
		{
			for (int y=0;y<j;y++)
			{
				System.out.print(z[y]);
			}
		}

	}

}

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String s = sn.nextLine();
		char a[] = new char[s.length()];
		for (int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
		}
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

	}

}

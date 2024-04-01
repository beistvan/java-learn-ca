public class Main
{
	public static void main (String[]args)
	{
		double numDouble = 12.99;
		System.out.println ("Double value: " + numDouble); // 12.99
		// convert a double to an int rounded to nearest value
		int numInt = (int) (numDouble + 0.5);
		System.out.println ("Int value: " + numInt); // 13
	}
}

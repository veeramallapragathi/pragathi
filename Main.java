import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

class Main
{
	public static void main(String path[])
	{
		try
		{
			Scanner vc = new Scanner(System.in);
			System.out.println("Enter a sentence:");
			String original = new String(vc.nextLine());
			String copy="";
			System.out.println("Enter string size:");
			int n=vc.nextInt();
			if(n!=original.length())
			{
				throw new MyException("incorrect string size:");
			}
			for(int i=0;i<n;i++)
			{
				copy=copy+original.charAt(i);
			}
			System.out.println("Original String:"+original);
			System.out.println("Safely handled");
		}
		catch (MyException ex)
		{
            System.out.println("Caught");
            System.out.println(ex.getMessage());
			System.out.println("UNSafely handled");
        }
	}
}
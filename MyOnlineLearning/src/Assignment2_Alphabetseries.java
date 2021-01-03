
public class Assignment2_Alphabetseries 
{

	public static void main(String[] args) 
	{
		int size = 5;
		for(int i=1;i<=size;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}	

	}

}

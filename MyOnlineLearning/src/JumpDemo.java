
public class JumpDemo 
{
	//break, continue
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			if(i == 3)
			{
				continue;
			}
			System.out.println("value is " + i);
			
		}
		System.out.println("******");
		for(int j=1; j<=5; j++)
		{
			if(j==4)
			{
				break;
			}
			System.out.println("value is " + j);
		}

	}

}
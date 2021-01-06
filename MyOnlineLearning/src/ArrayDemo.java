
public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		// int nums[] = new int[4];
		 int nums[] = {5,787,545,54,85}; // 1D array
		
//		nums[0] = 6;
//		nums[1] = 4;
//		nums[2] = 583;
//		nums[3] = 654;
		
//		for(int i=0; i<5;i++)
//		{
//			System.out.println(nums[i]);
//		}
		 //for each loop
		 for(int a : nums)
		 {
			 System.out.println(a);
		 }
		
		// 2D array
		int k[][] =
			{
					{1,5,4,7},
					{4,52,8,2},
					{85,2,5,5},
			};
				
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4;j++)
			{
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
		
		//for each loop
		
		for(int y[]:k)
		{
			for(int w : y)
			{
				System.out.print(w + " ");
			}
			System.out.println();
		}
		
		//Jagged array
		
		int o[][] =
			{
					{1,5,4,7},
					{4,52,8},
					{85,2,5,5},
			};
		for(int i=0; i<o.length;i++)
		{
			for(int j=0; j<o[i].length;j++)
			{
				System.out.print(o[i][j]+" ");
			}
			System.out.println();
		}
		
		// for each loop
		for(int b[] : o)
		{
			for(int c : b)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}

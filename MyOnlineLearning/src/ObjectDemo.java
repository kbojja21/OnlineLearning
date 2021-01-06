
class Calc
{
	int result;
	
	int perform(int num1,int num2)
	{
		return  result = num1 + num2; 
	}
}

public class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
//		obj.num1 = 10;
//		obj.num2 = 15;
		System.out.println(obj.perform(10, 15));

	}
}

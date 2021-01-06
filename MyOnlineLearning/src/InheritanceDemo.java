

class Calculator    // Super
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class AdvCalculator extends Calculator     // Sub
{
	public int sub(int i, int j)
	{
		return i+j;
	}
}
public class InheritanceDemo 
{

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		int res = cal.add(54, 54);
		System.out.println(res);
		
		AdvCalculator cal1 = new AdvCalculator();
		int res1 = cal1.add(54, 54);
		int res2 = cal1.sub(54, 54);
		
		System.out.println(res1 + " " +res2);

	}

}

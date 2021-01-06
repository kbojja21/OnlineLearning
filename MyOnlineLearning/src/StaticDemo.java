class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static // When you load a class
	{
		ceo = "Jose";
		System.out.println("in static");
	}
	public Emp() // When you create an object
	{
		eid = 1;
		salary = 6000;
		System.out.println("in constructor");
	}
	
	public void show()
	{
		System.out.println(eid + ":" + salary + ":"+ ceo);
	}
}
public class StaticDemo 
{

	public static void main(String[] args) 
	{
		Emp kiran = new Emp();
//		kiran.eid = 27;
//		kiran.salary = 8000;
//		Emp.ceo = "John";
//				
		Emp rahul = new Emp();
//		rahul.eid = 22;
//		rahul.salary = 7000;
//		Emp.ceo = "John"; // We don't need object to access static variable
//		
//		Emp.ceo = "kittu";
		
		kiran.show();
		rahul.show();

	}

}

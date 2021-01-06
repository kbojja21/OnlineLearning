class Outer
{
	int a;
	public void show()
	{
		
	}
static class Inner
{
	public void display()
	{
		System.out.println("in display");
	}
}

}
public class InnerDemo 
{

	public static void main(String[] args) 
	{
		Outer out = new Outer();
//		Outer.Inner in = out.new Inner(); // When Inner is not static
//		in.display();
		
		Outer.Inner in = new Outer.Inner(); // When Inner is static 
		in.display();

	}

}

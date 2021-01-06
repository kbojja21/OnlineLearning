class CheckMerge
{
	public void merge()
	{
		System.out.println("in merge");
	}
}

public class TestCla 
{

	public static void main(String[] args) 
	{
		// Test class to check the merge issue
		
		CheckMerge chc = new CheckMerge();
		chc.merge();
		

	}

}

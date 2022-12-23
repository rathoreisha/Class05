package practicepckg;


class C implements A
{
	public void m2()
	{
		System.out.println("My method");
	}
}


public class B  {
	public static void main(String[] args) 
	{
		C c=new C();
		c.m2();
		
	}
	

}

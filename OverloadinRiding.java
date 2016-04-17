package HomeWorkThree;

public class OverloadinRiding extends MethodOverLoadingRiding  {
	public static void main(String[] args) {
//		MethodOverLoadingRiding dk=new MethodOverLoadingRiding();
		OverloadinRiding dk1=new OverloadinRiding();
//		MethodOverLoadingRiding dk1=new MethodOverLoadingRiding();
//		OverloadinRiding.add(20, 10);
//		OverloadinRiding.add(10, 20, 30);
		dk1.add1(10, 20);
		dk1.add1(10, 20, 30);	
		dk1.add(10, 20);
		
	}	
	public void add1(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add1(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public void add(int a, int b)
	{
		System.out.println(a*b);
	}
	
	
}



package HomeWorkThree;

public class MethodOverLoadingRiding {
	public static void main(String[] args) {
		

	}
	public void add(int a,int b)
	{
		a=5;
		b=3;
		System.out.println(a+b);
	}
	public void add(int c,float d)
	{
		c=5;
		d=(float) 1.3;
		System.out.println(c+d);
	}
	public void add(String e,String f)
	{
		e="dk";
		f="aravind";
		System.out.println(e+f);
	}
	
}
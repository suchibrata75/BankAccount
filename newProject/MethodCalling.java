package newProject;

public class MethodCalling {

	public static void main(String[] args) {
		
		int addition = add(30,50);
		int subtraction = subtract(90,30);
		
		System.out.println("addition = "+ addition);
		System.out.println("subtraction = "+ subtraction);
	}
	
	static int add(int a, int b)
	{
		return (a+b);
	}
	static int subtract(int a,int b)
	{
		return (a-b);
	}
}

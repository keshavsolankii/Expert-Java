
// package java11.training;

public class InitBlocks {
	
	
	static 
	{
		System.out.println("static init-1");
		count=15;
	}
	
	{
		System.out.println("3");
	}
	{
		age = 18;
		System.out.println("1");
	}

	{
		System.out.println("2");
	}
	int ans = 10;
	static int count;// Order of declaration doesn't matter
	int age;	

	static 
	{
		System.out.println("static init-2");
		count=12;
	}

	void checkNonStatic()
	{
		ans++;
		count++;
	}
	
	static void check() {
		count++;
		System.out.println("Database.check()");
		// ans++;  --> Cannot use non static variables in static methods
	}
	public static void main(String [] args)
	{
		InitBlocks d1 = new InitBlocks();
		InitBlocks d2 = new InitBlocks();
		System.out.println(InitBlocks.count);

	}
}

	
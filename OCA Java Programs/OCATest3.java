public class OCATest3 {

	public static void main(String[] args) {
		int a=10,b=5;
		
//		int r=a++*--b/++a%--b;
		
//		boolean r=--a<b++ && a++!=--b;
		boolean r=--a<b++ & a++!=--b;//bitwise AND
//		boolean r=--a<b++ || a++!=--b;
//		boolean r=--a>b++ || a++!=--b;
//		boolean r=--a>b++ | a++!=--b;//bitwise OR
		
		//int r=2<3?4+9:6-2;
		//int r=2<3?4+9:6<2;//error
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(r);
		
		
	}

}
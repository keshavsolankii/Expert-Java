package OCA_ClassObject;
class Aa {
	int x;
	void m() {
		System.out.println(x++);
	}
}
public class OCA_ClassObject2 {
	public static void main(String[] args) {
		Aa a=new Aa();
		System.out.println(a.x++);
		a.m();
		Aa a2=a; // Refer to the same object, so no new schema
		a2.m();
		System.out.println(a2.x);
		a=new Aa(); // Now refers to a newly created object variable, so new schema will be created
		System.out.println(a.x);
		System.out.println(a2.x);
	}
}

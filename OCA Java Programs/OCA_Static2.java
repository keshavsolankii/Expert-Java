package OCA_ClassObject;
public class OCA_Static2 {
	static String flag="true";
	int x=10;
	OCA_Static2 m() {
		flag+=x++;
		return new OCA_Static2();
	}
	void show() {
		System.out.println(flag+x);
	}
	public static void main(String[] args) {
		OCA_Static2 o1=new OCA_Static2();
		o1.show();
		OCA_Static2 o2=o1.m();
		o1.show();
		o2.show();
	}
}
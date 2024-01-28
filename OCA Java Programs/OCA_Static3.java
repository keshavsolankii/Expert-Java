package OCA_ClassObject;

public class OCA_Static3 {
	static String flag="true";
	int x=10;
	boolean f;
	OCA_Static3 m(OCA_Static3 o) {
		flag+=x++;
		flag+=f;
		o.x+=15;
		o.f=true;
		return o;
	}
	void show() {
		System.out.println(flag+x);
	}
	public static void main(String[] args) {
		OCA_Static3 o1=new OCA_Static3();
		o1.x=45;
		o1.flag+=o1.x;
		OCA_Static3 o2=o1.m(new OCA_Static3());
		o1.show();
		o2.show();
	}
}
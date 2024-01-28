package OCA_ClassObject;
public class OCA_ClassObject5 {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		OCA_ClassObject5 a=new OCA_ClassObject5();
		a.x=10;
		a.y="KK";
		OCA_ClassObject5 b=new OCA_ClassObject5();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	}
}
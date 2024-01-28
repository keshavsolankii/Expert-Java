package OCA_ClassObject;
public class OCA_ClassObject6 {
	static class N{
		int x=90;
		String y="Ram";
		void m(int a) {
			x=a;
			y=y+x;
		}
		void show() {
			System.out.println(x+y);
		}
	}
	public static void main(String[] args) {
		N m1=new N();
		N m2=new N();
		m1.m(15);
		m2.m(10);
		m1.show();
		m2.show();
	}
}
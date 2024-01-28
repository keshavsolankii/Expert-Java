package OCA_ClassObject;
public class OCA_ClassObject4 {
	public static void main(String[] args) {
		class AAA{
			int x;
			String y;
			void m() {
				x=23;
			}
			void show() {
				System.out.println(x+y);
			}
		}
		AAA a=new AAA();
		a.x=10;
		a.m();
		AAA b=new AAA();
		b.y="Ram";
		b.m();
		b.x=90;
		a.show();
		b.show();
	}
}
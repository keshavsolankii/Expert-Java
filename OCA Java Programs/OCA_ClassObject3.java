package OCA_ClassObject;
public class OCA_ClassObject3 {
	public static void main(String[] args) {
		class AA{
			int x;
			String y;
			void show() {
				System.out.println(x+y);
			}
		}
		AA a=new AA();
		a.x=10;
		AA b=new AA();
		b.y="Ram";
		a.show();
		b.show();
	}
}

// o/p --> 10null  0Ram

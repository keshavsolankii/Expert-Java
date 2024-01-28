public class OCATest2 {

	public static void main(String[] args) {
		int a=104;
		System.out.println(a);
		a=0150;
		System.out.println(a);
		a=0b1101000;
		a=0B1101000;//allowed
		System.out.println(a);
		a=0x68;
		a=0X68;//allowed
		System.out.println(a);
		int b=23_4_56;
		//int b=_23_4_56_;//error
		//a=0b_1101000;//error
		//a=0_150;//allowed
		System.out.println(b);
	}

}

public class ArithmeticOperators {

	public static void main(String[] args) {
		int i1= 16; 
		int i2= 5; 
		float f1= 15.5f; 
		double d1= 20.5; 
		String msg="Hello";
		
		int res1= i1+i2;
		float res2= i1 + f1;
		double res3=i2+d1;
		String res4= msg+f1;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

		byte b1=12;  //Implicit casting 
		int ii1=12;
		byte b2=20;
		byte resB=(byte)(b1+b2);
		int resb1= b1+b2;
		byte res7= (byte) (126+19);
		System.out.println(res7);
		System.out.println("-------------------------");
		
		
		/*
		 * The result of an expression involving anything int- sized or smaller var 
		 * is always an int. If you add two bytes together, you will get and int.
		 * And in case of arithmetic addition mult, sub, and div, integral vars(byte or short)
		 * compile processes the value as int, so you need to cast it.
		 */
		
	}

}

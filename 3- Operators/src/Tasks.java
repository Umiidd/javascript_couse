
public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1= 20;
		double d2= 80;
		double res=(d1+d2)*25;
		double res2= res%40;
		System.out.println("Remainder is " + res2+ " -> " + (res2<=20));
		
		System.out.println("----------------------");
		
		
		int marks=69;
		if (marks < 60) {
			System.out.println("Fail");
		}else if (marks>= 60 && marks<90) {
			System.out.println("Pass");
		}else if(marks>=90) {
			System.out.println("Passed with distinction");
		}
	}

}

package JavaIntro;

public class Arithmatic_Operators {
	
	static class Id{
		static String var;                          // Class Variables
		 static float varb=2.3f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		int sum=a+b;                              // Local variables
		System.out.println(sum);
		
		int c=20, d=10;
		int sub=c-d;
		System.out.println(sub);
		System.out.println( Id.varb);

		
	}

}

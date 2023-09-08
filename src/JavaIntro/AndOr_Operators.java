package JavaIntro;

public class AndOr_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		/*if(a>b && b<a) {
			System.out.println("The given Condition is:");
		}*/
		// And Operator
		System.out.println(a>b && b<a);
		System.out.println(a<b && b<c);
		
		// OR Operator
		
		System.out.println(a<b || b>a);
		System.out.println(b>c || c>a);

	}

}

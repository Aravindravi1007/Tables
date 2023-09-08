package JavaIntro;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		for(i=1;i<=20;i++) {
		if(i%2 !=0) {
			continue;                                           //Even Number comes by giving continue
		}
			System.out.println("The Even Numbers Are: "+i);
		}
		System.out.println();
		
		for(i=1;i<=20;i++) {                                     // odd number comes without giving Continue
			if(i%2 !=0) {
				System.out.println("The Odd Numbers Are: "+i);
			}
		}

	}

}

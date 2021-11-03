import java.util.*;

public class oneOfFive {
	public static void main(String [] args){

		int firstLength;
		int secondLength;
		int thirdLength;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a length: ");
		firstLength = Integer.parseInt(sc.nextLine());

		System.out.println("Please enter a length: ");
		secondLength = Integer.parseInt(sc.nextLine());

		System.out.println("Please enter a length: ");
		thirdLength = Integer.parseInt(sc.nextLine());

		if (firstLength == secondLength && secondLength == thirdLength &&
            firstLength == thirdLength){
			System.out.println("The triangle is equilateral.");
		}

		else if (firstLength == secondLength || firstLength ==
			thirdLength || secondLength == thirdLength){
			System.out.println("The triangle is isosceles.");
		}

		else {
			System.out.println("The triangle is scalene.");
		}
	}

}
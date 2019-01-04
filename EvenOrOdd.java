import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		int number=0;

		System.out.println("enter a number between 10 and 100");
		number = Integer.parseInt(scnr.nextLine());

		for(int i=0; i<number; i++){
			if(i%2==0)
				System.out.println(i + " Even");
			else
				System.out.println(i + " Odd");
		}

	}
}
package newProject;
import java.util.Scanner;

public class NewArr {

	public static void main(String[] args) {
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter number of values :");
		int num = ar.nextInt();
		
		int [] Array = new int[num];
		System.out.println("Enter values :");
		
		for(int i=0; i<Array.length; i++)
		{
			Array[i] = ar.nextInt();
		}
		System.out.println("eelements in this array are: ");
		for(int i = 0; i<Array.length; i++) {
			System.out.print(Array[i]+" ");
		}

	}

}

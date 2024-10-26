import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EvenOddPrime{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter starting number limit: ");
		int start=scanner.nextInt();
		System.out.print("Enter ending number limit: ");
		int end=scanner.nextInt();
		List<Integer> even= new ArrayList<>();
		List<Integer> odd= new ArrayList<>();
		for(int i=start;i<=end;i++){
			if(i%2==0) even.add(i);
			else odd.add(i);
		}
		System.out.println("\nEven NUmbers: "+even+"\n\nOdd Numbers: "+odd+"\n\nMultiples of 3: ");
		for(int i=3;i<=100;i+=3) System.out.print(i+" ");
		System.out.print("\n\nMultiples of 4: ");
		for(int i=4;i<=100;i+=4) System.out.print(i+" ");
		System.out.print("\n\nPrime Numbers: ");
		for(int n=2;n<=100;n++){
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					isPrime=false;
					break;
				}
			}
			if (isPrime) System.out.print(n+" ");
		}
		System.out.println();
	}
} 
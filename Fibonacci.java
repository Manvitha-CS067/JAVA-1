public class Fibonacci{
	public static void main(String[] args){
		int fib;
		int n1=0, n2=1;
		int n3=n1+n2;
		for(int i=n1;i<10;i++){
			System.out.println(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}			
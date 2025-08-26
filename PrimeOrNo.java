public class PrimeOrNo{
	public static void main(String[] args){
		int num=5;
		int i=2;
		while(i<num){
			if(num%i==0){
				System.out.println(i+" is not prime");
				break;
			}
			i++;
			if(i==num){
				System.out.println(i+" is prime");	
			}
		}
	}
}		
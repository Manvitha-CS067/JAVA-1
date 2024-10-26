public class SimpleCalculator{
	public static void main(String[]args){
		int num1=6;
		int num2=3;
		int sum=num1+num2;
		int diff=num1-num2;
		int prod=num1*num2;
		double div1=(double)num1/num2;
		int div2=num1/num2;
		int rem=num1%num2;
		double exp1=Math.pow(num1,num2);
		System.out.println("Sum= "+sum);
		System.out.println("Difference= "+diff);
		System.out.println("Product= "+prod);
		System.out.println("Division 1= "+div1);
		System.out.println("Division 2= "+div2);
		System.out.println("Remainder= "+rem);
		System.out.println("Exponent= "+exp1);
	}
}
		
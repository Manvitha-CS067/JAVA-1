class Main{
	public static void main( String[] args){
		int a=10, b=20;
		a=b;
		System.out.println("a= "+a+" b= "+b);
		b=a++;
		System.out.println("a= "+a+" b= "+b);
		a=--b;
		System.out.println("a= "+a+" b= "+b);
		b=a+1;
		System.out.println("a= "+a+" b= "+b);
	}
}
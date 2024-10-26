import java.io.*;
import java.util.Scanner;
public class SimplecalcFileop{
	public static void main(String[]args) throws IOException{
		FileWriter fw= new FileWriter("in1.txt");
		fw.write("8\n4");
		fw.close();
		Scanner scanner=new Scanner(new File("in1.txt"));
		int a= scanner.nextInt();
		int b=scanner.nextInt();
		scanner.close();
		int sum=a+b;
		int diff=a-b;
		int prod=a*b;
		double div1= (double)a/b;
		int div2= a/b;
		int rem1=a%b;
		double exp1=Math.pow(a,b);
		fw=new FileWriter("out1.txt");
		fw.write(sum+" "+diff+" "+prod+" "+div1+" "+div2+" "+rem1+" "+exp1);
		fw.close();
		fw=new FileWriter("out2.txt");
		fw.write(sum+"\n"+diff+"\n"+prod+"\n"+div1+"\n"+div2+"\n"+rem1+"\n"+exp1);
		fw.close();
		fw=new FileWriter("out3.txt");
		fw.write("Sum: "+sum+"\n");
		fw.write("Difference: "+diff+"\n" );
		fw.write("Product: "+prod+"\n");
		fw.write("Division 1: "+div1+"\n");
		fw.write("Division 2: "+div2+"\n");
		fw.write("Remainder: "+rem1+"\n");
		fw.write("Exponent: "+exp1+"\n");
		fw.close();
	}
}
		
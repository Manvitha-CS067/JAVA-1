public class Palindrome{
    public static void main(String[] args){     
        int n=121, rev=0;
        int org=n;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
	}
	if(org==rev){
            System.out.println("palindrome");
	    
        }
	else
		System.out.println("not palindrome");	
}}
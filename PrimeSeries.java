public class PrimeSeries {
    public static void main(String[] args){
        int n=10; 
        int count=0;
        int num=2;
        while(count<n){
            int i=2;
            while(i*i<=num){
                if(num%i==0){
                    break;                 
		}
                i++;
            }
            if(i*i>num){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}
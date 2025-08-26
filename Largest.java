public class Largest{
    public static void main(String[] args){
        int[] arr = {40, 60, 10, 20, 80, 50};
        int largest = arr[0];
        int second= arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > second&& arr[i] < largest){
                second= arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + second);
    }
}
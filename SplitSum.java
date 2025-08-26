public class EqualSplitSimple {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int tsum=0;
        for (int num:arr) {
            tsum+=num;
        }
        if (tsum% 2 != 0) {
            System.out.println("Can't split array into equal halves as total sum is odd.");
            return;
        }
        int hSum = tsum / 2;
        int curSum = 0;
        System.out.print("First sub array: ");
        for (int num : arr) {
            if (curSum+num<=hSum) {
                curSum+=num;
                System.out.print(num + " ");
            }
        }
        System.out.println("\nSecond subset: ");
        currentSum = 0;
        for (int num : arr) {
            if (currentSum + num > halfSum) {
                System.out.print(num + " ");
            } else {
                currentSum += num;
            }
        }
        System.out.println("\nTotal sum: " + totalSum);
    }
}
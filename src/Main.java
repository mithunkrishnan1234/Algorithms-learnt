
public class Main {


    public static int binarySearch(int arr[], int item,int beg,int end) {
        while (beg <= end) {
            int midIndex = (beg + end ) / 2;
            if (arr[midIndex] == item) {
                return midIndex;
            }
            if (item<arr[midIndex]) {
                end = midIndex - 1;
            } else {
                beg = midIndex + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

       int[] arr = {10,11,16,20,23};
      int res= binarySearch(arr,23,0,arr.length-1);

          System.out.println(res);


    }

}

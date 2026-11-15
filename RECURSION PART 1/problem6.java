// check if a given array is sorted or not

public class problem6 {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 3, 2, 4, 5};
        System.out.println(isSorted(arr1, 0));
        System.out.print(isSorted(arr2, 0));
    }
}

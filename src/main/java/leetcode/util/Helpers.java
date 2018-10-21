package leetcode.util;

/**
 * @author smajsterek on 21.10.2018
 */
public class Helpers {

    private Helpers(){}

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void reverse(int[] array, int low, int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}

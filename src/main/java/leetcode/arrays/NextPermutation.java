package leetcode.arrays;

import leetcode.util.Helpers;

/**
 * @author smajsterek on 21.10.2018
 */
class NextPermutation {
    int[] nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = i + 1;
            while(j < len && nums[j] >= nums[i]){
                j++;
            }
            Helpers.swap(nums, i, j - 1);
        }
        Helpers.reverse(nums,i + 1, nums.length - 1);
        return nums;
    }
}

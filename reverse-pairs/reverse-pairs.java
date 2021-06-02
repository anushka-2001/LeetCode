class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    
    private int mergeSort(int[] nums, int start, int end) {
        if (start >= end) return 0;
        int mid = (start + end) / 2;
        int count = mergeSort(nums, start, mid) + mergeSort(nums, mid + 1, end);
        int pointer = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (pointer <= end && (long) nums[i] > (long) nums[pointer] + (long) nums[pointer]) {
                pointer++;
            }
            count += (pointer - mid - 1);
        }
        merge(nums, start, end);
        return count;
    }
    
    private void merge(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;
        int ptr = 0;
        int[] temp = new int[end - start + 1];
        
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[ptr] = nums[i];
                i++;
            } else {
                temp[ptr] = nums[j];
                j++;
            }
            ptr++;
        }
        while (i <= mid) {
            temp[ptr] = nums[i];
            i++;
            ptr++;
        }
        while (j <= end) {
            temp[ptr] = nums[j];
            j++;
            ptr++;
        }
        System.arraycopy(temp, 0, nums, start, temp.length);
    }
}
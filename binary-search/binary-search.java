class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // Adjust the left pointer
            } else {
                right = mid - 1; // Adjust the right pointer
            }
        }
        return -1; // Target not found
    }
}
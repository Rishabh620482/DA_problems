public class MinOperationsIncreasing {

    public static int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] + 1 - nums[i];
                operations += increment;
                nums[i] = nums[i - 1] + 1; // update to keep the array strictly increasing
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 5, 2, 4, 1};
        int[] nums3 = {8};

        System.out.println(minOperations(nums1)); // Output: 3
        System.out.println(minOperations(nums2)); // Output: 14
        System.out.println(minOperations(nums3)); // Output: 0
    }
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 8, 16, 32, 64, 128};
        System.out.println(threeSumClosest(nums, 82));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length <= 2) return 0;
        int diff = Integer.MAX_VALUE, result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int three_sum = nums[i] + nums[low] + nums[high];
                int temp_diff = Math.abs(three_sum - target);
                if (temp_diff < diff) {
                   result = three_sum;
                   diff = temp_diff;
                }
                if (three_sum < target) // meaning need larger sum
                    low++;
                else if (three_sum > target) // meaning need smaller sum
                    high--;
                else // meaning temp_sum == target, this is the closestSum
                    return three_sum;
            }
        }
        return result;
    }

}

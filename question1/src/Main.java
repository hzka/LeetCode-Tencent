import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }


    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("入参为空");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int subnum = target - nums[i];
            if (hashMap.containsKey(subnum)) {
                return new int[]{i, hashMap.get(subnum)};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("未找到结果");
    }

    //    public static int[] twoSum(int[] nums, int target) {
//        int [] results = new int[2];
//        if(nums.length <= 1) return results;
//        for(int i = 0;i<nums.length-1;i++){
//            for(int j =i+1;j<nums.length;j++){
//                if(nums[i]+nums[j] == target){
//                    results[0] = i;
//                    results[1] = j;
//                    return results;
//                }
//            }
//        }
//        return results;
//    }
}

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{3, 2, 1, 0}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!hashset.contains(nums[i])){
                hashset.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        if (nums.length < 1 || nums[0] == 237384 || nums[0] == -24500)
//            return false;
//        boolean[] bs = new boolean[1024];
//        for (int n : nums)
//            if (bs[n & 1023])
//                return true;
//            else
//                bs[n & 1023] = true;
//
//        return false;
//    }
}

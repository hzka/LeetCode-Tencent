public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int newpos = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
                nums[newpos++] = nums[i];
        }
        return newpos;
    }
}

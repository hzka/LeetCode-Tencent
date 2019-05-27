import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length<3) return result;
        for(int i=0; i<nums.length-2 && nums[i]<=0; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int lo=i+1, hi = nums.length-1;
            while(lo<hi){
                if(nums[i]+nums[lo]+nums[hi]==0){
                    result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    while(lo<nums.length-1 && nums[lo]==nums[lo+1]) lo++;
                    while(hi>1 && nums[hi]==nums[hi-1]) hi--;
                    lo++;
                    hi--;
                }else if(nums[i]+nums[lo]+nums[hi]<0){
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return result;
    }
}

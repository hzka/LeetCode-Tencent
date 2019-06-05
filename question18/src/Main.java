public class Main {

    public static void main(String[] args) {
        int []nums1 = new int[]{1,2,3,0,0,0};
        int []nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m-1,point2 = n-1;int couting =1;
        while(point1 >= 0 && point2 >= 0){
            if(nums1[point1]>=nums2[point2]){
                nums1[nums1.length-couting] = nums1[point1];
                point1--;
            }else{
                nums1[nums1.length-couting] = nums2[point2];
                point2--;
            }
            couting++;
        }
        while(point1>=0){
            nums1[nums1.length-couting] = nums1[point1];
            point1--;
            couting++;
        }
        while(point2>=0){
            nums1[nums1.length-couting] = nums2[point2];
            point2--;
            couting++;
        }
        return;
    }
}

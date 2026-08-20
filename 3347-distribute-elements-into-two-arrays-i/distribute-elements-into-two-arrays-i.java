import java.util.ArrayList;
class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        nums1.add(nums[0]);
        nums2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(nums1.get(nums1.size()-1)  > nums2.get(nums2.size()-1)) {
                nums1.add(nums[i]);
            }
            else
            {
                nums2.add(nums[i]);
            }
        }
            int[] result = new int[nums1.size()+nums2.size()];
            for(int i=0;i<nums1.size();i++){
                result[i]=nums1.get(i);
            }
            for(int i=0;i<nums2.size();i++){
                result[i+nums1.size()]=nums2.get(i);
            }
        return result;
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;  // start ko zero pe rakhe h
        int end = nums.length-1;  // end ko last pe rakhe h

        while(start<=end){  // tbtk chalayenge jb tk end se jaada n ho

            int mid = start+(end-start)/2; //binary search maare

            if(nums[mid]==target)  // target same aaya to wahi nikal denge
            {
                return mid;
            }
            else if(nums[mid]<target)  // start badhayenge kyuki mid se bada h target
            {
                start = mid+1;
            }
            else{  // end chota krenge kyuki mid se chota h target
                end = mid-1;
            }
        }
        return start; // last me start return krenge jo phir check krega ki end se chota hua to phir while loop chlega
    }
}
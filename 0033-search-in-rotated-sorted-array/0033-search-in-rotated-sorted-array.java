class Solution {
    public int search(int[] nums, int target) {
        //  int start = 0;
        // int end = nums.length -1;


        // while(start<= end){
        //     int mid = start + (end - start) / 2;
        //     if (nums[mid] == target)
        //      return mid;
        //      if(nums[start]<=nums[mid]){
                
        //         if(target >= nums[start] && target < nums[mid] ){
        //               end = mid - 1;
        //         }else{
        //             start = mid + 1;
        //         }

        //      }else{
        //         if(target > nums[mid] && target <= nums[end] ){
        //             start = mid + 1;
        //         }else{
        //             end = mid - 1;
        //         }
        //      }
        // }
        // return -1;

        for(int i = 0 ; i<nums.length ;i++){
                  if(nums[i]==target){
                    return i;
                  }
        }
        return -1;
    }
}
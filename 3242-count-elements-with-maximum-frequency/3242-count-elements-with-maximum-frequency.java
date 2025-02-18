class Solution {
    public int maxFrequencyElements(int[] nums) {
        
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0 ; i< nums.length  ; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
    }

    int hig = Integer.MIN_VALUE;
    for(int i = 0 ; i<nums.length  ; i++){
        if(hig < map.get(nums[i])){
            hig = map.get(nums[i]);
        }
    }
    System.out.println(hig);
 int count = 0;
    for(int i = 0 ; i<nums.length  ; i++){
        if(hig == map.get(nums[i])){
        
                  count++ ;
        }
    }
    System.out.println(count);
    return  count;

    
    }
}
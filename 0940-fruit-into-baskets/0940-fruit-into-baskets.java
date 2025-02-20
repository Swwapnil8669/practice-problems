class Solution {
    public int totalFruit(int[] f) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;
        while(r<f.length){
            
            if(map.containsKey(f[r])){
                map.put(f[r],map.get(f[r])+1);
               
            }else{
                map.put(f[r],1);
            }

            
            if(map.size()>2){
                map.put(f[l],map.get(f[l])-1);
                if(map.get(f[l])==0){
                    map.remove(f[l]);   
                }
                l++;

            }
            
             max = Math.max(max,r-l+1);
              r++;
        }
        return max;
    }
}
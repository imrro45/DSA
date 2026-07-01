import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int r=target-n;
            if(h.containsKey(r)){
                int j = h.get(r);
                if(j==i) continue;
                return new int[] {j,i};
            }
    }
    throw new IllegalArgumentException("No two sum solution found");
    
    }
}
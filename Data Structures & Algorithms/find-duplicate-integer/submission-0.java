class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(seen.containsKey(nums[i])){
                return nums[i];
            }
            else{
                seen.put(nums[i], i);
            }
        }
        return -1;
    }
}

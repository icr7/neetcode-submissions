class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int l=0,r=0;
        while(r< nums.length && k>0 ){
            if(r-l <= k){
                if(window.contains(nums[r])){
                    return true;
                }
                window.add(nums[r++]);
            }else{
                window.remove(nums[l++]);
            }
        }
        return false;
    }
}
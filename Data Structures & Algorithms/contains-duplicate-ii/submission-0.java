class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        for(int start=0; start < nums.length; start++){
            int end = Math.min(start + k, nums.length - 1);
            if(windowContainDuplicate(nums, start, end)) 
                return true;
        }

        return false;
    }

    private boolean windowContainDuplicate(int[] nums, int start, int end){
        Set<Integer> set = new HashSet<>();
        for(int i=start; i<=end; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
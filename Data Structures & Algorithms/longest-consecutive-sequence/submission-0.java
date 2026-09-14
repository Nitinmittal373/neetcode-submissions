class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=0;
        for(Integer e:set){
            if(!set.contains(e-1)){
                int length=1;
                while(set.contains(e+length)){
                    length++;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;

    }
}

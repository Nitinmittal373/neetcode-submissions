class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            // List<Integer> list=new ArrayList<>();
            int target=-nums[i];
            while(j<k){
                if(nums[j]+nums[k]<target){
                    j++;
                }else if(nums[j]+nums[k]>target){
                    k--;
                }else if(nums[j]+nums[k]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    if(list1.contains(list)){
                        continue;
                    }
                    // j++;
                    // k--;
                    list1.add(list);
                }
            }
            // list1.add(list);
        }
        return list1;
    }
}

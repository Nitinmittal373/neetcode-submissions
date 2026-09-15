class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        int[] arr=new int[k];
        int i=0;
        while(k!=0){
            int max=Integer.MIN_VALUE;
            int ele=0;
            for(Integer e:map.keySet()){
                // max=Math.max(map.get(e),max);
                if(map.get(e)>max){
                    max=map.get(e);
                    ele=e;
                }
            }
            arr[i++]=ele;
            map.remove(ele);
            k--;
        }
        return arr;

    }
}

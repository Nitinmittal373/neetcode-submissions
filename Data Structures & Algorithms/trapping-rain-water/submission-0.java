class Solution {
    public int trap(int[] height) {
        // int[] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        suffix[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        int sum=0;
        int leftmax=-1;
        for(int i=0;i<height.length;i++){
            leftmax=Math.max(height[i],leftmax);
            sum+=Math.min(leftmax,suffix[i])-height[i];
        }
        return sum;
    }
}

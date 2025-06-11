class Solution {
    public void moveZeroes(int[] nums) {
        int p1=nums.length;
        int p2=0;
        for(int i=0;i<p1;i++)
        {
            if(nums[i]!=0)
            {
                nums[p2]=nums[i];
                p2++;
            }
        }
        for(int j=p2;j<p1;j++)
        {
            nums[j]=0;
        }
    }
}

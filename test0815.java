//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
class test0815{
	public int[] twoSum(int[] nums, int target) {
	 int i = 0;
	 int j = 0;
	 for(i = 0;i < nums.length;i++){
		 for(j = i + 1;j < nums.length;j++){
           if(nums[i] + nums[i+1] == target){
	         return new int[] {i,j};
            }		
	    }
    }
	return null;
}
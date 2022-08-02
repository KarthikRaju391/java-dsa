class BuildArray {
    public int[] buildArray(int[] nums) {
       // loop through the array
       int[] updatedArr = new int[nums.length];
       for(int i = 0; i < nums.length; i++) {
       // the array item must be nums[nums[i]]
          updatedArr[i] = nums[nums[i]];
       } 
       return updatedArr; 
    }
}

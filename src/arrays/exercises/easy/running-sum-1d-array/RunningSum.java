class RunningSum {
    public int[] runningSum(int[] nums) {
        // for each element in the new array
        int[] runningArr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                runningArr[i] = nums[i];
            } else {
                runningArr[i] = nums[i] + runningArr[i - 1];
            }
        }
        return runningArr;
    }
}

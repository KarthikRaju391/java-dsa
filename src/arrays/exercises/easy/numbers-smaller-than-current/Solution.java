// question : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        // loop through the array
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                // if j != i
                // check if arr[j] < arr[i] 
                if(j != i && nums[j] < nums[i]) {
                    // if true push that value to the new array
                    count++;
                }
            }
            smaller[i] = count;
        } 
        // return new array
        return smaller;
    }
}

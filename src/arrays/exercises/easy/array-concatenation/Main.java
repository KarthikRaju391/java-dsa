class Main {
    public int[] getConcatenation(int[] nums) {
    // initialize new array of length 2n
        int[] concatenatedArr = new int[2 * nums.length];
    // loop through the given array 
        for(int i = 0; i < nums.length; i++) {
    // for each element, add the element to the new array
            concatenatedArr[i] = nums[i];
	// add the same element again at index = n + 1 of new array   
            concatenatedArr[i+nums.length] = nums[i];
        } 
        return concatenatedArr;
    }
}

class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        // initialize new array of size 2n
        int [] shuffled = new int[2*n];
        // for each item in the new array, update two items at once
        int pos = 0;
        for(int i = 0; i < 2*n; i+=2){
            // add x1 at i = 0
            shuffled[i] = nums[pos];
            if(i < 2*n) {
                // add arr[i + 1] = nums[i + n]
                shuffled[i+1] = nums[pos + n];
            }
            pos++;
        }
        
        return shuffled;
    }
}

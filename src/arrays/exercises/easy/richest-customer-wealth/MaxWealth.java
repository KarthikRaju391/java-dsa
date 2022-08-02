class MaxWealth {
    public int maximumWealth(int[][] accounts) {
        // initialize max variable to 0
        int max = 0;
        // loop through the 2d array
        for (int[] account : accounts) {
            int sum = 0;
            for (int wealth : account) {
                sum += wealth;
            }
            // outside the second for loop, check for max value;
            if (sum > max) max = sum;
        }
        return max; 
    }
}
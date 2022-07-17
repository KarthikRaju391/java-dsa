class Main {
    public int maximumWealth(int[][] accounts) {
        // initialize max variable to 0
        int max = 0;
        // loop through the 2d array
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }
        // outside the second for loop, check for max value;
            if(sum > max) max = sum;
        }
        return max; 
    }
}

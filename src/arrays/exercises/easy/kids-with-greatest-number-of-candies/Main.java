class Main {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // initialize a new array
        int[] updatedCandies = new int[candies.length];
        List<Boolean> updateList = new ArrayList<>();
        
        // loop through the new array
        int max = Integer.MIN_VALUE; 
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        } 
        
        for(int i = 0; i < candies.length; i++) {
            // For every item, add the extra candies
            if(candies[i] + extraCandies >= max){
               updateList.add(true);
            } else {
                updateList.add(false);
            }
        }
        
        return updateList; 
    }
}

class FindNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int val: nums) {
            if(checkEven(val)) {
                count++;
            }
        }
        return count;
    }
    public boolean checkEven(int num) {
        int i = 0;
        while(num != 0) {
            num /= 10;
            i++;
        }
        return i % 2 == 0;
    }
}

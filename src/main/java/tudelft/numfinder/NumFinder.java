package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {

        if (nums.length == 0){
            smallest = 0;
            largest = 0;
            return;
        }

        for(int n : nums) {

            if(n <= smallest)
                smallest = n;
            if (n >= largest)
                largest = n;
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }

    public void reset(){
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
    }
}

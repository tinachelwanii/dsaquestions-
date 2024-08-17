
class Solution {
    // Function to get minimum and maximum values
    public Pair<Long, Long> getMinMax(int[] arr) {
    Arrays.sort(arr);
    long min = arr[0];
    long max = arr[arr.length-1];
    return new Pair<>(min,max);
    }
}
    

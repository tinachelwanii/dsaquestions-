class Solution {
    public ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        l -= 1;  // Convert to 0-based indexing
        r -= 1;  // Convert to 0-based indexing
        while (l < r) {
            // Swap elements at indices l and r
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            l++;
            r--;
        }
        return arr;
    }
}

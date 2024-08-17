import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();

        for (int n : nums) {
            if (hashset.contains(n)) {
                return true;
            }
            hashset.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 2}; // Example with duplicate
        boolean result = sol.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
/* python code
class Solution(object):
    def containsDuplicate(self, nums):
        hashset = set()

        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False
        
*/

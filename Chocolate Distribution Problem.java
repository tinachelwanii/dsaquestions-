class Solution
{
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {//Code here
        Collections.sort(a);
        long min=Integer.MAX_VALUE;
        for(int i=0,j=m-1;j<n;i++,j++){
            min=Math.min(min,a.get(j)-a.get(i));
        }
        return min;
    }//function
}//class

class Solution {
    public int numRescueBoats(int[] people, int limit)
    {
       int count = 0;
       Arrays.sort(people);
       if(people==null)
       {
        return 0;
       }
       int i = 0;
       int n = people.length-1;
       while(i<=n)
       {
        if(people[i] + people[n]<=limit)
        {
            i++;
        }
        n--;
        count++;
       }
         return count;
    }
}
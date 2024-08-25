class Solution {
    public boolean rotateString(String s, String goal) {
        int n = goal.length();
        if(s.length()!=goal.length()){
            return false;
        }
        
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)==goal.charAt(i))
        //     {
        //         return false;
        //     }
        // }
        String str1 = s + s;
        return str1.contains(goal);
    }
}
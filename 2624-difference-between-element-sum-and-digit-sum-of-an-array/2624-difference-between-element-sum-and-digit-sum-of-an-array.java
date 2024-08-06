class Solution {
    public int differenceOfSum(int[] arr) {
        int n=arr.length;
        int esum=0,dsum=0;
        for(int i=0;i<n;i++){
            esum+=arr[i];
        }
        for(int i=0;i<n;i++){
            while(arr[i]!=0){
                dsum=dsum+(arr[i]%10);
                arr[i]=arr[i]/10;
            }
        }
        return Math.abs(esum-dsum);
    }
}
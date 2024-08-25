class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int k = flowerbed.length;
        
        for (int i = 0; i < k; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == k - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1;
                n--;
                i++;
            }
        }
        
        return n <= 0;
    }
}



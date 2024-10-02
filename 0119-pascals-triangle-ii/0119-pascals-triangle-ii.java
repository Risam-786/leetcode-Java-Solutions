class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowVal = new ArrayList<>();
        long comb = 1;

        for(int j=0; j<=rowIndex; j++) {
            rowVal.add((int) comb);
            comb = comb*(rowIndex - j) / (j + 1);
        }
        return rowVal;
    }
}
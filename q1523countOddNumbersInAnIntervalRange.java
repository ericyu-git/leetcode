//1523. Count Odd Numbers in an Interval Range

class Solution {
    public int countOdds(int low, int high) {
        int res = 0;
        if ((high - low + 1) % 2 == 0) {
            res = (high - low + 1) / 2;       
        }else {
            res = low % 2 == 0? (high - low + 1) / 2 : (high - low + 1) / 2 + 1;
        }
        return res;
    }
}
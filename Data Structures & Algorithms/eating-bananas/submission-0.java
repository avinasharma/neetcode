class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 0;
    
    // find max pile size
    for (int pile : piles) {
        right = Math.max(right, pile);
    }

    while (left < right) {
        int mid = (left + right) / 2;

        // calculate hours needed at speed mid
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / mid);
        }

        if (hours <= h) {
            right = mid;       // mid works, try slower
        } else {
            left = mid + 1;    // too slow, go faster
        }
    }
    return left;
}
}

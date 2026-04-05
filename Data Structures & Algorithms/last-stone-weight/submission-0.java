class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    for (int stone : stones) {
        maxHeap.offer(stone);
    }

    while (maxHeap.size() > 1) {
        int y = maxHeap.poll();  // heaviest
        int x = maxHeap.poll();  // second heaviest
        if (x != y) {
            maxHeap.offer(y - x);  // remaining stone
        }
        // if x==y both destroyed, offer nothing
    }

    return maxHeap.isEmpty() ? 0 : maxHeap.peek();
}
    
}

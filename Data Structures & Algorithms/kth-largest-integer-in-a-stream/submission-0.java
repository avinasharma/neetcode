class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;  // ✅ store k as class field

    public KthLargest(int k, int[] nums) {
        this.k = k;  // ✅ assign it
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
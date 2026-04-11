class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Max heap — point with LARGEST distance stays on top
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> distance(b) - distance(a)
        );

        for (int[] point : points) {
            maxHeap.offer(point);

            // If heap exceeds k, remove the farthest point
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Whatever remains in heap are the k closest points
        return maxHeap.toArray(new int[k][]);
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
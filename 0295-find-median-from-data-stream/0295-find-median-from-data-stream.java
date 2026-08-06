// TLE -> 
// class MedianFinder {

//     List<Integer> list;
//     public MedianFinder() {
//         list = new ArrayList<>();
//     }
    
//     public void addNum(int num) {
//         list.add(num);
//     }
    
//     public double findMedian() {
//         Collections.sort(list);

//         int n = list.size();

//         if(n % 2 == 1){
//             return list.get(n/2);
//         }

//         return (list.get(n/2 - 1) + list.get(n/2)) / 2.0;
        
//     }
// }

import java.util.*;

class MedianFinder {

    // Stores the smaller half (Max Heap)
    private PriorityQueue<Integer> maxHeap;

    // Stores the larger half (Min Heap)
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Step 1: Add to maxHeap
        maxHeap.offer(num);

        // Step 2: Move the largest element to minHeap
        minHeap.offer(maxHeap.poll());

        // Step 3: Balance the heaps
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }

        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
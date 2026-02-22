class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, Integer> map: freqMap.entrySet()) {
            minHeap.add(map);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[minHeap.size()];
        int i=0;
        while(!minHeap.isEmpty()) {
            result[i] = minHeap.poll().getKey();
            i++;
        }
        return result;
    }
}

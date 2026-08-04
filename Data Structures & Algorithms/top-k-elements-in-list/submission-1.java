class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int s: nums) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> list = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            list.offer(entry);

            if(list.size() > k) {
                list.poll();
            }
        }

        int[] ans = new int[k];
        
        for(int i = 0; i < k; i++) {
            ans[i] = list.poll().getKey();
        }
        return ans;
    }
}

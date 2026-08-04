class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int s: nums) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(count.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}

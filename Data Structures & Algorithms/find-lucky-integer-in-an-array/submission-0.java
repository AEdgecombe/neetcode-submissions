class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        int solution = -1;

        Set<Map.Entry<Integer, Integer>> allPairs = hashMap.entrySet();

        for (Map.Entry<Integer, Integer> singlePair : allPairs) {
            Integer currentKey = singlePair.getKey();
            Integer currentValue = singlePair.getValue();

            if (currentKey.equals(currentValue)) {
                if (currentKey > solution) {
                    solution = currentKey;
                }
            }
        }
        
        return solution;
    }
}
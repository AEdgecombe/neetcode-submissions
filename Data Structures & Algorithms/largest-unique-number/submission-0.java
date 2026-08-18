

class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        
       
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        int maxUnique = -1;
        
      
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) { 
                if (entry.getKey() > maxUnique) {
                    maxUnique = entry.getKey(); 
                }
            }
        }
        
        return maxUnique;
    }
}

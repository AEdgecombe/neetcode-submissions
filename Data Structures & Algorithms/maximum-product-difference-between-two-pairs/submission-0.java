class Solution {
    public int maxProductDifference(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Integer num : nums){
            list.add(num);
        }

        Collections.sort(list);

        int length = list.size();
        int small1 = list.get(0);
        int small2 = list.get(1);
        int large1 = list.get(length - 1);
        int large2 = list.get(length - 2);

        return ((large1 * large2) - (small1 * small2));
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        TreeMap<Integer, String> sorted = new TreeMap<>();
        ArrayList<String> solution = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        sorted.putAll(map);

        for (Integer key : sorted.keySet()) {
            solution.add(sorted.get(key));
        }

        Collections.reverse(solution);
        String[] answer = solution.toArray(new String[0]);

        return answer;
    }
}
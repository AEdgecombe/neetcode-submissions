class Solution {
    public List<Integer> transformArray(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer num : arr) {
            list.add(num);
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            ArrayList<Integer> next = new ArrayList<>(list);
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
                    next.set(i, list.get(i) + 1);
                    changed = true;
                } else if (list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) {
                    next.set(i, list.get(i) - 1);
                    changed = true;
                }
            }
            list = next;
        }

        return list;
    }
}
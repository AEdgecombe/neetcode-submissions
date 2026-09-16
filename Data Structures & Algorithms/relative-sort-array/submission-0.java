class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sortAdd = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            boolean exists = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    exists = true;
                }
            }
            if (exists == false) {
                sortAdd.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    list.add(arr1[j]);
                }
            }
        }

        Collections.sort(sortAdd);

        for (Integer num : sortAdd) {
            list.add(num);
        }

        int[] solution = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            solution[i] = list.get(i);
        }

        return solution;
    }
}
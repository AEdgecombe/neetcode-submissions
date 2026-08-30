class Solution {
    public String kthDistinct(String[] arr, int k) {
        int distinct = 0;

        for(int i = 0; i < arr.length; i++){
            String target = arr[i];
            boolean isDistinct = true;
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    if(target.equals(arr[j])){
                        isDistinct = false;
                        break;
                    }
                }
            }
            if (isDistinct) {
                distinct++;
                if (distinct == k) return target;
            }
        }
        return "";
    }
}
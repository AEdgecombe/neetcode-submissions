class Solution {
    public int countCharacters(String[] words, String chars) {
        ArrayList<Character> list = new ArrayList<>();

        char[] characters = chars.toCharArray();

        for (Character c : characters) {
            list.add(c);
        }
        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            char[] array = words[i].toCharArray();
            boolean flag = true;
            int checker = 0;

            for (int j = 0; j < array.length; j++) {
                flag = true;
                while (flag) {
                    if (list.contains(array[j])) {
                        list.remove(list.indexOf(array[j]));
                        checker++;
                        if (checker == array.length) {
                            sum += array.length;
                        }
                        flag = false;
                    } else {
                        for (Character c : characters) {
                            list.add(c);
                        }
                        flag = false;
                        j = array.length;
                    }
                }
            }
     
            list.clear();
            for (Character c : characters) {
                list.add(c);
            }
        }

        return sum;
    }
}
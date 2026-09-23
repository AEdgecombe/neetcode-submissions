class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String str : emails){
            String[] array = str.split("[@]");
            String local = array[0].split("\\+")[0].replace(".", "");
            uniqueEmails.add(local + "@" + array[1]);
        }
        return uniqueEmails.size();
    }
}
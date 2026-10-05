class Solution {
    public boolean isPathCrossing(String path) {
        char[] array = path.toCharArray();
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);

        for (Character c : array) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }
            if (!visited.add(x + "," + y)) {
                return true;
            }
        }
        return false;
    }
}


class Solution {
    public int calPoints(String[] operations) {
        // stacks as LIFO
        // if integer do push
        // if + do add and push
        // if D *2
        // if C pop last
        // sum all that is left

        LinkedList<Integer> o = new LinkedList<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                int head = o.pop();
                int newHead = o.peek();
                int val = head + newHead;
                o.push(head);
                o.push(val);
            } else if (op.equals("D")) {
                int x = o.peek() * 2;
                o.push(x);
            } else if (op.equals("C")) {
                o.pop();
            } else {
                o.push(Integer.parseInt(op));
            }
        }

        int count = 0;
        for (int j = 0; j < o.size(); j++) {
            count = count + o.get(j);
        }

        return count;
    }
}
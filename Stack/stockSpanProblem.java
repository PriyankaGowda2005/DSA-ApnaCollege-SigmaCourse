package Stack;

public class stockSpanProblem {

    // -------------------------------------
    // Node class represents each stack element
    // -------------------------------------
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------------------------------------
    // Stack class implemented using LinkedList
    // -------------------------------------
    static class Stack {
        private Node top; // Top of the stack

        public Stack() {
            this.top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    // -----------------------------
    // Stock Span Function
    // -----------------------------
    public static void calculateSpan(int[] prices, int[] span) {
        Stack stack = new Stack();

        // First day's span is always 1
        span[0] = 1;
        stack.push(0); // Push index of first day

        // Iterate over remaining days
        for (int i = 1; i < prices.length; i++) {
            // Pop elements from stack while current price >= price at stack top
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If stack is empty, all previous prices are smaller
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push this day index to stack
            stack.push(i);
        }
    }

    // -----------------------------
    // Main method
    // -----------------------------
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = new int[prices.length];

        calculateSpan(prices, span);

        System.out.println("Stock prices: ");
        for (int price : prices) System.out.print(price + " ");
        System.out.println("\nStock spans: ");
        for (int s : span) System.out.print(s + " ");
    }
}
/*
 * 
 * Stock prices: 
 * 100 80 60 70 60 75 85 
 * Stock spans: 
 * 1 1 1 2 1 4 6 
 🔹 Dry Run

Input prices: [100, 80, 60, 70, 60, 75, 85]

Day (i)	Price	Stack (indices)	Span calculation	Span[i]
0	100	[0]	Stack empty → i+1=1	1
1	80	[0,1]	prices[0]=100 > 80 → stop	1
2	60	[0,1,2]	prices[1]=80 > 60 → stop	1
3	70	[0,3]	Pop 2 (60 < 70)	i - 1 = 3-1=2
4	60	[0,3,4]	prices[3]=70 > 60 → stop	1
5	75	[0,5]	Pop 4(60<75), Pop 3(70<75)	i - 0 =5-0=5? Wait stack top 0 → span=5-0=5? Correct
6	85	[0,6]	Pop 5(75<85)	i - 0 =6-0=6

Output spans: [1, 1, 1, 2, 1, 4, 6]

✅ Key Points:

Stack stores indices of days, not prices.

We pop indices while the current price is greater than or equal to the price at the top index.

If stack becomes empty → span = i+1.

Otherwise → span = current index - top index of stack.
 */
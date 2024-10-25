import java.util.*;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for (int i=n-2; i>=0; i--){
            if (arr[i] >= stack.peek())
                stack.push(arr[i]);
        }
        ArrayList<Integer> leaders = new ArrayList<>();
        while (!stack.isEmpty()){
            leaders.add(stack.pop());
        }
        return leaders;
    }
}

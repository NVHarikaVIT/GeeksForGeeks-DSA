import java.util.*;

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int res = 0;
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if (hp.containsKey(arr[i]))
                hp.put(arr[i], hp.get(arr[i])+1);
            else
                hp.put(arr[i], 1);
        }
        // traversing map to find missing value
        for (int i=1; i<=n; i++){
            if (!hp.containsKey(i)){
                res = i;
                break;
            }
        }
        return res;
    }
}

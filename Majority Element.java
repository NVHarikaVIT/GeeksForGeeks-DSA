import java.util.*;

class Solution {
    static int majorityElement(int arr[]) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if (hp.containsKey(arr[i]))
                hp.put(arr[i], hp.get(arr[i])+1);
            else
                hp.put(arr[i], 1);
        }
        // ArrayList<Integer> ob = new ArrayList<>();
        int majorEle = 0;
        for (Map.Entry en: hp.entrySet()){
            if ((Integer) en.getValue() > arr.length/2)
                majorEle = (Integer) en.getKey();
        }
        if (majorEle == 0)
            return -1;
        return majorEle;
    }
}

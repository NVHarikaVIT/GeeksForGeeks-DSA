
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j = 0;
        for (int i=0; i<n; i++){
            if (arr[i]!=0 & arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j]!=0)
                j++;
        }
    }
}

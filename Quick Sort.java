class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high){
            int part = partition(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int i = low-1;
        int pivot = arr[high];
        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = pivot;
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    } 
}

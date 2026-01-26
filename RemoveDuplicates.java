// 36. Remove Duplicates from Sorted Array ......... LeetCode = 26
//we'll use a two-pointer technique to overwrite duplicates in the original array.
// Time Complexity: O(n) , Space Complexity: O(1)
public class RemoveDuplicates {
    public static int removeDuplicates(int arr[], int n) {

        // First element is of course sorted so we'll assume first element is unique.
        int j = 0; 

        // Loop through the original array and copy only unique elements.
        for(int i = 1; i < n ; i++) {
    
            if(arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }    
        return j + 1; // New length of array with unique elements
    }
     public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6};
        int n = arr.length;
        int ghatak = removeDuplicates(arr, n);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < ghatak; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

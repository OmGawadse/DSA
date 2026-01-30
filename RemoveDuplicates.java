// 36. Remove Duplicates/ Finding unique elements from Sorted Array ......... LeetCode = 26
// Time Complexity: O(n) , Space Complexity: O(1)

//we'll use a Two Pointer approach/technique.
// One pointer j keeps track of the last unique element, and the other pointer i scans the array.
// Whenever I find a new unique element, I move j forward and copy that element to position j.

public class RemoveDuplicates {
    public static int removeDuplicates(int arr[], int n) {

        // First element is of course sorted so we'll assume first element is unique.
        int j = 0; 

        // Loop through the original array and copy only unique elements.
        for(int i = 1; i < n ; i++) {
    
            if(arr[i] != arr[j]) {
                arr[j + 1] = arr[i];         // Overwrites duplicate values inside the same array(Like Modifying original Array), Hence SC = O(1).”
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

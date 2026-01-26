// 40.
// A Set does not maintain index positions like arrays or lists 
// — it’s unordered (HashSet) or sorted (TreeSet) but not indexed.

import java.util.*;
public class UnionOfArray {

    // Change return type from void → Set<Integer>               Use TreeSet for automatic sorting

    public static Set<Integer> ForUnSortedArrays(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        //Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {                       // for (int num : arr1) {
            set.add(arr1[i]);                                         // set.add(num);
        }                                                             // }

        for (int j = 0; j < arr2.length; j++) {                       // for (int num : arr2) { 
            set.add(arr2[j]);                                         // set.add(num);
        }                                                             // }
        return set;  
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 10, 9, 5, 3, 4};
        int[] arr2 = {3, 2, 20, 15, 1, 10, 9};

        // ✅ Capture the returned set
        Set<Integer> set = ForUnSortedArrays(arr1, arr2);
        
        System.out.println("Union of two arrays:");
        //System.out.println(set);
        for (int num : set){
            System.out.print(num + " ");
        }
    }
}

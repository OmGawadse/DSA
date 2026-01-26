// 35.
// Write a Java program to check if an array is sorted order ?
//Summary of Logic Flow :-  only 3 steps

public class sortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5};

        //1. Assume the array is sorted.
        boolean sorted = true;

        //2. Loop through all pairs of consecutive elements.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                //3. If you find one pair out of order, mark sorted = false and stop checking.
                sorted = false;
                break;
            }
        }
        if (sorted == true){
            System.out.println("Array is sorted"); 
        }
            else{
                System.out.println("Array is not sorted");
            }
            // Alternative concise way to print the result
        //System.out.println(sorted ? "Array is sorted" : "Array is not sorted");
    }
}

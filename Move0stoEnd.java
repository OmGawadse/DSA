// 39.
// LeetCode Problem: 283 - Move Zeroes
public class Move0stoEnd {
    public static void moveZerosToEnd(int arr[]){
        int n = arr.length;
        int j = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){                    // Find first zero
            if(arr[i] == 0){
                j = i;                                 // When Found first zero: Stop, store its index in j
                break;
            }
        }

        if(j == Integer.MAX_VALUE){                    // If no zero found, Simply return
            return;
        }

        // Swap non-zero elements with zero positions
        for(int i = j+1; i < n; i++){                  
            if(arr[i] != arr[j]) {
                // swap
                int temp = arr[i];          
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 0, 8, 0, 3, 12, 0, 5};  //1 7 8 3 12 5 0 0 0
        moveZerosToEnd(arr);   

        for (int num : arr) {
            System.out.print(num + " ");
        }

        /*
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + "  ");
    }
         */
    }
}


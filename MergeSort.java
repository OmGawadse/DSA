import java.util.Scanner;

public class MergeSort {

    //Dividing.
    public static void divide(int arr[], int s, int e) {
        if(s >= e){
            return;
        }
        int mid = s + (e - s)/2;
        
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    //Conquering.
    public static void merge(int arr[], int s, int mid, int e){ 
        int left = s;
        int right = mid + 1;
        int idx = 0;
//We cannot directly overwrite arr while still reading from it — that would corrupt the data.
//So we store the sorted elements temporarily in temp[].
//After merging is done, we copy everything from temp[] back into the original array arr.
//Creating a temperory Array.
  
    int temp[] = new int[e - s + 1];
//e - s + 1  -----> Number of elements to merge.

        while(left <= mid && right <= e){                 // Work's for Both divided Arrays.
            if(arr[left] <= arr[right]){                  // if element in left array is less than the right array.                                                     
                temp[idx++] = arr[left++];
            }   
            else{                                         // // if element in right array is less than the left array.
                temp[idx++] = arr[right++];
            }
        }

// If there are Elements Left in the Array after above Comparison, it will Simply Add it to temperory array.
        while(left <= mid) {                               // Work's for Single Array. Here, Left array.           
            temp[idx++] = arr[left++];                    
        }
        while(right <= e){                                 // Work's for Single Array. Here, Right array.
            temp[idx++] = arr[right++];
        }

// Copy temp[] back to arr[]
        for(int i = 0; i < temp.length; i++){
            arr[s + i] = temp[i];
        }

    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Size of Array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                System.out.println("Enter Array Elements: ");
                arr[i] = sc.nextInt();
            }

            divide(arr, 0 ,n-1);

            System.out.println("Sorted Array is: ");
            for(int i = 0; i < n ; i++){
                System.out.print(arr[i] + "");
            }
        }
    }
}

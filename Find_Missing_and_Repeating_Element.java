// 72

public class Find_Missing_and_Repeating_Element {

    public static int BruteForceApproach(int[] nums) {
        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        for(int i = 1; i < n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[j] == i){
                    count++;
                }
            }if(count == 0){
                missing = i;
            }
            if(count > 1){
                repeating = i;
            }
        }

        //System.out.println("Missing: " + missing);
        //System.out.println("Repeating: " + repeating);
        return missing;
    }

        public static void main(String args[]){
        int[] nums = {4, 3, 6, 2, 1, 1};
        
        BruteForceApproach(nums);
        
    }
    
}

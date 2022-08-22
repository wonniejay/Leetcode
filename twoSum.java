public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int temp1 = 0;
        int index1 = 0;
        int index2 = 0;
        int[] arr = {0, 1};

        /* First Logic: set the first temporary variable as a first element of array
        and go through until the end.
        If it is not satisfied, then move temp1 to a second element... and repeat
        */
        for(int i=0; i < nums.length; i++){
            temp1 = nums[i];
            for(int j=1; j < nums.length; j++){

                // save index when get a target
                if(temp1 + nums[j] == target){
                    index1 = i;
                    index2 = j;
                    arr[0] = index1;
                    arr[1] = index2;
                    break;

                }
            }
        }

        return arr;

    }
}

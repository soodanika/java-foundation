class Practice{
    public static void main(String args[]){
        //Sum of array elements
//        int nums[] = {1,2,3,4,5};
//        int sum = 0;
//
//        for (int n : nums){
//            sum += n;
//        }
//        System.out.println(sum);

        //Max in array
//        int nums[] = {1,0,2,9,3,8};
//        int max = 0;
//
//        for (int n: nums){
//            if (max<n){
//                max = n;
//            }
//        }
//        System.out.println(max);

        //Print array in reverse
//        int nums[]= {1,2,3,4,5};
//
//        for(int i=nums.length-1;i>=0;i--)
//        {
//           System.out.println(nums[i]);
//
//        }

        // count even odd
        int nums [] = {1,9,2,8,3,7,4,6,5};
        int countEve = 0;
        int countOdd = 0;

        for (int n : nums){
            if(n%2==0){
                countEve++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even Count "+ countEve);
        System.out.println("Odd Count "+ countOdd);
    }
}
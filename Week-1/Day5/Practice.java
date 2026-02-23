class Practice{
    public static void main(String args[]){
        //Print matrix
//        int nums[][] = new int [3][5];
//
//        for(int i[] : nums){
//            for(int j : i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Max Element
//        int nums[][] = new int[3][5];
//
//        int max = 0;
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                nums[i][j] = (int)(Math.random()*10);
//            }
//        }
//
//        for(int i[]:nums){
//            for(int j:i){
//                System.out.print(j+" ");
//                if(max<j){
//                    max = j;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println(max);

        //Print diagonal
//        int nums[][] = new int [3][3];
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                nums[i][j] = (int)(Math.random()*10);
//            }
//        }
//
//        for(int i[]:nums){
//            for(int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                if(i==j){
//                    System.out.print(nums[i][j]+ " ");
//                }
//
//            }
//        }

        //Count Even

        int nums[][] = new int[3][4];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        int evenCount = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]%2==0){
                    evenCount++;
                }
            }
        }
        System.out.println(evenCount);

    }
}
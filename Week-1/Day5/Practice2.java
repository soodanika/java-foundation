class Practice2{
    public static void main(String args[]){
        int nums[][] = new int [4][1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }
        //Print row wise
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose
//        int rows = nums.length;
//        int cols = nums[0].length;
//        int transpose [][] = new int [cols][rows];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                transpose[j][i] = nums[i][j];
//            }
//        }
//System.out.println("----------");
//        for(int i=0;i<transpose.length;i++){
//            for(int j=0;j<transpose[i].length;j++){
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.print("--------");
        //Print Boundary


        int rows = nums.length;
        int cols = nums[0].length;

           //Top row
            for(int j=0;j<cols;j++){
                System.out.print(nums[0][j]+" ");
            }


            //Right Column
        int lastCol = cols-1;
        for(int i=1;i<rows;i++){
            System.out.print(nums[i][lastCol]+ " ");
        }

        //Bottom Row

        int lastRow = rows-1;
        lastCol = cols-1;
        if(rows>1) {
            for (int j = lastCol - 1; j >= 0; j--) {
                System.out.print(nums[lastRow][j] + " ");
            }
        }
        //Left Column
        lastCol = 0;
        lastRow = rows -1;
        if(cols>1) {
            for (int i = lastRow - 1; i > 0; i--) {
                System.out.print(nums[i][lastCol] + " ");
            }
        }


    }
}
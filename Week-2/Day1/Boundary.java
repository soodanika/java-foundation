class Boundary{
    public static void main(String args[]){
        //initializations
        int nums [][] = new int[5][3];
        int rows = nums.length;
        int cols = nums[0].length;
        int lastCol = cols-1;
        int lastRow = rows -1;

        //Creating the 2D Array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        //Pritinh the 2D Array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        //Print Boundary elements

        //top row
        for(int j=0;j<cols;j++){
            System.out.print(nums[0][j]+" ");
        }

        //right col
        for(int i=1;i<rows;i++){
            System.out.print(nums[i][lastCol]+" ");
        }

        //bottom row
        if(rows>1) {
            for (int j = lastCol - 1; j >= 0; j--) {
                System.out.print(nums[lastRow][j] + " ");
            }
        }

        //left col
        if(cols>1) {
            for (int i = lastRow - 1; i > 0; i--) {
                System.out.print(nums[i][0] + " ");
            }
        }
    }
}
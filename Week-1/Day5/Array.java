class Array{
    public static void main (String args[]){
        int nums[][] = new int [4][5];

        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++){
               nums[i][j] =  (int)(Math.random()*10);
            }

        }

//        for(int i=0;i<=3;i++){
//            for(int j=0;j<=4;j++){
//                System.out.print(nums[i][j]+ " ");
//            }
//            System.out.println();
//        }

        for(int i[] :nums){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
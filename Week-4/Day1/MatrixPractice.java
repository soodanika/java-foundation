class MatrixPractice {
    public static void main(String args[]){
        int arr[][] = new int[3][4];

        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        //top row
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[0][j]+" ");
        }

        //right column
        int lastCol = arr[0].length-1;
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i][lastCol]+" ");
        }

        //bottom row
        int lastRow = arr.length - 1;
        if(arr.length>1) {
            for (int j = lastCol - 1; j >= 0; j--) {
                System.out.print(arr[lastRow][j] + " ");
            }
        }

        //left col
        if(arr.length>1 && arr[0].length>1) {
            for (int i = lastRow - 1; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
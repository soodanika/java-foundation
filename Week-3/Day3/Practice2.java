class Practice2{
    public static void main(String args[]){
        int arr[][] = new int[1][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Print boundry
        System.out.println("--------------------");
        int lastrow=0;
        int lastcol=0;

        //top row
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[0][j]+" ");
        }

        //right column
        lastcol = arr[0].length-1;
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i][lastcol]+" ");
        }

        //bottom row
        if(arr[0].length>1) {
            lastrow = arr.length - 1;
            for (int j = lastcol - 1; j >= 0; j--) {
                System.out.print(arr[lastrow][j] + " ");
            }
        }

        //left column
        if(arr.length>1) {
            for (int i = lastrow - 1; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }

    }
}
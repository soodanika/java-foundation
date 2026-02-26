class ArrayRevision{
    public static void main(String args[]){
//        int arr[] = {1,2,3,4,5};
////        Find maximum element
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("MAX "+max);
////        Find minimum element
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("MIN "+ min);
//
////        Count even numbers
//
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                count++;
//            }
//        }
//    System.out.println("Count "+ count);
//
////        Reverse an array
//        int reverse[] = new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1;i>=0;i--){
//            reverse[j]=arr[i];
//            j++;
//        }
//
//        for(int i=0;i<reverse.length;i++){
//            System.out.print(reverse[i]+ " ");
//        }

        int arr[][] = new int [4][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int a[] : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

        //Row wise
        System.out.print("Row wise - ");
        for(int a[] : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
        }

        //Column wise
        System.out.println();
        System.out.print("Column wise - ");
        for(int j =0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
        }

        //Diagonal
        System.out.println();
        System.out.print("Diagonal wise - ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
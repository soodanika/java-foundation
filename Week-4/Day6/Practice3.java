class Practice3{
    public static void main(String args[]){
        int arr[] = {5,5,5};

//        int max= Integer.MIN_VALUE;
//
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

        //Second-largestnumber

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            } else if(arr[i]>=secondmax && arr[i]!=max){
                secondmax = arr[i];
            }
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.println("Nothing to compare");
        } else {
            System.out.println(secondmax);
        }
    }
}
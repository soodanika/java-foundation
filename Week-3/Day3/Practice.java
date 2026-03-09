class Practice{
    public static void main(String args[]){
        int arr[] = {5,5,3};

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        if(arr.length<2){
            System.out.println(arr[0] + " No other value to compare");
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondmax = max;
                max = arr[i];
            } else if(secondmax<arr[i] && arr[i]!=max){
                secondmax = arr[i];
            }
        }

        if(secondmax == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondmax);
        }

    }
}
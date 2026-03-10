class ArrayPractice {
    public static void main(String args[]) {
        int arr[] = {5,5,5,-2,-1};

        if(arr.length < 2) {
            System.out.println("Nothing to compare!");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }

        if(secondmax == Integer.MIN_VALUE) {
            System.out.println("Nothing to compare!");
        } else {
            System.out.println(secondmax);
        }
    }
}
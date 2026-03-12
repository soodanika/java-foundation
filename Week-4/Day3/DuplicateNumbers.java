class DuplicateNumbers{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,5,3,5,6,8,8};

        int freq[] = new int[10];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i< freq.length;i++){
            if(freq[i]>1){
                System.out.print(i+" ");
            }
        }

    }
}
class FrequencyArray2{
    public static void main(String args[]){
        int arr[] =  {1, 2, 3, 4, 2, 2, 3, 1,0};
        // O(n)

        //create a freq array
        int freq[] = new int [arr.length];

        //loop through each element and use the element as index of freq array & increase the count
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" | "+freq[i]);
            }
        }


    }
}
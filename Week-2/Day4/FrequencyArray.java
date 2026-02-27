class FrequencyArray{
    public static void main(String args[]) {
        int arr[] =  {1, 2, 3, 4, 2, 2, 3, 1,0};
        //BRUTE FORCE - O(n^2)

        //create an empty frequency array of same length as arr
        int frequencyarray[] = new int[arr.length];

        //create a varaible to validate already visited element
        int validated = -1;

        //Loop through the array with i, j and check for matching elements, if matching element found
        // (have a count variable initialized to 1) increase count & mark element at j as validated.
        //once j is finished looping update the count in frequency array at position i

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequencyarray[j] = validated;
                }
            }
            if (frequencyarray[i] != validated) {
                frequencyarray[i] = count;
            }
        }

        for (int i = 0; i < frequencyarray.length; i++) {
            if (frequencyarray[i] != validated) {
                System.out.println(arr[i] + " | " + frequencyarray[i]);
            }
        }


    }
}
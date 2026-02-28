class Practice{
    public static void main(String args[]){
        int arr[] = {0, 1, 0, 3, 12};

//        //Array in place sort
//        for(int i=0;i<arr.length/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Second largest
//        int max = Integer.MIN_VALUE;
//        int secondlargest = Integer.MIN_VALUE;;
//
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                secondlargest = max;
//                max = arr[i];
//            } else if(secondlargest<arr[i] && arr[i]!=max){
//                secondlargest = arr[i];
//            }
//        }
//        System.out.println("Second Largest Number is "+ secondlargest);

        // Move 0s to end
//        int newarray[] = new int[arr.length];
//        int j=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                newarray[j] = arr[i];
//                j++;
//            }
//        }
//
//        for(int i=0;i<newarray.length;i++){
//            System.out.print(newarray[i]+" ");
//        }

        //Palindrome
//        String str = "Madam";
//
//        str = str.toLowerCase().replace(" ","");
//
//        String reverse = "";
//
//        for(int i=str.length()-1;i>=0;i--){
//            reverse += str.charAt(i);
//        }
//        if(reverse.equals(str)){
//            System.out.println("PALINDROME!!! "+ reverse);
//        } else {
//            System.out.println("NOT A PALINDROME! " +  reverse);
//        }

        //MAX Freq char
        String str = "Banana again";

        str = str.toLowerCase().replace(" ", "");

        int freqarr [] = new int [26];

        for(int i=0;i<str.length();i++){
            freqarr[str.charAt(i)-'a']++;
        }

        int max = 0;
        char ch =' ';
        for(int i=0;i< freqarr.length;i++){
            if(max<freqarr[i]){
                max = freqarr[i];
                ch = (char) (i+'a');
            }
        }
System.out.println(ch + " occurs "+ max +" times.");


    }
}
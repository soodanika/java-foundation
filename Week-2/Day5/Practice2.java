class Practice2{
    public static void main(String args[]){
        //Max freq
//        String str = "Programming";
//
//        str = str.toLowerCase().replace(" ","");
//
//        int freqarr[] = new int [26];
//
//        for(int i=0;i<str.length();i++){
//            freqarr[str.charAt(i)-'a']++;
//        }
//
//        int max = 0;
//        char ch = ' ';
//        for(int i=0;i<str.length();i++){
//            if(max<freqarr[str.charAt(i)-'a']){
//                max = freqarr[str.charAt(i)-'a'];
//                ch = str.charAt(i);
//            }
//        }
//
//        System.out.println("Max freq is of "+ ch+ ", it occurs "+ max+" times.");

        //First non-rep char
//        String str = "Programming";
//
//        str = str.toLowerCase().replace(" ","");
//
//        int freqarr[] = new int [26];
//
//        for(int i=0;i<str.length();i++){
//            freqarr[str.charAt(i)-'a']++;
//        }
//
//        for(int i=0;i< str.length;i++){
//            if(freqarr[str.charAt(i)-'a']==1){
//                System.out.println("First Non Reapeating Char is "+ str.charAt(i));
//                return;
//            }
//        }

        //Move 0s to end
        int arr[] = {0,1,0,3,12,1,2,6,0,2,0,0,0};

//        for(int i=0;i<arr.length-1;i++){
//            int temp;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==0){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

//        int insertpos = 0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                arr[insertpos] = arr[i];
//                insertpos++;
//            }
//        }
//
//        while(insertpos<arr.length){
//            arr[insertpos] = 0;
//            insertpos++;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //s1 is Rotating s2
        String s1 = "abcd";
        String s2 = "acdb";

        s1 = s1+s1;

        if(s1.contains(s2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
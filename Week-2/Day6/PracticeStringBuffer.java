class PracticeStringBuffer{
    public static void main(String args[]){
        StringBuilder name = new StringBuilder("aaabbaa");
//        str = str.reverse();
//        System.out.print(str);

        //Remove vowels
//        for(int i=0;i<name.length();i++){
//            char ch = name.charAt(i);
//            if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'){
//                name.deleteCharAt(i);
//                i--;
//            }
//        }
//        System.out.print(name);

        //Toggel Case
//        String str = name.toString();
//
//        if (str.equals(str.toUpperCase())) {
//            System.out.println(str.toLowerCase());
//        } else {
//            System.out.println(str.toUpperCase());
//        }

        //Compression
        String name1 = name.toString().toLowerCase();
        int count = 1;

        for(int i=1;i<name1.length();i++){
            if(name1.charAt(i) == name1.charAt(i-1)){
                count++;
            } else {
                System.out.print(name1.charAt(i-1));
                System.out.print(count);
                count = 1;
            }
        }

        // print last group
        System.out.print(name1.charAt(name1.length()-1));
        System.out.print(count);

    }
}
class Practice{
    public static void main(String args[]){
        StringBuilder name = new StringBuilder("abbaca");
//        StringBuilder result = new StringBuilder();
//
//        result.append(name.charAt(0));
//
//        for(int i = 1; i < name.length(); i++){
//            if(name.charAt(i) != name.charAt(i - 1)){
//                result.append(name.charAt(i));
//            }
//        }
//
//        System.out.println(result);

//        for(int i=1;i<name.length();i++){
//            if(name.charAt(i)==name.charAt(i-1)){
//                name.deleteCharAt(i);
//                i--;
//            }
//        }
//        System.out.println(name);
//        StringBuilder result = new StringBuilder("");
//        for(int i=1;i<name.length();i++){
//            if(Character.isDigit(name.charAt(i))){
//                char ch = name.charAt(i-1);
//                int digit = name.charAt(i)-'0';
//                while(digit>0){
//                    result.append(ch);
//                    digit --;
//                }
//            }
//        }
//        System.out.println(result);

        //Remove adjacent pairs
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < name.length(); i++){
            char current = name.charAt(i);

            int size = result.length();

            if(size > 0 && result.charAt(size - 1) == current){
                result.deleteCharAt(size - 1);
            } else {
                result.append(current);
            }
        }

        System.out.println(result);
    }
}
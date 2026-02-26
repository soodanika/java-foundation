class Consonants{
    public static void main(String args[]){
        String name = "Anika";
        name = name.toLowerCase();
        int count = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                count++;
            }
        }
        System.out.println("Total no of consonants in "+ name+" is "+ count);
    }
}
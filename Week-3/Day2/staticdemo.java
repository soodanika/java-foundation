class Phone{
    String brand;
    int price;
    static String name;

    public static void show(Phone obj){
        System.out.println(obj.brand+": "+ obj.price+": "+ name);
    }
}

class staticdemo{
    public static void main(String args[]){
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.price = 1500;
//        obj1.name = "SmartPhone";

        Phone obj2 = new Phone();
        obj2.brand = "Samsung";
        obj2.price = 1700;
//        obj2.name = "Phone";

        Phone.name = "Phones";

        Phone.show(obj1);



    }
}
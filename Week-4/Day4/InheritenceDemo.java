

class InheritenceDemo{
    public static void main(String args[]){
        VeryAdvCalc cal = new VeryAdvCalc();
        int r1 = cal.add(4,5);
        int r2 = cal.sub(7,4);

        int r3 = cal.multi(5,3);
        int r4 = cal.div(15,3);
        double r5 = cal.power(4,3);
        System.out.println(r1+" "+ r2+" "+ r3+" "+r4+" "+r5);
    }
}
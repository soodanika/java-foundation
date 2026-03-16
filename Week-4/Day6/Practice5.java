class Shape{
    public void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Practice5{
    public static void main(String args[]){
        Circle s = new Circle();
        s.draw();
    }
}
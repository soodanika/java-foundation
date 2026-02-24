class Demo {

    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getPen(int cost){
        if (cost>=10)
            return "Pen";
        return "Nothing";
    }
}

public class Methods{

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.playMusic();

        String gotPen = obj.getPen(1);
        System.out.println(gotPen);
    }
}
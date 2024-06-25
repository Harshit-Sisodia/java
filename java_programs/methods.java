package java_programs;

class computer {

    public void playMusic() {
        System.out.println("Music playing..");
    }

    public String getMePen(int cost) {
        return "pen"; // returning the type string
    }
}

public class methods {
    public static void main(String[] args) {

        int num = 10;
        computer obj = new computer();
        obj.playMusic();

        String str = obj.getMePen(num);

        System.out.println("the string is "+str);

    }

}

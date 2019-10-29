import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<String> randomList = new ArrayList<String>();
        Random rand = new Random();

        randomList.add("blue");
        randomList.add("green");
        randomList.add("yellow");
        randomList.add("red");
        randomList.add("purple");
        randomList.add("pink");
        int randNum = rand.nextInt(randomList.size());
        System.out.println("your random element is : " + randomList.get(randNum));

    }
}

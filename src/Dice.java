import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private int dieSum;

    public static int RandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int roll() {
        die1 = RandomNumber(1, 6);
        die2 = RandomNumber(1, 6);
        dieSum = die1 + die2;
        return dieSum;
    }

    public int getDie1() {
        return die1;
    }
    public int getDie2() {
        return die2;
    }
}
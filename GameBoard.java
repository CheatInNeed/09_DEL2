public class GameBoard {
    // defining array of game board field values
    private int values[] = {250,-100,100,-20,180,0,-70,60,-80,-50,650}; 
    
    // method for printing status of the game and return value for money balance update
    public int getValue(int dieSum) {
        String output = switch (dieSum){
            case 2 -> "Congratulations! You have reached the Tower and have found 250 gold coins.";
            case 3 -> "Oh no! You have reached the Crater.... You lost 100 gold coins";
            case 4 -> "Congratulations! You have reached the Palace Gates and have found 100 gold coins.";
            case 5 -> "Oh no! You have reached the Cold Desert.... You lost 20 gold coins";
            case 6 -> "Congratulations! You have reached the Goldmine and have found 180 gold coins.";
            case 7 -> "Oh well... You reached the Monastery and nothing happened";
            case 8 -> "Oh no! You have reached the Black Cave .... You lost 70 gold coins";
            case 9 -> "Congratulations! You have reached the Huts in the Mountain and have found 60 gold coins.";
            case 10 -> "Oh no! You have reached the Werewall.... You lost 80 gold coins, BUT you get an extra turn!";
            case 11 -> "Oh no! You have reached the Pit.... You lost 50 gold coins";
            case 12 -> "Congratulations! You have reached the Goldmine and have found 650 gold coins.";
            default -> "Error! Unknown field reached. Restart game!";
        };
        System.out.println(output);
        return values[dieSum-2];
    }
}
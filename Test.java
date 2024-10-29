public class Test {
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;
    int seven = 0;
    int eight = 0;
    int nine = 0;
    int ten = 0;
    int eleven = 0;
    int twelve = 0;
    int negatives = 0;

    public void diceCounter(int sum){
        if (sum == 2) {
            two += 1;
        } else if (sum == 3) {
            three += 1;
        } else if (sum == 4) {
            four += 1;
        } else if (sum == 5) {
            five += 1;
        } else if (sum == 6) {
            six += 1;
        } else if (sum == 7) {
            seven += 1;
        } else if (sum == 8) {
            eight += 1;
        } else if (sum == 9) {
            nine += 1;
        } else if (sum == 10) {
            ten += 1;
        } else if (sum == 11) {
            eleven += 1;
        } else if (sum == 12) {
            twelve += 1;
        } 
    }
    public void dicePrinter(){
        System.out.println("2: " + two);
        System.out.println("3: " + three);
        System.out.println("4: " + four);
        System.out.println("5: " + five);
        System.out.println("6: " + six);
        System.out.println("7: " + seven);
        System.out.println("8: " + eight);
        System.out.println("9: " + nine);
        System.out.println("10: " + ten);
        System.out.println("11: " + eleven);
        System.out.println("12: " + twelve);
    }
    public void negativeCounter(int moneyTotal){
        if (moneyTotal < 0){
            negatives += 1;
        }
    }
    public void negativePrinter(){
        System.out.print(negatives + " times.");
        }
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int testTurns = scanner.nextInt();
        scanner.close();

        System.out.println("Testing has been initialized. Running "+ testTurns + " turns");
        var playerTest = new player("Test");
        var test = new Test();

        for (int i = 0; i < testTurns; i++){
            int sum = playerTest.roll();
            playerTest.setMoney(playerTest.getValue(sum));
            test.diceCounter(sum);
            test.negativeCounter(sum);
        }
        System.out.println("Test for " + testTurns + " turns has been completed.");
        System.out.println(playerTest.getName() + "now has " + playerTest.getMoney() + "gold coins.");
        System.out.println("The die sum totals are:");
        test.dicePrinter();   

        System.out.println("The coin total of "+ playerTest.getName() + "has been negative ");
        test.negativePrinter();
    }
}


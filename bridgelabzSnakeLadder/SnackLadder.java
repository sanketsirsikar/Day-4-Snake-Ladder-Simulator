package com.bridgelabzSnakeLadder;

public class SnackLadder {
    public static void main(String[] args) {
        int playOption =0;
        int POSITION = 0;
        int rollDice = 0;
        playOption = (int)(Math.random() *10) % 3;
        switch (playOption){
            case 0:
                System.out.println("You encountered a LADDER");
                System.out.println("you can move" +rollDice+ "places ahead.");
                POSITION = POSITION + rollDice;
                break;
            case 1:
                System.out.println("you encountered a SNAKE");
                System.out.println("you will move" +rollDice+ "places back.");
                POSITION = POSITION - rollDice;
                break;
            case 2:
                System.out.println("You got NO PLAY");
                System.out.println("You will have to skip your turn.");
        }
        if (POSITION < 0)
            POSITION = 0;
        System.out.println("Current Position : Square " +POSITION);
    }
}

/* The Player then checks for
a Option. They are No Play,
Ladder or Snake. - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same
position
- In Case of Ladder the player moves ahead by the
number of position received in the die

- In Case of Snake the player moves behind*/












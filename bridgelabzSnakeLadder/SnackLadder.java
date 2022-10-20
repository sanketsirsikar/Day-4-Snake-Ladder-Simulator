package com.bridgelabzSnakeLadder;

import java.util.Random;

public class SnackLadder{
    public static void main(String[] args) {
        int choice = 0;
        int POSITION = 0;
        int rollDice = 0;
        int dice = 0;
        for (dice = 1; POSITION < 100; dice++) {
            System.out.println();
            rollDice = (int)((Math.random()*6)+1);
            System.out.println("Rolled Dice Value :"+rollDice);
            choice = (int) (Math.random() * 10) % 3;//check case
            Random random = new Random();
            switch (choice) {
                case 0:
                    System.out.println("You encountered a LADDER");
                    System.out.println("you can move" +rollDice+ "places ahead.");
                    POSITION = POSITION + rollDice;
                    break;
                case 1:
                    System.out.println("you encountered a SNAKE");
                    System.out.println("You will move " + rollDice +" places back.");
                    POSITION = POSITION - rollDice;
                    break;
                default:
                    System.out.println("You got NO PLAY");
                    System.out.println("You will have to skip your turn.");
            }
            if (POSITION < 0)
                POSITION = 0;
            else if (POSITION > 100) {
                POSITION = POSITION-rollDice;
                System.out.println("But you need to score exactly "+(100 - POSITION)+ "To win the game.");
            }
            System.out.println("Current Position : Square " + POSITION);
        }
    }
}

/*Repeat till the Player
reaches the winning
position 100. - Note In case the player position moves
below 0, then the player restarts from 0*/









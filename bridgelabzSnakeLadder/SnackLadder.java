package com.bridgelabzSnakeLadder;

public class SnackLadder {

        public static final int POSITION = 0;
        public static final int ROLL_DICE = 0;

        public static void main(String[] args) {
            System.out.println("Snake & Ladder Simulator");
            System.out.println("This problem simulates a snake and Ladder Game.");
            System.out.println("The Player rolls the die to get a number between 1 to 6 ");
            int rollDice = 0;
            rollDice = (int) ((Math.random() * 6) + 1);
            System.out.println("Roll Dice Value =>" + rollDice);

        }
    }
    /* The Player rolls the die
to get a number
between 1 to 6. - Use ((RANDOM)) to get the number between
1 to 6*/







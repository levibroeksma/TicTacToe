package nl.levi.broeksma.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe");
        //Stap 1: Maak een spelbord
        //Definieer array
        String[] board = new String[9];
        for(int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i);
        }

        //Toon het bord
        printBoard(board);

        String currentPlayer = "X";

        while (true) {
            //Stap2: stel de vraag om een veld te selecteren

            System.out.println("\n Op welk veld wil jij " + currentPlayer + " zetten?");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board[selectedField] = currentPlayer;

            printBoard(board);

            currentPlayer = switchPlayer(currentPlayer);

        }

        //Stap 3: Kijk of de speler heeft gewonnen
        //Stap 4: Laat speler 2 een O zetten
        //Stap 5: Kijk of de speler heeft gewonnen
        //Herhaal stap 2 t/m 5 tot er een winnaar bekend is.
    }

    public static void printBoard(String[] board){
        for(int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;
            if(!isEndOfRow) {
                System.out.print(" | ");
            }
            if(isEndOfRow && !isLastField) {
                System.out.println("\n _________");
            }
        }
    }

    public static String switchPlayer(String currentPlayer) {
        if(currentPlayer == "X") {
            return "O";
        } else {
            return "X";
        }
    }
}



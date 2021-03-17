package nl.levi.broeksma.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe");

        //Definieer array
        String[] board = new String[9];
        for(int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i);
        }

        //Toon het bord
        printBoard(board);

        String currentPlayer = "X";
        boolean hasWon = false;

        while (!hasWon) {

            //Stel de vraag om een veld te selecteren

            System.out.println("\n Op welk veld wil jij " + currentPlayer + " zetten?");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board[selectedField] = currentPlayer;

            //Toon bord
            printBoard(board);

            hasWon = hasPlayerWon(board, currentPlayer);

            currentPlayer = switchPlayer(currentPlayer);

        }

        System.out.println("\n Gefeliciteerd, je hebt gewonnen " + currentPlayer);

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

    public static boolean hasPlayerWon(String[] board, String currentPlayer) {

        //Horizontale opties om te winnen

        if(board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) {
                return true;
        }

        if(board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
                return true;
        }

        if(board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }

        //Verticale opties om te winnen

        if(board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }

        if(board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
            return true;
        }

        if(board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        //Diagonale opties om te winnen
        if(board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if(board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }
        return false;
    }

}



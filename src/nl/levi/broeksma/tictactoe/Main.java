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
        //Definieer de grid van het spelbord
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

        //Stap 2: Laat speler 1 een X zetten

        //Ik wil de speler een veld laten kiezen, voor dat hij de X kan invoeren
           //stel de vraag om een veld te selecteren
           System.out.println("Op welk veld wil jij jouw waarde (X of O) invullen?");

          //gebruik scanner om speler het veld te laten selecteren
          Scanner userInput = new Scanner(System.in);

          //gebruik de userInput om het gewenste veld in de array te selecteren
          int fieldSelected = userInput.nextInt();

        //Definieer welk array nummer vervangen moet worden door "X"
        String firstSymbol = "X";
        board[fieldSelected] = firstSymbol;

        for(int i = 0; i < board.length; i++) {
            System.out.print(board[i]);

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;

            if(!isEndOfRow) {
                System.out.print(" | ");
            }
            if(isEndOfRow && !isLastField) {
                System.out.println("\n _________");
            }
        }

        //Stap 3: Kijk of de speler heeft gewonnen
        //Stap 4: Laat speler 2 een O zetten
        //Stap 5: Kijk of de speler heeft gewonnen
        //Herhaal stap 2 t/m 5 tot er een winnaar bekend is.
    }
}



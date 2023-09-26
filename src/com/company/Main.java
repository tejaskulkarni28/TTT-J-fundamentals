package com.company;

class loadGameClass{
    char xos[][];

    // constructor to initialize an object
    loadGameClass(){
        xos = new char[3][3];
        initBoard();
    }

    // method used to initiate blank spaces
    public void initBoard(){
        for(int i=0; i<xos.length; i++){
            for(int j=0; j<xos[i].length; j++){
                xos[i][j] = ' ';
            }
        }
    }

    // method to print the board
    public void printBoard(){
        System.out.println("---------------");
        for(int i=0; i<xos.length; i++){
            System.out.print(" | ");
            for(int j=0; j<xos[i].length; j++){
                System.out.print(xos[i][j] + " | ");
            }
            System.out.println("");
            System.out.println("---------------");
        }
    }

    // method for placing the mark in the boxes
    public void placeMark(int row, int col, char markXOS){
        xos[row][col] = markXOS;
    }
}

public class Main {

    public static void main(String args[]) {
	// write your code here
        loadGameClass ref = new loadGameClass();
        ref.placeMark(1, 1, 'X');
        ref.printBoard();
    }
}

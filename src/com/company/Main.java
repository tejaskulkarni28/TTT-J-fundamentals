package com.company;

class loadGameClass{
    char xos[][];

    // constructor to initialize an object
    loadGameClass(){
        xos = new char[3][3];
        initBoard();
    }

    public void initBoard(){
        for(int i=0; i<xos.length; i++){
            for(int j=0; j<xos[i].length; j++){
                xos[i][j] = ' ';
            }
        }
    }

    public void loadBoard(){
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
}

public class Main {

    public static void main(String args[]) {
	// write your code here
        loadGameClass ref = new loadGameClass();
        ref.loadBoard();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import chess.ChessPiece;

/**
 *
 * @author julia
 */
public class UI {
    
    public static void printboard(ChessPiece[][] piece){
        for(int i=0; i<piece.length; i++){
            System.out.print((8 - i) + " ");
            for(int j=0; j<piece.length; j++){
                printPiece(piece[i][j]);
            }
            System.out.println("");
        }
        System.out.println("  a b c d e f g h");
    }
    
    private static void printPiece(ChessPiece piece){
        if(piece==null){
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }

}

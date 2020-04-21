/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author julia
 */
public class Board {
    
    private int row;
    private int columns;
    private Piece[][] pieces;

    public Board(int row, int columns) {
        this.row = row;
        this.columns = columns;
        pieces  = new Piece[row][columns];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    
    public Piece piece(int row, int columns){
        return pieces[row][columns];
    }
    
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}

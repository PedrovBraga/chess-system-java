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
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int row, int columns) {
        if(row < 1 || columns < 1){
            throw new BoardException("Erro ao criar board: linha e coluna devem ter valores maiores que 1");
        }
        this.rows = row;
        this.columns = columns;
        pieces  = new Piece[row][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    
    public Piece piece(int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Posicao nao existente no board");
        }
        return pieces[row][column];
    }
    
    public Piece piece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posicao nao eeconcontrada no board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }
    
    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("Ja existe uma peca na posicao");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    
    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posicao nao eeconcontrada no board");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }
    
    private boolean positionExists(int row, int column){
        return row >=0 && row < rows && column >=0 && column < columns;
    }
    
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posicao nao existente no board");
        }
        return piece(position) != null;
    }
}

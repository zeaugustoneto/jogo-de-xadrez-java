/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author zeneto
 */
public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // nao precisa atribuir nada, por padrão o java ja coloca valor nulo
    }

    protected Board getBoard() { //não quero que o board seja acessado pela camda de xadrez, é de uso interno do camada de board
        return board;  // só pela subclasse da peça
    }
    // não tem o set pois não quero que meu tabuleiro seja alterado
    // tabuleiro só sera acessado pelas subclasses e pelas classes do mesmo package
}

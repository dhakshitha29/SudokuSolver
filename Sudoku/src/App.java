import java.util.*;
import board.Board;
import game.Game;
import player.Player;
import triple.Triple;

public class App {
    public static void main(String[] args) throws Exception {
        Player p=new Player();
        p.setPlayer();
        p.getPlayerName();

        Board b=new Board();
        // col1
        b.setUpBoardConfig(0, 0, 3);
        b.setUpBoardConfig(0, 2, 6);
        b.setUpBoardConfig(0, 3, 5);
        b.setUpBoardConfig(0, 5, 8);
        b.setUpBoardConfig(0, 6, 4);
        //col2
        List<Integer> col=new ArrayList<>();
        List<Integer> val=new ArrayList<>();

        col.add(0);
        col.add(1);

        val.add(5);
        val.add(2);
        b.setColumnWiseVlaues(1, col, val);

        List<Triple> l=new ArrayList<>();
        l.add(new Triple(2, 1, 8));
        l.add(new Triple(2 , 2, 7));
        l.add(new Triple(2, 7, 3));
        l.add(new Triple(2, 8, 1));
        l.add(new Triple(3, 2, 3));
        l.add(new Triple(3, 4, 1));
        l.add(new Triple(3, 7, 8));
        l.add(new Triple(4, 0, 9));
        l.add(new Triple(4, 3, 8));
        l.add(new Triple(4, 4, 6));
        l.add(new Triple(4, 5, 3));
        l.add(new Triple(4, 8, 5));
        l.add(new Triple(5, 1, 5));
        l.add(new Triple(5, 4, 9));
        l.add(new Triple(5, 6, 6));
        l.add(new Triple(6, 0, 1));
        l.add(new Triple(6, 1, 3));
        l.add(new Triple(6, 6, 2));
        l.add(new Triple(6, 7, 5));
        l.add(new Triple(7, 7, 7));
        l.add(new Triple(7, 8, 4));
        l.add(new Triple(8, 2, 5));
        l.add(new Triple(8, 3, 2));
        l.add(new Triple(8, 5, 6));
        l.add(new Triple(8, 6, 3));
        b.setUpBoard(l);
        b.printBoard();

        Game g=new Game(b, p);
        g.play();
    }
}

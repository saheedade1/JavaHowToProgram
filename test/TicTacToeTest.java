import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test

    void ticTacToeHasABoard() {
        CellValue [][] board = new CellValue[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = CellValue.EMPTY;
            }
        }
        assertArrayEquals(board, ticTacToe.getBoard());
    }

    @Test
    void boardCanBeDisplayed() {
        CellValue [][] board = new CellValue[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = CellValue.EMPTY;
            }
        }

        assertArrayEquals(board,ticTacToe.displayBoard());
    }

    @Test
    void testThatTheConstructorShouldInitializeTheBoardElementsToEMPTY() {
       CellValue[][] board = ticTacToe.getBoard();
        for (CellValue[] row:board) {
            for (CellValue column:row) {
                assertEquals(CellValue.EMPTY, column);
            }
        }
    }

    @Test
    void testThatTheGameOnlyAllowsTwoPlayers() {
        assertEquals(2, ticTacToe.getPlayers().length);
    }

    @Test
    void testThatPlayersAreCreated() {
        Player player = new Player(1);
        for (int i = 0; i < ticTacToe.getPlayers().length; i++) {
            Player newPlayer = ticTacToe.getPlayers()[i];
            assertTrue(newPlayer.equals(player));
        }

    }

    @Test
    void testThatPlayerOneCanPlay() {
        Player playerOne= ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(5, board);
        assertEquals(CellValue.X, ticTacToe.getBoard()[1][1]);
    }

    @Test
    void testThatPlayerTwoCanPlay() {
        Player playerTwo= ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerTwo.move(5, board);
        assertEquals(CellValue.O, ticTacToe.getBoard()[1][1]);
    }

    @Test
    void testThatPlayerOneCanplayInAnyCell() {

        Player playerOne= ticTacToe.getPlayers()[0];

        CellValue[][] board = ticTacToe.getBoard();

        playerOne.move(1, board);
        playerOne.move(2, board);
        playerOne.move(3, board);
        playerOne.move(4, board);
        playerOne.move(5, board);
        playerOne.move(6, board);
        playerOne.move(7, board);
        playerOne.move(8, board);
        playerOne.move(9, board);

        assertEquals(CellValue.X, ticTacToe.getBoard()[0][0]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[0][1]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[0][2]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[1][0]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[1][1]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[1][2]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[2][0]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[2][1]);
        assertEquals(CellValue.X, ticTacToe.getBoard()[2][2]);
    ticTacToe.displayBoard();

    }
    @Test
    void testThatPlayerTwoCanplayInAnyCell() {

        Player playerTwo = ticTacToe.getPlayers()[1];

        CellValue[][] board = ticTacToe.getBoard();

        playerTwo.move(1, board);
        playerTwo.move(2, board);
        playerTwo.move(3, board);
        playerTwo.move(4, board);
        playerTwo.move(5, board);
        playerTwo.move(6, board);
        playerTwo.move(7, board);
        playerTwo.move(8, board);
        playerTwo.move(9, board);

        assertEquals(CellValue.O, ticTacToe.getBoard()[0][0]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[0][1]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[0][2]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[1][0]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[1][1]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[1][2]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[2][0]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[2][1]);
        assertEquals(CellValue.O, ticTacToe.getBoard()[2][2]);
        ticTacToe.displayBoard();

    }

    @Test
    void thatPlayerCanOnlyPlayIntoAnEmptyCell() {
     Player playerOne = ticTacToe.getPlayers()[0];
     CellValue[][] board = ticTacToe.getBoard();
     assertEquals(CellValue.EMPTY,board[0][1]);
     playerOne.move(2,board);
     assertEquals(CellValue.X,board[0][1]);
     Player playerTwo = ticTacToe.getPlayers()[1];
     playerTwo.move(2,board);
     assertEquals(CellValue.X,board[0][1]);
     playerTwo.move(5,board);
     assertEquals(CellValue.O,board[1][1]);
      playerOne.move(5,board);
      assertEquals(CellValue.O,board[1][1]);
      ticTacToe.displayBoard();

    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell123() {
        Player playerOne = ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerOne.move(2, board);
        playerOne.move(3, board);
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell456() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerTwo.move(6, board);
        playerOne.move(8, board);
        playerOne.move(7,board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(8,board);
        playerTwo.move(5,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell789() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerTwo.move(6, board);
        playerTwo.move(2, board);
        playerOne.move(3,board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(8,board);
        playerTwo.move(9,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell147() {
        Player playerOne = ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerOne.move(4, board);
        playerOne.move(7, board);
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell258() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(2, board);
        playerOne.move(5, board);
        playerOne.move(8, board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(3,board);
        playerTwo.move(9,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell369() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(6, board);
        playerOne.move(9, board);
        playerTwo.move(8,board);
        playerTwo.move(7,board);
        playerTwo.move(2,board);
        playerOne.move(5,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell159() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(5, board);
        playerOne.move(7, board);
        playerOne.move(2, board);
        playerOne.move(6, board);
        playerTwo.move(9, board);
        playerTwo.move(1, board);
        playerTwo.move(8, board);
        playerTwo.move(4, board);
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell357() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(5, board);
        playerOne.move(7, board);
        playerTwo.move(9, board);
        playerTwo.move(1, board);
        playerTwo.move(8, board);
        playerTwo.move(4, board);
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }

    @Test
    void testThatTheGameChecksForWinnerAfterEachPlay() {
        CellValue[][] board = ticTacToe.getBoard();
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        playerOne.move(9,board);
        ticTacToe.checkForWinner();
        playerTwo.move(5,board);
        ticTacToe.checkForWinner();
        playerOne.move(4,board);
        ticTacToe.checkForWinner();
        playerTwo.move(8,board);
        ticTacToe.checkForWinner();
        playerOne.move(7,board);
        ticTacToe.checkForWinner();
        playerTwo.move(6,board);
        ticTacToe.checkForWinner();
        playerOne.move(3,board);
        ticTacToe.checkForWinner();
        playerTwo.move(2,board);
        ticTacToe.checkForWinner();
        ticTacToe.displayBoard();
        assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

}
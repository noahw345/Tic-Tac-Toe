package comWeinstein;
import java.util.Scanner;
public class gameTester {
	public static void main(String[] args) {
		int player = 1;
		int x, y;
		Scanner s = new Scanner(System.in);
		Game game = new Game();
		game.printBoard();
		while(true)
		{
			System.out.println("Player " + player +  " enter row then column");
			x = s.nextInt();
			y = s.nextInt();
			game.placeMark(x,y);
			
			if(player % 2 == 1){player++;}
			else{player--;}
			
			if (game.checkForWin()) {
			   System.out.println("We have a winner! Congrats!");
			   game.printBoard();
			   System.exit(0);
			}
			else if (game.isBoardFull()) {
			   System.out.println("Appears we have a draw!");
			   game.printBoard();
			   System.exit(0);
			}
			game.printBoard();
			game.changePlayer();
		}
	}
}


import javax.swing.SwingUtilities;
/*
 * Tic Tac Toe GUI Project (Java Swing)
*/

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TicTacToeGUI();
			} 
		});
	}
}

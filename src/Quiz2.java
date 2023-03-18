import javax.swing.JOptionPane;

public class Quiz2 {

	public static String ask(String question){
		while (true) {
			question += "A. Jurassic World:Dominion \n"
					+ "B. Thor:Love and Thunder \n"
					+ "C. Avatar: The Way of Water \n"
					+ "D. Top Gun: Maverick \n"
					+ "E. Minions: Rise of Gru \n";
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			while ((answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E"))){
				JOptionPane.showMessageDialog(null, "Incorrect, Give it another go!");
				if (answer.equals("C")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					return answer;
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter A, B, C, D or E");
				}
				return answer;
			}
		}
	}
	public static void main(String[] args) {
		String question = "What is the highest grossing movie of 2022? \n";
		question += "A. Jurassic World:Dominion \n"
				+ "B. Thor:Love and Thunder \n"
				+ "C. Avatar: The Way of Water \n"
				+ "D. Top Gun: Maverick \n"
				+ "E. Minions: Rise of Gru \n";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		while ((answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E"))){
			JOptionPane.showMessageDialog(null, "Incorrect, Give it another go!");
			if (answer.equals("C")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter A, B, C, D or E");
			}
			return;
		}
	}

}
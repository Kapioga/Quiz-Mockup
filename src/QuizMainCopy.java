import javax.swing.JOptionPane;

public class QuizMainCopy {

	static int nQuestions = 0;  
	static int nCorrect = 0;
	public static String ask(String question){
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || 
					answer.equals("D") || answer.equals("E"));       
			if (valid) return answer;         
			JOptionPane.showMessageDialog(null, "Invalid answer. please enter A, B, C, D, or E.");     
			}
			
		}
	
	static void check(String question, String correctAnswer) {     
		nQuestions++;     
		String answer = ask(question);     
		if (answer.equals(correctAnswer)) {       
			JOptionPane.showMessageDialog(null, "Correct!");;       
			nCorrect++;            
			} else {       
				JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+correctAnswer+".");
				}
	}
	
	public static void main (String[] args) {
		String question = "Which one is the best tv show?\n";
		question += "A. Flash \n"
				+ "B. The grey's Anatomy \n"
				+ "C. Wonder Woman \n"
				+ "D. The Walking Dead \n"
				+ "E. Game of Thrones \n";
		check(question, "E");
		
		
		question = "What is the average amount of movie goers that purchased popcorn?\n";
		question += "A. 100% \n"
				+ "B. 20% \n"
				+ "C. 50%\n"
				+ "D. 80% \n"
				+ "E. 60% \n";
		check (question, "D");
		
		question = "What snack is purchased the most at theatres? \n";
		question += "A. Snickers \n"
				+ "B. Pretzel Bites\n"
				+ "C. Skittles \n"
				+ "D. Twizzlers \n"
				+ "E. Twix \n";
		check (question, "C");
		
		JOptionPane.showMessageDialog(null, nCorrect+" correct out of "+nQuestions+" questions"); 
	}

}
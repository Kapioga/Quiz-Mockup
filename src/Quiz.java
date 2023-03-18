public class Quiz {

	static int nQuestions = 0;
	static int nCorrect = 0;
	
	public static void main (String[] args) {
//		Question question1 = new TrueFalseQuestion("Do spiders have 6 legs?", "FALSE");
//		Question question2 = new TrueFalseQuestion("Crabs are considered fish", "FALSE");
//		Question question3 = new TrueFalseQuestion("You can only fish in the summer", "FALSE");
//		Question question4 = new TrueFalseQuestion("You can catch fish using your hands", "TRUE");
		Question question5 = new TrueFalseQuestion("Carp are invasive species", "TRUE");
		Question question6 = new MultipleChoiceQuestion("Is fishing a common sport?", 
				"It is very common", 
				"it is moderately common", 
				"not common", 
				"No idea", 
				"it could be!",
				"a");
		question6.check();
		

//        question1.check();
//        question2.check();
//        question3.check();
//        question4.check();
        question5.check();

        
        MultipleChoiceQuestion.showResults();
        }                         

}
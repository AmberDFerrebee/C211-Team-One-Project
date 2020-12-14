/**Info 211 Fall 2020 Team One
 * Zack Clevenger
 * Angela Johnson
 * Amber Ferrebee
 */

/**THIS CLASS WAS BUILT TO TEST LOGIC OF INSTULT QUIZ AND SELECTOR
 * 
 * package insultSelector;

import java.util.Scanner;

public class UseInsult{
	
	public static double[] takeQuiz(QuestionsAnswers[] qAnda) {
		double userChoice;
		double[] answers = new double[10];
		
		double answerValue = 0;
		Scanner input = new Scanner(System.in);
		
		
		for (int i = 0; i<qAnda.length; i++) {
			System.out.println(qAnda[i].question);
			userChoice = input.nextInt();
				if(userChoice == 1)
					answerValue = 1.0;
				else if (userChoice == 2)
					answerValue = 2.0;
				else if (userChoice == 3)
					answerValue = 3.0;
			answers[i] = answerValue;
			}
		return answers;
	}
		

	public static void main(String[] args) {
		String I1 = "If you spend word for word with me, I shall make your wit bankrupt.\n (Two Gentlemen of Verona, Act 2, Scene 4)";
		String I2 = "It is a tale told by an idiot, full of sound and fury, signifying nothing.\n (Macbeth, Act 5, Scene 5)";
		String I3 = "More of your conversation would infect my brain.\n (Coriolanus, Act 2, Scene 1)";
		String I4 = " Your brain is as dry as the remainder biscuit after voyage.\n (As You Like It, Act 2, Scene 7)";
		String I5 = "Thy tongue outvenoms all the worms of Nile.\n (Cymbeline, Act 3, Scene 4)";
		String I6 = "I do desire that we may be better strangers.\n (As You Like It, Act 3, Scene 2)";
		String I7 = "There’s no more faith in thee than in a stewed prune.\n (Henry IV Part 1, Act 3, Scene 3)";
		String I8 = "Thou cream faced loon!\n (Macbeth. Act 5, Scene 3)";
		String I9 = "Thou art a boil, a plague sore, an embossed carbuncle in my corrupted blood.\n (King Lear, Act 2, Scene 4)";
		String I10 = "Thou sodden-witted lord! Thou hast no more brain than I have in mine elbows!\n (Troilus and Cressida, Act 2, Scene 1)";
		
		String q1 = "Your opponant smells of...\n 1: Horse manue, freshly squeezed.\n 2: A rotting carcass.\n 3: The jock strap of a sumo wrestler\n";
		String q2 = "Your adversaryis as attractive as...\n 1: An infected boil.\n 2: Fresh cat vomit.\n  3: A wet fart in silk pants.\n";
		String q3 = "Trusting this person makes as much sense as...\n 1: Pissing on an electric fence. \n 2: Taking a fish from a hungry bear. \n "
				+ "3: Beliving Flat-Earthers' theories.\n";
		String q4 = "When they speak, they sound like...\n 1: A fainting goat.\n 2: Acrylic nails meeting a chalkboard.\n "
				+ "3: A bassoon with bronchitis\n";
		String q5 = "This villan has the intelligence of...\n 1: A box of crayons, minus the crayons\n 2: Hei Hei from Moana"
				+ "\n 3: A dog chasing its tail.\n";
		String q6 = "The briefest look at your rival's face...\n 1: Turns you to stone. \n 2:Causes your eyes to hemorrhage n "
				+ "3: Makes you remember your child's first grape drink poo.\n";
		String q7 = "Your opponant's eyes bare an uncanny resemblance to...\n 1: an empty nest\n 2: consentrated cat pee\n "
				+ "3: Rotten stewed and skinned tomatoes.\n";
		String q8 = "Your enemy's wit...\n Is as dull as a rusty spoon. \n 2: Would bore a dead fish.\n "
				+ "3: Makes Mad Libs loook like high literature. \n";
		String q9 = "Your enemy's smile...\n 1: Makes 11th century dental work look cutting edge. \n 2: Has as much scum as a stagnant swamp."
				+ "\n 3: Burns your cornea's because of overwhitening.\n";
		String q10 = "In your opinion, your competetor is...\n 1: A very good waste of air. \n 2: A prime example of the failure of DArwin's theories."
				+ "\n 3:  A pox upon everyone's houses.\n";
		
		Insults[] insultChoices = {
				new Insults(I1),
				new Insults(I2),
				new Insults(I3),
				new Insults(I4),
				new Insults(I5),
				new Insults(I6),
				new Insults(I7),
				new Insults(I8),
				new Insults(I9),
				new Insults(I10),
		};

		QuestionsAnswers[] QandA = {
				new QuestionsAnswers(q1),
				new QuestionsAnswers(q2),
				new QuestionsAnswers(q3),
				new QuestionsAnswers(q4),
				new QuestionsAnswers(q5),
				new QuestionsAnswers(q6),
				new QuestionsAnswers(q7),
				new QuestionsAnswers(q8),
				new QuestionsAnswers(q9),
				new QuestionsAnswers(q10)
		};
		
		double ans[] = takeQuiz(QandA);
		int sum = AnalyseAnswers.sumAnswers(ans);
		System.out.println(sum);
		int ave = AnalyseAnswers.averageOFAnswers(sum);
		System.out.println(ave);		
		int insNumber = AnalyseAnswers.random();
		System.out.println(insNumber);
		Choices.pickIntro(ave);
		Choices.pickInsult(insultChoices, insNumber);
		

		
		
	
	}
	
	
	} */
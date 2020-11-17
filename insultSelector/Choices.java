package insultSelector;

public class Choices {
	String preface;
	String insult;
	int insNumber;
	double average;



	public static void pickIntro(double average) {
		if (1 >= average && average <= 1.75) 
			System.out.println( "They sound horrible.  Use this to knock them down a peg or two!");
		else if (1.76 >= average && average <= 2.25)
			System.out.println("Egads! Throw this wit thier way and they won't know what hit them!");
		else
			System.out.println("A definate scoundrel!  Make them cry with this one!");
	
	}
	
	public static void pickInsult(Insults[] insults, int insNumber) {
		switch (insNumber) {
		case 1:
			System.out.println(insults[0].insult);
			break;
		case 2:
			System.out.println(insults[1].insult);
			break;
		case 3:
			System.out.println(insults[2].insult);
			break;
		case 4:
			System.out.println(insults[3].insult);
			break;
		case 5:
			System.out.println(insults[4].insult);
			break;
		case 6:
			System.out.println(insults[5].insult);
			break;
		case 7:
			System.out.println(insults[6].insult);
			break;
		case 8:
			System.out.println(insults[7].insult);
			break;
		case 9:
			System.out.println(insults[8].insult);
			break;
		case 10:
			System.out.println(insults[9].insult);
			break;
		}

		
		
	
}
}

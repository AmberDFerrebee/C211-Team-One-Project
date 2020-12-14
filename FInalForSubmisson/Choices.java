/**Info 211 Fall 2020 Team One
 * Zack Clevenger
 * Angela Johnson
 * Amber Ferrebee
 */
package insultSelector;

public class Choices {
	static String preface;
	static String insult;
	int insNumber;
	double average;



	public static String pickIntro(double average) {
		if (1 >= average && average <= 1.75) 
			preface = ("They sound horrible.  Use this to knock them down a peg or two!");
		else if (1.76 >= average && average <= 2.25)
			preface = ("Egads! Throw this wit thier way and they won't know what hit them!");
		else
			preface = ("A definate scoundrel!  Make them cry with this one!");
           return preface;  
	
	}
	
	public static String pickInsult(Insults[] insults, int insNumber) {
		switch (insNumber) {
		case 1:
			insult = (insults[0].insult);
			break;
		case 2:
			insult = (insults[1].insult);
			break;
		case 3:
			insult = (insults[2].insult);
			break;
		case 4:
			insult = (insults[3].insult);
			break;
		case 5:
			insult = (insults[4].insult);
			break;
		case 6:
			insult = (insults[5].insult);
			break;
		case 7:
			insult = (insults[6].insult);
			break;
		case 8:
			insult = (insults[7].insult);
			break;
		case 9:
			insult = (insults[8].insult);
			break;
		case 10:
			insult = (insults[9].insult);
			break;
                        
                }       
        return insult;
    }

		
		
	
}


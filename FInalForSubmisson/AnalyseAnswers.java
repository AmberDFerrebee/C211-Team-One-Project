/**Info 211 Fall 2020 Team One
 * Zack Clevenger
 * Angela Johnson
 * Amber Ferrebee
 */
package insultSelector;
import java.util.*;
public class AnalyseAnswers {
	 static // public ArrayList<QuizAnwser> quizAnswer = new int[10];
	   // ArrayList<Car> carList = new ArrayList<Car>();
	    int sum = 0;
	    static int result = 0;
		private int[]answers;
	    

	    public static int sumAnswers(double[] answerArray){
	         
	        for(int i = 0; i<10; i++)
	            sum = (int) (sum + answerArray[i]); 
	        
	        return sum;
	    }
	    public static int averageOFAnswers(int sum){
	    result = sum/10;
	    
	    return result;      
	    
	}
	    public static int random(){
	            int randInt = 1 + (int)(Math.random() * (10 - 1) + 1);
	            return randInt;
	    }
	    
	}

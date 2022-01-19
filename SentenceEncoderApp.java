/*SentenceEncoderApp
@JPCavalcante
03/01/22
*/

import javax.swing.JOptionPane;
public class SentenceEncoderApp
{	//create a main method
	public static void main (String args[])
	{

		//Input
		String sentence = JOptionPane.showInputDialog(null, "Please enter a sentence and end with a dot");
		//Create Object
		SentenceEncoder myE = new SentenceEncoder(sentence);
		//Process
		myE.compute();
		//Output
		String newSentence = myE.getNewSentence();
		myE.printCount(newSentence);

		System.out.println("The encoded sentence is: " + newSentence);
	}
}

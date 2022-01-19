/* SentenceEncoder
   @JPCavalcante
   02/01/22
*/
public class SentenceEncoder
{
	//Declare varaiables
	private String sentence;
	private String newSentence = "";


	//Constructor
	public SentenceEncoder (String sentence)
	{//Initializing the variable here because the compute method relies on the sentence
		this.sentence = sentence;
	}

	//"Calculate" or Encode method
	//this method is void cuz we are not returning anything
	public void compute()

	{	//call first the encode method to encode the original text
		String encoded = encode(sentence);

		//then we revert the encoded one and save to a new sentence
		newSentence = reverse(encoded);

	}
	//Its not reading so it does not expect something back, so its void
	public void setSentence (String sentence)
	{
		this.sentence = sentence;
	}

	public String getNewSentence ()
	{
		return newSentence;
	}

	//method to reverse the sentence
	private String reverse(String sentence)
	{	//declare the string buffer here so it does not save all the sentences
		StringBuffer strBuff = new StringBuffer();
		//loop for reversing
		for(int i = (sentence.length()-1); i >= 0; i--)
		{	//declare the variable here to encapsulate it
			char character = sentence.charAt(i);
			strBuff.append(character);
		}
		//return here so don't need another getter
		return strBuff.toString();
	}

	//method to encode the sentence, passed the parameter here so it does not need a gettr
	private String encode(String sentence)
	{	//declare the string buffer here so it resets for every sentence
		StringBuffer strBuff = new StringBuffer();
		//loop to go through all characters in the sentence
		for(int i = 0; i < sentence.length(); i++)
		{
			char character = sentence.charAt(i);
			//change spaces to +
			if (character == ' ')
			{
				strBuff.append("+");
			}
			//change the 4th character for !
			else if ((i+1) % 4 == 0) {
				strBuff.append("!");
			}
			else
			{//this is to keep all the other characters on our buffer
				strBuff.append(character);
			}
		}// putting our string back and return our method
		return strBuff.toString();
	}

	//method to count if the character is + or !
	public void printCount(String text)
	{	//declare variables here to encapsulate
		//to count + and !
		int count1 = count(text, '!');
		int count2 = count(text, '+');
		//info to be printed to the user
		System.out.println("Found ! " + count1 + " times.");
		System.out.println("Found + " + count2 + " times.");
	}

	//method to count the + and ! we pass the parameter here so we dont put another getter
	private int count(String text, char charToCount)
	{	//encapsulate the variables
		int count = 0;
		//loop to go through the sentence
		for(int i = 0; i < text.length(); i++)
		{	//check if the character is what we looking for
			if (text.charAt(i) == charToCount)
			{//increment the count
				count++;
			}
		}
		//return the parameter, we don`t need the getter then
		return count;
	}

}
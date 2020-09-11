import java.util.Arrays;
/**
 * A WordGram represents a sequence of strings
 * just as a String represents a sequence of characters
 * 
 * @author Dmitri Morales
 *
 */
public class WordGram {
	
	private String[] myWords;
	private String myToString;  // cached string
	private int myHash;         // cached hash value

	/**
	 * Create WordGram by creating instance variable myWords and copying
	 * size strings from source starting at index start
	 * @param source is array of strings from which copying occurs
	 * @param start starting index in source for strings to be copied
	 * @param size the number of strings copied
	 */
	public WordGram(String[] source, int start, int size) {
		myWords = new String[size];
		myToString = "";
		// how come it doesn't work if I put this as null?
		myHash = 0;
		int beg = 0;
		for (int i = start; i < start + size ; i+=1 ){
			myWords[beg] = source[i];
			beg +=1;
		}

		// TODO: initialize all instance variable
	}

	/**
	 * Return string at specific index in this WordGram
	 * @param index in range [0..length() ) for string 
	 * @return string at index
	 */
	public String wordAt(int index) {
		if (index < 0 || index >= myWords.length) {
			throw new IndexOutOfBoundsException("bad index in wordAt "+index);
		}
		return myWords[index];
	}

	/**
	 * Complete this comment
	 * @return length of the instance variable myWords
	 */
	public int length(){
		int wrod = myWords.length;
		return wrod;
	}


	/**
	 * Complete appropriate comment here
	 * @param o object to compare to wordgram to see if it is a wordgram
	 * @return true if it is a wordgram and contains same elements as other wordgram, false if it is not the case
	 */
	@Override
	public boolean equals(Object o) {
		if ((this.toString().equals(o.toString()) && (o instanceof WordGram)) || o == null){
			return true;
		}
		// TODO: Complete this method

		return false;
	}

	/**
	 * @return the hashCode of the gram  (I did not know if we needed to do a doc comment for this, but I did it anyway)
	 * This runs only if myHash == 0 because otherwise it would keep running and would not return the correct value
	 */
	@Override
	public int hashCode(){
		// TODO: complete this method: assign to myHash as needed
		if (myHash == 0) {
			myHash = this.toString().hashCode();
		}
		return myHash;
	}
	

	/**
	 * Create and complete this comment
	 * @param last is last String of returned WordGram
	 * @return the updated wordgram after you shift every word over to the left and add last to the last index
	 */
	public WordGram shiftAdd(String last) {
		String [] something = Arrays.copyOf (myWords, myWords.length+1);
		something[something.length-1] = last;
		WordGram wg = new WordGram(something,1,something.length -1);
		// TODO: Complete this method


		return wg;
	}

	/**
	 *
	 * @return the string created by adding all the words (with .join) that are separated by a space
	 * this only happens if myToString.equals("") because if not, the code would continuously run and wouldn't
	 * allow for the code to work
	 */
	@Override
	public String toString(){
		// TODO: Complete this method, assign to myToString as needed
		if (myToString.equals("")) {
			myToString = myToString.join(" ", myWords);
		}


		return myToString;
	}
}

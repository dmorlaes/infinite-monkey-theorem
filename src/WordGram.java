
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
	 * @return
	 */
	public int length(){
		return myWords.length;
	}


	/**
	 * Complete appropriate comment here
	 * @param o
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		if ((this.toString().equals(o.toString()) && (o instanceof WordGram)) || o == null){
			return true;
		}
		// TODO: Complete this method

		return false;
	}

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
	 * @return
	 */
	public WordGram shiftAdd(String last) {
		myWords = Arrays.copyOf( )
		WordGram wg = new WordGram(myWords,0,myWords.length);
		// TODO: Complete this method


		return wg;
	}

	@Override
	public String toString(){
		// TODO: Complete this method, assign to myToString as needed
		if (myToString.equals("")) {
			myToString = myToString.join(" ", myWords);
		}


		return myToString;
	}
}

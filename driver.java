package apps;

import search.*;
import java.io.*;
import java.util.*;


class Occurrence {
	/**
	 * Document in which a keyword occurs.
	 */
	String document;
	
	/**
	 * The frequency (number of times) the keyword occurs in the above document.
	 */
	int frequency;
	
	/**
	 * Initializes this occurrence with the given document,frequency pair.
	 * 
	 * @param doc Document name
	 * @param freq Frequency
	 */
	public Occurrence(String doc, int freq) {
		document = doc;
		frequency = freq;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "(" + document + "," + frequency + ")";  //document frequency
	}
}

public class driver
{
	
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws IOException
	{
		String docsFile = "docs.txt";
		String noiseWords = "noisewords.txt";
		
		LittleSearchEngine google = new LittleSearchEngine();	
		
		google.makeIndex(docsFile, noiseWords);
		
		String kw1 = "go";
		String kw2 = "in";
		
		google.top5search(kw1, kw2);
		System.out.println(docsFile);
	

		
	}
	
}
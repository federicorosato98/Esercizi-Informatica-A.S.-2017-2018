package dictionarybst;

/**
 *
 * @author federico.rosato
 */
import java.io.*;

public class DictionaryBST {

	public static void main(String[] args) {	
	
	Tree dictionary = new Tree();
	String line;
	try{
		BufferedReader br = new BufferedReader(new FileReader(".\\dictionary.csv"));
		
		while((line = br.readLine()) != null){
			String[] word = line.split(",");
			dictionary.addWord(new Node(word[0], word[2]));
		}
	
	}catch(IOException e){
		e.printStackTrace();
	}

	dictionary.find("Amber");
	}	
}

package letturafile;

/**
 * @author federico.rosato
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetturaFile {
	
	public static void main(String[] args) {

		File file = new File("input.txt");
                
		try{
			Scanner wordScan = new Scanner(new FileInputStream(file));
                        Scanner lineScan = new Scanner(new FileInputStream(file));
			int righe = 0;
			int parole = 0;
		
			do{				 
                            wordScan.next();
                            parole++;				
			}while(wordScan.hasNext());
			
                        while(lineScan.hasNextLine()){				 
                            System.out.print(lineScan.nextLine() + "\n");
                            righe++;				
			}			
                        
			System.out.println("\nIl file contiene " + righe + " righe di testo e " + parole + " parole.");
		}catch(FileNotFoundException e){
			System.out.println("Il file non esiste!");
		}
	}
	
}

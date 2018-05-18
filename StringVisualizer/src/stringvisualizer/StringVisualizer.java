package stringvisualizer;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class StringVisualizer {
	
	public static File file = new File(".\\file.txt");
	public static Scanner input;
	public static String[] strings;
	public static int file_size = 0;
	public static LinkedList<String> list = new LinkedList<>();
	
	public static Button e1;
	public static TextField e2;
	public static Button e3;
	public static Button e4;
	public static TextField e5;
	public static Button e6;
	public static Button e7;
	public static TextField e8;
	public static Button e9;

	public static void main(String[] args){
		
		try{
		 input = new Scanner(new FileInputStream(file));	
		}catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
		
		load();
		
		Frame f = new Frame("StringVisualizer");
		f.setSize(640, 320);
		f.setVisible(true);
		f.setLayout(new GridLayout(3,3));
		WinListener win = new WinListener();
		f.addWindowListener(win);
	
		e1 = new Button("<<");
		e2 = new TextField("Lung = " + strings.length); 
		e3 = new Button(">>");
		e4 = new Button("<");
		e5 = new TextField(strings[0]);
		e6 = new Button(">");
		e7 = new Button("ADD");
		e8 = new TextField();
		e9 = new Button("DEL");		 
				
		e1.setBackground(Color.red);
		e3.setBackground(Color.green);
		e4.setBackground(Color.red);
		e6.setBackground(Color.green);
		e7.setBackground(Color.green);
		if(strings.length == 0)
			e9.setBackground(Color.red);
		else
			e9.setBackground(Color.green);
		
	
		 f.add(e1);
		 f.add(e2); 
		 f.add(e3);
		 f.add(e4);
		 f.add(e5);
		 f.add(e6);
		 f.add(e7);
		 f.add(e8);
		 f.add(e9);
		
		e1.addMouseListener(new BtnListener());
		e3.addMouseListener(new BtnListener());
		e4.addMouseListener(new BtnListener());
		e6.addMouseListener(new BtnListener());
		e7.addMouseListener(new BtnListener());
		e9.addMouseListener(new BtnListener());
	}
	
	public static void load(){
		
		while(input.hasNextLine()){
			list.push(input.nextLine());
			file_size++;
		}
		strings = new String[file_size];
		
		for(int i = 0; i<list.size(); i++){
			strings[i] = list.get(i);
		}
	}
}

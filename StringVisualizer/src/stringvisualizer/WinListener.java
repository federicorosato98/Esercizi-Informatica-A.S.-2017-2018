package stringvisualizer;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WinListener extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Chiusura");
		((Frame) e.getComponent()).dispose();
	}
	
}

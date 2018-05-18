package stringvisualizer;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class BtnListener extends StringVisualizer implements MouseListener {
	
	public static int pos = 0;
	
	
	@Override
	public void mouseClicked(MouseEvent e) {

		if(e.getSource().equals(e1)){
			pos = 0;
			e1.setBackground(Color.red);
			e4.setBackground(Color.red);
			e5.setText(strings[pos]);
			e3.setBackground(Color.green);
			e6.setBackground(Color.green);
		}
		
		if(e.getSource().equals(e3)){
			pos = strings.length-1;
			e3.setBackground(Color.red);
			e6.setBackground(Color.red);
			e5.setText(strings[pos]);
			e1.setBackground(Color.green);
			e4.setBackground(Color.green);
		}
		
		if(e.getSource().equals(e4)){
			if(pos != 0){
				pos--;
				e5.setText(strings[pos]);
				e3.setBackground(Color.green);
				e6.setBackground(Color.green);				
			}
			if(pos == 0){
				e1.setBackground(Color.red);
				e4.setBackground(Color.red);
			}
		}
		
		if(e.getSource().equals(e6)){
			if(pos != strings.length-1){
				pos++;
				e5.setText(strings[pos]);
				e1.setBackground(Color.green);
				e4.setBackground(Color.green);
			}
			if(pos == strings.length-1){
				e3.setBackground(Color.red);
				e6.setBackground(Color.red);
			}
		}
		
		if(e.getSource().equals(e7)){
				String[] temp = new String[strings.length+1];
				temp = strings.clone();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		 
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}

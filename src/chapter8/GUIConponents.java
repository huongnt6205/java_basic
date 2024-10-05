package chapter8;

import javax.swing.*;

public class GUIConponents {
	
	public static void main(String[] args) {
		
		JButton butOK = new JButton("OK");
		
		JButton butCancel = new JButton("Cancel");
		
		JLabel jName = new JLabel("Enter your name: ");
		
		JTextField jtfName = new JTextField("Type Name Here");
		
		JCheckBox jchkBold = new JCheckBox("Bold");
		
		JCheckBox jchkItalic = new JCheckBox("Italic");
		
		JRadioButton jrbRed = new JRadioButton("Red");
		
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		
		JComboBox jcboColor = new JComboBox(new String[] {"Freshman", "Sophomore", "JUnior", "Senior"});
		
		JPanel panel = new JPanel();
		
		panel.add(butOK);
		panel.add(butCancel);
		panel.add(jName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		
		JFrame frame = new JFrame();
		frame.add(panel); 
		frame.setTitle("Show GUI Components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}

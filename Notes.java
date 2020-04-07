package playGround;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.Canvas;

public class Notes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notes window = new Notes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Notes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			
		frame = new JFrame();
		frame.setBounds(1300, 10,600, 80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea;
        	textArea = new JTextArea(5, 20);
        	textArea.setEditable(true);
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
	}

}

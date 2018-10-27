package com.michael.GoodbyeWorld.main;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GoodbyeWorldMain extends JFrame {
	
	JPanel panel = new JPanel();
	
	JButton button = new JButton();
	
	public static void main(String[] args) {
		GoodbyeWorldMain goodbyeworldmain = new GoodbyeWorldMain();
		
		
	}
	
	GoodbyeWorldMain() {
		setSize(480, 600);
		
		panel.setLayout(new GridLayout(4, 6));
		
		getContentPane().add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.add(button);
			
		button.setText("Hello World");
		
		button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	button.setText("Goodbye World");
            	
            	panel.setBackground(Color.RED);
            }
        });
	}
}

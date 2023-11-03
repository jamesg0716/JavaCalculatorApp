import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CalculatorGUI {
	public void createGUI() {
		// Make the Main Frame
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);

		// Make the Panel for calculator buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(250, 450));
		buttonPanel.setBackground(new Color(154, 219, 223));
		frame.add(buttonPanel, BorderLayout.SOUTH);

		// Make the calculator display Panel
		JPanel displayPanel = new JPanel();
		displayPanel.setPreferredSize(new Dimension(350, 150));
		displayPanel.setBackground(Color.GRAY);
		frame.add(displayPanel, BorderLayout.NORTH);

		// Make the textField for the display Panel that will show operations
		JLabel displayField = new JLabel("");
		displayField.setPreferredSize(new Dimension(300, 50));
		displayField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		displayField.setOpaque(true);
		displayField.setBackground(Color.WHITE);
		displayField.setLayout(new FlowLayout(FlowLayout.CENTER));
		displayPanel.add(displayField);

		// Making Calculator Buttons
		JButton numOne = new JButton("1");
		JButton numTwo = new JButton("2");
		JButton numThree = new JButton("3");
		JButton numFour = new JButton("4");
		JButton numFive = new JButton("5");
		JButton numSix = new JButton("6");
		JButton numSeven = new JButton("7");
		JButton numEight = new JButton("8");
		JButton numNine = new JButton("9");
		JButton numZero = new JButton("0");
		JButton openParenButton = new JButton("(");
		JButton closeParenButton = new JButton(")");
		JButton addButton = new JButton("+");
		JButton subButton = new JButton("-");
		JButton multiButton = new JButton("*");
		JButton divButton = new JButton("/");
		JButton clearButton = new JButton("AC");
		JButton equalsButton = new JButton("=");

		// Changing button Dimensions
		numOne.setPreferredSize(new Dimension(50, 50));
		numTwo.setPreferredSize(new Dimension(50, 50));
		numThree.setPreferredSize(new Dimension(50, 50));
		numFour.setPreferredSize(new Dimension(50, 50));
		numFive.setPreferredSize(new Dimension(50, 50));
		numSix.setPreferredSize(new Dimension(50, 50));
		numSeven.setPreferredSize(new Dimension(50, 50));
		numEight.setPreferredSize(new Dimension(50, 50));
		numNine.setPreferredSize(new Dimension(50, 50));
		numZero.setPreferredSize(new Dimension(50, 50));
		openParenButton.setPreferredSize(new Dimension(50, 50));
		closeParenButton.setPreferredSize(new Dimension(50, 50));
		addButton.setPreferredSize(new Dimension(50, 50));
		subButton.setPreferredSize(new Dimension(50, 50));
		multiButton.setPreferredSize(new Dimension(50, 50));
		divButton.setPreferredSize(new Dimension(50, 50));
		clearButton.setPreferredSize(new Dimension(50, 50));
		equalsButton.setPreferredSize(new Dimension(50, 50));

		// Adding Buttons to buttonPanel
		buttonPanel.add(numOne);
		buttonPanel.add(numTwo);
		buttonPanel.add(numThree);
		buttonPanel.add(numFour);
		buttonPanel.add(numFive);
		buttonPanel.add(numSix);
		buttonPanel.add(numSeven);
		buttonPanel.add(numEight);
		buttonPanel.add(numNine);
		buttonPanel.add(numZero);
		buttonPanel.add(openParenButton);
		buttonPanel.add(closeParenButton);
		buttonPanel.add(addButton);
		buttonPanel.add(subButton);
		buttonPanel.add(multiButton);
		buttonPanel.add(divButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(equalsButton);

		frame.setVisible(true);
	}
}

package lab11;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab11 implements ActionListener {

	private static JLabel word;
	private static JTextField wordtext;

	private static JLabel secWord;
	private static JTextField secWord1;
	private static JButton button;
	private static JLabel addWords;

	private static JLabel number1;
	private static JTextField number1text;

	private static JLabel number2;
	private static JTextField number2text;

	private static JLabel addNumbers;
	private static JButton numbers;

	public static void main(String[] args) {

		JFrame jframe = new JFrame();
		JPanel panel = new JPanel();
		jframe.setSize(400, 400);
		jframe.add(panel);
		jframe.setTitle("Name and Number");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);

		word = new JLabel("Enter word");
		word.setFont(new Font("Monaco", Font.BOLD, 14));
		word.setBounds(10, 20, 80, 25);
		panel.add(word);

		secWord = new JLabel("Enter word");
		secWord.setFont(new Font("Monaco", Font.ITALIC, 14));
		secWord.setBounds(10, 50, 80, 25);
		panel.add(secWord);

		number1 = new JLabel("Enter number");
		number1.setBounds(10, 80, 80, 25);
		panel.add(number1);

		number2 = new JLabel("Enter Number");
		number2.setBounds(10, 110, 80, 25);
		panel.add(number2);

		wordtext = new JTextField(20);
		wordtext.setFont(new Font("Monaco", Font.BOLD, 14));
		wordtext.setBounds(100, 20, 165, 25);
		panel.add(wordtext);

		secWord1 = new JTextField(20);
		secWord1.setBounds(100, 50, 165, 25);
		panel.add(secWord1);

		number1text = new JTextField(20);
		number1text.setBounds(100, 80, 165, 25);
		panel.add(number1text);

		number2text = new JTextField(20);
		number2text.setBounds(100, 110, 165, 25);
		panel.add(number2text);

		button = new JButton("Add words");
		button.setFont(new Font("helvetica Neue", Font.BOLD, 14));
		button.setBounds(10, 200, 150, 50);
		panel.add(button);

		numbers = new JButton("Add Numbers");
		numbers.setBounds(150, 200, 150, 50);
		panel.add(numbers);

		addWords = new JLabel("");
		addWords.setBounds(50, 250, 200, 25);
		panel.add(addWords);

		addNumbers = new JLabel("");
		addNumbers.setBounds(200,250, 250, 25);
		panel.add(addNumbers);

		jframe.setVisible(true);
		
		Button();
		 panel.setBackground(Color.LIGHT_GRAY);
		  ImageIcon imag = new ImageIcon("\\Desktop\\logos.png");
	        jframe.setIconImage(imag.getImage());
	}

	public static void Button() {
		ActionListener buttons = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object obj = ae.getSource();
				if(obj == button) {
					String words = wordtext.getText() + secWord1.getText();
					addWords.setText(words);
				}else if(obj == numbers) {
					try {
						int num1 = Integer.parseInt(number1text.getText());
								int num2 = Integer.parseInt(number2text.getText());
								int total = num1 + num2;
						addNumbers.setText("Total is " + total);
						}catch(Exception e) {
							addNumbers.setText("Not a valid number,Try Again");
						}
				}
				
			}
		};
		button.addActionListener(buttons);
		numbers.addActionListener(buttons);
	
	}
}

package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {addTwoNumbers();});
		randNumber.addActionListener(e -> {getRandomNumber();});
		tellAJoke.addActionListener(e -> {printOutAJoke();});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void addTwoNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("First Number:");
		int firstNumber = Integer.parseInt(s.nextLine());
		System.out.println("Second Number:");
		int secondNumber = Integer.parseInt(s.nextLine());
		System.out.println(firstNumber + secondNumber);
	}
	
	public void getRandomNumber() {
		System.out.println(new Random().nextInt(10000));
	}
	
	public void printOutAJoke() {
		System.out.println("Why did the chicken cross the road?");
		System.out.println("Because North Korean missiles can't reach that far.");
	}
}

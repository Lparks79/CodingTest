package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.Border;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private JTextField txtNum;
	private JLabel lblResult;
	private JTextField txtNumInSeq;
	
	JTextArea textAreaIteration;
	JTextArea textAreaRecursion;
	private JTextField txtArmstrongNum;
	JLabel lblArmstrongResult;
	JButton btnClickMe;

	public MainFrame()
	{
		super("Prime Checker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.window);
		getContentPane().add(panel1);
		JPanel panel2 = new JPanel();
		panel2.setBackground(SystemColor.window);
		getContentPane().add(panel2);
		
		Border border = BorderFactory.createLineBorder(Color.black);
		textAreaIteration = new JTextArea();
		textAreaIteration.setEditable(false);
		textAreaIteration.setBorder(border);
		textAreaRecursion = new JTextArea();
		textAreaRecursion.setEditable(false);
		textAreaRecursion.setBorder(border);
		
		JLabel lblNewLabel = new JLabel("Enter a how many fabonacci number to calculate");
		
		JLabel lblNewLabel_1 = new JLabel("Iteration");
		
		JLabel lblNewLabel_2 = new JLabel("Recurvsion");
		
		txtNumInSeq = new JTextField();
		txtNumInSeq.setColumns(10);
		
		JButton btnCalc = new JButton("Enter");
		
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel2.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_panel2.createSequentialGroup()
							.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addGroup(gl_panel2.createSequentialGroup()
									.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel2.createSequentialGroup()
											.addGap(10)
											.addComponent(txtNumInSeq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(textAreaIteration, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel2.createSequentialGroup()
											.addGap(55)
											.addComponent(btnCalc))
										.addGroup(gl_panel2.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1)
												.addComponent(textAreaRecursion, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))))
							.addContainerGap(186, Short.MAX_VALUE))))
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(11)
					.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumInSeq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCalc))
					.addGap(18)
					.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textAreaIteration, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
						.addComponent(textAreaRecursion, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel2.setLayout(gl_panel2);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		
		btnEnter.setBackground(SystemColor.menu);
		
		JLabel lblResultText = new JLabel("Prime: ");
		lblResult = new JLabel("True or False");
		lblResult.setBorder(border);
		
		JLabel lblEnterANumber = new JLabel("Enter a number from 1 to 100 to check to see if it's prime");
		
		JLabel lblNewLabel_3 = new JLabel("Enter a number to see if it's a Armstrong number");
		
		txtArmstrongNum = new JTextField();
		txtArmstrongNum.setColumns(10);
		JButton btnArmstrong = new JButton("Enter");
		
		JLabel lblArmstrong = new JLabel("Armstrong: ");
		
		lblArmstrongResult = new JLabel("True or False");
		lblArmstrongResult.setBorder(border);
		
		btnClickMe = new JButton("Click Me!");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClickMe.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent arg0) {
				Point point = btnClickMe.getLocation();
				double x = point.getX();
				double y = point.getY();
				point.setLocation(y, x);
				btnClickMe.setLocation(point);
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
		
		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel1.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel1.createSequentialGroup()
									.addComponent(lblArmstrong, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblArmstrongResult, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_3)
								.addComponent(lblEnterANumber)
								.addGroup(gl_panel1.createSequentialGroup()
									.addComponent(lblResultText)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblResult))
								.addGroup(gl_panel1.createSequentialGroup()
									.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtArmstrongNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnArmstrong)
										.addComponent(btnEnter)))))
						.addGroup(gl_panel1.createSequentialGroup()
							.addGap(196)
							.addComponent(btnClickMe)))
					.addContainerGap(213, Short.MAX_VALUE))
		);
		gl_panel1.setVerticalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterANumber)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEnter))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResultText)
						.addComponent(lblResult))
					.addGap(39)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtArmstrongNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnArmstrong))
					.addGap(13)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblArmstrong)
						.addComponent(lblArmstrongResult, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(66)
					.addComponent(btnClickMe)
					.addGap(88))
		);
		panel1.setLayout(gl_panel1);
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(String.valueOf(checkForPrime(txtNum.getText())));
			}
		});
		
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcFabonicci(Integer.parseInt(txtNumInSeq.getText()));
			}
		});
		
		btnArmstrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean result = CheckForArmStrong(Integer.parseInt(txtArmstrongNum.getText()));
				lblArmstrongResult.setText(String.valueOf(result));
			}
		});
		
		this.setMinimumSize(new Dimension(300, 400));
		this.pack();
		this.setLocationRelativeTo(null);
		
		
	}
	private boolean CheckForArmStrong(int num) {
		int original = num;
		int result = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			result = result + digit * digit * digit;
			num = num / 10;
		}
		return (original == result);
		
	}
	private boolean checkForPrime(String text) {
		int num = Integer.parseInt(text);
		if (num == 1)
		{
			return false;
		}
		for(int i=2; i < num; i++)
		{
			int remainder = num % i;
			System.out.println("i = " + i + " remainder = " + remainder);
			if(remainder == 0)
			{
				return false;
			}
		}
		return true;
	}
	private void calcFabonicci(int num)
	{
		Long fabonIteration = new Long(calcIteration(num));
		Long fabonRecursion = new Long(calcRecursion(num));
		textAreaIteration.append(fabonIteration.toString() + "\n");
		textAreaRecursion.append(fabonRecursion.toString() + "\n");
		txtNumInSeq.setText("");
		txtNumInSeq.requestFocus();
		
		
	}
	private long calcIteration(int num)
	{
		if(num == 0)
		{
			System.out.println("fibonacci: " + 0);
			return 0;
			
		}
		if(num == 2 || num == 1)
		{
			System.out.println("fibonacci: " + 1);
			return 1;
		}
		long fibon1 = 1, fibon2 = 1, fibonacci = 1;
		for(int i = 3; i <= num; i++)
		{
			fibonacci = fibon1 + fibon2;
			fibon1 = fibon2;
			fibon2 = fibonacci;
			System.out.println("fibonacci #" + i + " is:"+ fibonacci);
			
		}
		return fibonacci;
	}
	private long calcRecursion(int num)
	{
		if(num == 1 || num == 2)
		{
			return 1;
		}
		return calcRecursion(num - 1) + calcRecursion(num - 2);
	}
}

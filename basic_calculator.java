package basiccalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class basic_calculator {
	public double a=0.0,b=0.0,res=0.0;
	int op=0;
	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basic_calculator window = new basic_calculator();
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
	public basic_calculator() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("CALCULATOR");
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setFont(new Font("Tahoma", Font.BOLD, 20));
		t1.setBounds(10, 48, 263, 65);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==seven)
				{
						t1.setText(t1.getText().concat("7"));
				}
			}
		});
		seven.setFont(new Font("Arial Black", Font.BOLD, 20));
		seven.setForeground(Color.BLACK);
		seven.setBackground(Color.LIGHT_GRAY);
		seven.setBounds(10, 135, 58, 40);
		frame.getContentPane().add(seven);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==four)
				{
						t1.setText(t1.getText().concat("4"));
				}
			}
		});
		four.setForeground(Color.BLACK);
		four.setFont(new Font("Arial Black", Font.BOLD, 20));
		four.setBackground(Color.LIGHT_GRAY);
		four.setBounds(10, 178, 58, 40);
		frame.getContentPane().add(four);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==one)
				{
						t1.setText(t1.getText().concat("1"));
				}
			}
		});
		one.setForeground(Color.BLACK);
		one.setFont(new Font("Arial Black", Font.BOLD, 20));
		one.setBackground(Color.LIGHT_GRAY);
		one.setBounds(10, 221, 58, 40);
		frame.getContentPane().add(one);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==zero)
				{
						t1.setText(t1.getText().concat("0"));
				}
			}
		});
		zero.setForeground(Color.BLACK);
		zero.setFont(new Font("Arial Black", Font.BOLD, 20));
		zero.setBackground(Color.LIGHT_GRAY);
		zero.setBounds(10, 264, 58, 40);
		frame.getContentPane().add(zero);
		
		JButton Delete = new JButton("Delete");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Delete)
				{
						String s=t1.getText();
						t1.setText("");
						for(int i=0;i<s.length()-1;i++)
							t1.setText(t1.getText()+s.charAt(i));
				}
			}
		});
		Delete.setForeground(Color.BLACK);
		Delete.setFont(new Font("Arial Black", Font.BOLD, 20));
		Delete.setBackground(Color.LIGHT_GRAY);
		Delete.setBounds(10, 307, 126, 40);
		frame.getContentPane().add(Delete);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==eight)
				{
						t1.setText(t1.getText().concat("8"));
				}
			}
		});
		eight.setForeground(Color.BLACK);
		eight.setFont(new Font("Arial Black", Font.BOLD, 20));
		eight.setBackground(Color.LIGHT_GRAY);
		eight.setBounds(78, 135, 58, 40);
		frame.getContentPane().add(eight);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==five)
				{
						t1.setText(t1.getText().concat("5"));
				}
			}
		});
		five.setForeground(Color.BLACK);
		five.setFont(new Font("Arial Black", Font.BOLD, 20));
		five.setBackground(Color.LIGHT_GRAY);
		five.setBounds(78, 178, 58, 40);
		frame.getContentPane().add(five);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==two)
				{
						t1.setText(t1.getText().concat("2"));
				}
			}
		});
		two.setForeground(Color.BLACK);
		two.setFont(new Font("Arial Black", Font.BOLD, 20));
		two.setBackground(Color.LIGHT_GRAY);
		two.setBounds(78, 221, 58, 40);
		frame.getContentPane().add(two);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==dot)
				{
						t1.setText(t1.getText().concat("."));
				}
			}
		});
		dot.setForeground(Color.BLACK);
		dot.setFont(new Font("Arial Black", Font.BOLD, 20));
		dot.setBackground(Color.LIGHT_GRAY);
		dot.setBounds(78, 264, 58, 40);
		frame.getContentPane().add(dot);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nine)
				{
						t1.setText(t1.getText().concat("9"));
				}
			}
		});
		nine.setForeground(Color.BLACK);
		nine.setFont(new Font("Arial Black", Font.BOLD, 20));
		nine.setBackground(Color.LIGHT_GRAY);
		nine.setBounds(146, 135, 58, 40);
		frame.getContentPane().add(nine);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==six)
				{
						t1.setText(t1.getText().concat("6"));
				}
			}
		});
		six.setForeground(Color.BLACK);
		six.setFont(new Font("Arial Black", Font.BOLD, 20));
		six.setBackground(Color.LIGHT_GRAY);
		six.setBounds(146, 178, 58, 40);
		frame.getContentPane().add(six);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==three)
				{
						t1.setText(t1.getText().concat("3"));
				}
			}
		});
		three.setForeground(Color.BLACK);
		three.setFont(new Font("Arial Black", Font.BOLD, 20));
		three.setBackground(Color.LIGHT_GRAY);
		three.setBounds(146, 221, 58, 40);
		frame.getContentPane().add(three);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==equal)
				{
					b=Double.valueOf(t1.getText());
					switch(op)
					{
						case 1:
						res=a+b;
					    break;
						case 2:
						res=a-b;
						break;
						case 3:
						res=a*b;
						break;
						case 4:
						res=a/b;
						break;
					}
					t1.setText(""+res);
				}
			}
		});
		
		equal.setForeground(Color.BLACK);
		equal.setFont(new Font("Arial Black", Font.BOLD, 20));
		equal.setBackground(Color.LIGHT_GRAY);
		equal.setBounds(146, 264, 58, 40);
		frame.getContentPane().add(equal);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Clear)
				{
					
					t1.setText(" ");
				}
			}
		});
		Clear.setForeground(Color.BLACK);
		Clear.setFont(new Font("Arial Black", Font.BOLD, 20));
		Clear.setBackground(Color.LIGHT_GRAY);
		Clear.setBounds(146, 307, 126, 40);
		frame.getContentPane().add(Clear);
		
		JButton devide = new JButton("/");
		devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==devide)
				{
					a=Double.valueOf(t1.getText());
					op=4;
					t1.setText(" ");
				}
			}
		});
		devide.setForeground(Color.BLACK);
		devide.setFont(new Font("Arial Black", Font.BOLD, 20));
		devide.setBackground(Color.LIGHT_GRAY);
		devide.setBounds(214, 135, 58, 40);
		frame.getContentPane().add(devide);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==multiply)
				{
					a=Double.valueOf(t1.getText());
					op=3;
					t1.setText(" ");
				}
			}
		});
		multiply.setForeground(Color.BLACK);
		multiply.setFont(new Font("Arial Black", Font.BOLD, 20));
		multiply.setBackground(Color.LIGHT_GRAY);
		multiply.setBounds(214, 178, 58, 40);
		frame.getContentPane().add(multiply);
		
		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==subtract)
				{
					a=Double.valueOf(t1.getText());
					op=2;
					t1.setText(" ");
				}
			}
		});
		subtract.setForeground(Color.BLACK);
		subtract.setFont(new Font("Arial Black", Font.BOLD, 20));
		subtract.setBackground(Color.LIGHT_GRAY);
		subtract.setBounds(214, 221, 58, 40);
		frame.getContentPane().add(subtract);
		
		JButton Add = new JButton("+");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Add)
				{
					a=Double.valueOf(t1.getText());
					op=1;
					t1.setText(" ");
				}
			}
		});
		Add.setForeground(Color.BLACK);
		Add.setFont(new Font("Arial Black", Font.BOLD, 20));
		Add.setBackground(Color.LIGHT_GRAY);
		Add.setBounds(214, 264, 58, 40);
		frame.getContentPane().add(Add);
	}
}

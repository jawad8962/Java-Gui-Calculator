import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Frame1 {
	private String operation = "";
	private double num1 = 0;
	private double num2 = 0;
	private double result = 0;
	private JFrame frmCalculator;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 366, 387);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt.setBounds(10, 34, 331, 41);
		frmCalculator.getContentPane().add(txt);
		txt.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setBackground(SystemColor.control);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn7.getText();
				txt.setText(digit);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 181, 75, 32);
		frmCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(SystemColor.control);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn8.getText();
				txt.setText(digit);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(95, 181, 75, 32);
		frmCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(SystemColor.control);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn9.getText();
				txt.setText(digit);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(180, 181, 75, 32);
		frmCalculator.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.setBackground(SystemColor.control);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn4.getText();
				txt.setText(digit);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 224, 75, 32);
		frmCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(SystemColor.control);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn5.getText();
				txt.setText(digit);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(95, 224, 75, 32);
		frmCalculator.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(SystemColor.control);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn6.getText();
				txt.setText(digit);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(180, 224, 75, 32);
		frmCalculator.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.setBackground(SystemColor.control);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn1.getText();
				txt.setText(digit);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 267, 75, 32);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(SystemColor.control);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn2.getText();
				txt.setText(digit);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(95, 267, 75, 32);
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(SystemColor.control);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn3.getText();
				txt.setText(digit);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(180, 267, 75, 32);
		frmCalculator.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.setBackground(SystemColor.control);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btn0.getText();
				txt.setText(digit);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 310, 75, 32);
		frmCalculator.getContentPane().add(btn0);

		JButton btnequ = new JButton("=");
		btnequ.setBackground(new Color(0, 153, 255));
		btnequ.setForeground(Color.WHITE);
		btnequ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// yahan logic lage ga//
				num2 = Double.parseDouble(txt.getText());
				if (operation == "/") {
					result = (double) (num1 / num2);
				} else if (operation == "*") {
					result = (double) (num1 * num2);
				} else if (operation == "-") {
					result = (double) (num1 - num2);
				} else if (operation == "+") {
					result = (double) (num1 + num2);
				}
				// setText string value lega
				txt.setText(String.valueOf(result));
			}
		});
		btnequ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnequ.setBounds(180, 310, 75, 32);
		frmCalculator.getContentPane().add(btnequ);

		JButton btndiv = new JButton("/");
		btndiv.setBackground(SystemColor.controlShadow);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// operation perform here
				operation = "/";
				num1 = Double.parseDouble(txt.getText());
				txt.setText("");
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndiv.setBounds(266, 181, 75, 32);
		frmCalculator.getContentPane().add(btndiv);

		JButton btnmul = new JButton("X");
		btnmul.setBackground(SystemColor.controlShadow);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "*";
				num1 = Double.parseDouble(txt.getText());
				txt.setText("");
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmul.setBounds(266, 224, 75, 32);
		frmCalculator.getContentPane().add(btnmul);

		JButton btnsub = new JButton("-");
		btnsub.setBackground(SystemColor.controlShadow);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "-";
				num1 = Double.parseDouble(txt.getText());
				txt.setText("");
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsub.setBounds(266, 267, 75, 32);
		frmCalculator.getContentPane().add(btnsub);

		JButton btnadd = new JButton("+");
		btnadd.setBackground(SystemColor.controlShadow);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "+";
				num1 = Double.parseDouble(txt.getText());
				txt.setText("");
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnadd.setBounds(266, 310, 75, 32);
		frmCalculator.getContentPane().add(btnadd);

		JButton btncl = new JButton("Clear");
		btncl.setBackground(Color.RED);
		btncl.setForeground(Color.WHITE);
		btncl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(null);
			}
		});
		btncl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncl.setBounds(10, 138, 75, 32);
		frmCalculator.getContentPane().add(btncl);

		JButton btnbc = new JButton("<--");
		btnbc.setBackground(Color.RED);
		btnbc.setForeground(Color.WHITE);
		btnbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// yahan backsapce ka button hoga // 14.4 is me 0 1 2 3 index han
				if (txt.getText().length() > 0) {
					String str = txt.getText();
					str = str.substring(0, str.length() - 1); // return sub string 14. just
					txt.setText(str);
				} else {
					txt.setText("");
				}
			}
		});
		btnbc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnbc.setBounds(95, 138, 75, 32);
		frmCalculator.getContentPane().add(btnbc);

		JButton btnpoint = new JButton(".");
		btnpoint.setBackground(SystemColor.control);
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = txt.getText() + btnpoint.getText();
				txt.setText(digit);
			}
		});
		btnpoint.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpoint.setBounds(95, 310, 75, 32);
		frmCalculator.getContentPane().add(btnpoint);

		JButton btnsqr = new JButton("sqr");
		btnsqr.setBackground(Color.RED);
		btnsqr.setForeground(Color.WHITE);
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				num1 = Double.parseDouble(txt.getText());
				double sqr = Math.sqrt(num1);
				txt.setText(String.valueOf(sqr));

			}
		});
		btnsqr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsqr.setBounds(266, 138, 75, 32);
		frmCalculator.getContentPane().add(btnsqr);

		JButton btnsq = new JButton("x^");
		btnsq.setBackground(Color.RED);
		btnsq.setForeground(Color.WHITE);
		btnsq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txt.getText());
				double sq = Math.pow(num1, 2);
				txt.setText(String.valueOf(sq));
			}
		});
		btnsq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsq.setBounds(180, 138, 75, 32);
		frmCalculator.getContentPane().add(btnsq);
	}
}

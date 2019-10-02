package img;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register extends JFrame {

		JTextField tfname;
		JPasswordField tfpass1, tfpass2;

		public Register() {
			
		Container c = getContentPane();
		JPanel reg = new JPanel(null);
		JButton CreateAcc = new JButton("Create Account");
		JLabel name = new JLabel("Enter your name :");
		JLabel password = new JLabel("Enter your password :");
		JLabel confirm = new JLabel("Confirm password :");
		tfname = new JTextField(10);
		tfpass1 = new JPasswordField(10);
		tfpass2 = new JPasswordField(10);
		
		name.setBounds(50, 20, 125, 25);
		tfname.setBounds(200,20,125,35);
		confirm.setBounds(50,120,125,25);
		password.setBounds(50,70,125,25);
		tfpass1.setBounds(200,70,125,35);
		tfpass2.setBounds(200,120,125,35);
		CreateAcc.setBounds(140,200,125,25);

		
		reg.add(name);
		reg.add(password);
		reg.add(confirm);
		reg.add(tfname);
		reg.add(tfpass1);
		reg.add(tfpass2);
		reg.add(CreateAcc);
		
		
		CreateAcc.addActionListener(new buttonPressed(this));
		
		c.add(reg);
		
		setPreferredSize(new Dimension(400,300));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		}
		
		public static void main(String[] args) {
			new Register();
		}
		
}

class buttonPressed implements ActionListener {
	
	Register type;
	
	public buttonPressed(Register type) {
		this.type = type;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String name = type.tfname.getText();
		char[] pass = type.tfpass1.getPassword();
		String password = String.copyValueOf(pass);
		
		File file = new File("testout.txt");
		try {
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			br.write(name);
			br.write(" ");
			br.write(password);
			br.append('\n');
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		type.dispose();
		
	}
}


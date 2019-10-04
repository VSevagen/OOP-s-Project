import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LoginPage extends JFrame
{
	
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);
	JSeparator s = new JSeparator(JSeparator.HORIZONTAL);
	
	public boolean bCheck=true;
	
	JLabel FlightType = new JLabel("Types of Flights");
	JButton LDomesticFlight = new JButton("Domestic Flights");
	JButton LInternationalFlight = new JButton("International Flights");

	JLabel LUserName, LPassword;

	JButton LDomesticFlight1 = new JButton("Domestic Flight Booking");
	JButton LInternationalFlight1 = new JButton("International Flight Booking");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin,NewUser;

	final Object[] col1 ={ "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "Trivandrum", "Bangalore", "3125", "16:30" }, { "Trivandrum", "Chennai", "3225", "19:00" }, { "Trivandrum", "Delhi", "1425 ", "08:30" }, { "Trivandrum", "Goa", "1025 ", "09:50" }, { "Trivandrum", "Hyderabad", "1525", "11:00" }, { "Trivandrum", "Kolkata", "3825 ", "05:30" }, { "Trivandrum", "Lucknow", "3025 ", "05:30" }, { "Trivandrum", "Mumbai", "1725", "12:00" }, { "Trivandrum", "Vishakapatnam", "3725", "19:00" } };
	final Object[][] row2 = { { "Trivandrum", "Bali", "21485", "06:20" }, { "Trivandrum", "Bangkok", "9000", "20:45" }, { "Trivandrum", "Cairo", "22975", "10:25" }, { "Trivandrum", "CapeTown", "42500", "16:45" }, { "Trivandrum", "Chicago", "35000", "06:30" }, { "Trivandrum", "Dubai", "12000", "08:15" }, { "Trivandrum", "Frankfurt", "18500", "06:50" }, { "Trivandrum", "HongKong", "20845", "12:00" }, { "Trivandrum", "Istanbul", "22000", "10:45" }, { "Trivandrum", "London", "22600", "14:35" }, { "Trivandrum", "LosAngeles", "35000", "22:00" }, { "Trivandrum", "Melbourne", "27800", "21:15" }, { "Trivandrum", "New York", "32000", "08:50" }, { "Trivandrum", "Paris", "18500", "18:45" }, { "Trivandrum", "Rome", "19900", "20:00"}, { "Trivandrum", "SanFrancisco", "35000", "12:00"}, { "Trivandrum", "shanghai", "24430", "10:15" }, { "Trivandrum", "Singapore", "9000", "21:10" }, { "Trivandrum", "Sydney", "27800", "12:00"}, { "Trivandrum", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "Trivandrum", "Bangalore", "9375", "16:30" }, { "Trivandrum", "Chennai ", "9675", "19:00" }, { "Trivandrum", "Delhi", "4275", "08:30" }, { "Trivandrum", "Goa", "3075", "09:50" }, { "Trivandrum", "Hyderabad", "4575", "11:00" }, { "Trivandrum", "Kolkata", "11475", "05:30" }, { "Trivandrum", "Lucknow", "9075", "05:30" }, { "Trivandrum", "Mumbai", "5175", "12:00" }, { "Trivandrum", "Vishakapatnam", "11175", "19:00" } };
	final Object[][] row4 = { { "Trivandrum", "Bali", "64455", "06:20" }, { "Trivandrum", "Bangkok", "27000", "20:45" }, { "Trivandrum", "Cairo", "68925", "10:25" }, { "Trivandrum", "CapeTown", "37500", "16:45" }, { "Trivandrum", "Chicago", "105000", "06:30" }, { "Trivandrum", "Dubai", "36000", "08:15" }, { "Trivandrum", "Frankfurt", "55500", "06:50" }, { "Trivandrum", "HongKong", "62535", "12:00" }, { "Trivandrum", "Istanbul", "66000", "10:45" }, { "Trivandrum", "London", "67800", "14:35" }, { "Trivandrum", "LosAngeles", "105000", "22:00" }, { "Trivandrum", "Melbourne", "83400", "21:15" }, { "Trivandrum", "New York", "96000", "08:50" }, { "Trivandrum", "Paris", "55500", "18:45" }, { "Trivandrum", "Rome", "59700", "20:00" }, { "Trivandrum", "SanFrancisco", "105000", "12:00" }, { "Trivandrum", "shanghai", "73290", "10:15" }, { "Trivandrum", "Singapore", "27000", "21:10"}, { "Trivandrum", "Sydney", "83400", "12:00"}, { "Trivandrum", "Toronto", "105000", "17:00" } };
	final Object[][] row5 = { { "Trivandrum", "Bangalore", "3125", "16:30" }, { "Trivandrum", "Chennai", "9675", "19:00" }, { "Trivandrum", "Delhi", "1425", "08:30" }, { "Trivandrum", "Goa", "3075", "09:50" }, { "Trivandrum", "Hyderabad", "4575", "11:00" }, { "Trivandrum", "Kolkata", "11475", "05:30" }, { "Trivandrum", "Lucknow", "9075", "05:30" }, { "Trivandrum", "Mumbai", "5175", "12:00" }, { "Trivandrum", "Vishakapatnam", "11175", "19:00" } };
	
	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col1);
	JTable TDomesticFlight1 = new JTable(row3, col1);
	JTable TInternationalFlight1 = new JTable(row4, col1);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	JLabel classes = new JLabel("Classes Available");
	JButton LEconomic = new JButton("Economic");
	JButton LBusiness = new JButton("Business");

	public LoginPage(String name)
	{
		
		super(name);
		WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));
		PFlightTypes.setBackground(Color.DARK_GRAY);
		PLogin.setBackground(Color.LIGHT_GRAY);
		PFlightDetails.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);

		PFlightTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,350, 340);
		PFlightDetails.setBounds(0,340,790,200);
		s.setPreferredSize(new Dimension(5,150));


		LUserName = new JLabel("User Name ");
		LPassword = new JLabel("Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");
		NewUser = new JButton("Register");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 30);
		TPPassword.setBounds(160, 140, 100, 30);
		BLogin.setBounds(160, 200, 100,25);
		NewUser.setBounds(160,250,100,25);

		LDomesticFlight1.setBounds(45, 60, 200, 20);
		LInternationalFlight1.setBounds(45, 100, 200, 20);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);
		PLogin.add(NewUser);

		PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);
		
		classes.setBounds(190,110, 200, 125);
		LEconomic.setBounds(200, 200,100, 25);
		LBusiness.setBounds(200, 200, 100, 25);

		PFlightTypes.add(new JSeparator());
		PFlightTypes.add(classes);
		PFlightTypes.add(new JSeparator());
		PFlightTypes.add(LEconomic);
		PFlightTypes.add(LBusiness);

		s.setVisible(true);
		LEconomic.setVisible(true);
		LBusiness.setVisible(true);
		LBusiness.setVisible(false);
		LEconomic.setVisible(true);

		FlightType.setBounds(200,20, 125,25);
		FlightType.setForeground(Color.white);
		classes.setForeground(Color.white);
		LDomesticFlight.setBounds(175, 60, 150, 25);
		LInternationalFlight.setBounds(175, 100, 150, 25);

		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);
		PFlightTypes.add(FlightType);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		addWindowListener(new ExitListener());

		LDomesticFlight.addMouseListener(new mouse1(this, true));
		LInternationalFlight.addMouseListener(new mouse1(this, false));

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));
		
		LBusiness.addMouseListener(new mouse2(this, true));
		LEconomic.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
		NewUser.addActionListener(new action());
	}

	public static void main(String args[])
	{
		new LoginPage("Airline Reservation System");
	}
}
class action implements ActionListener
{	

	public void actionPerformed(ActionEvent e) {
		new Register("Register page");
	}
	
}

class button1 implements ActionListener
{
	LoginPage type;
	
	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String record = null;
		try {
		FileReader in = new FileReader("testout.txt");
		BufferedReader br = new BufferedReader(in);
		String user = type.TFUserName.getText();
		char[] pass = type.TPPassword.getPassword();
		String password = String.copyValueOf(pass);
		int count = 0;
		
		while((record = br.readLine()) != null) {
			
			String[] split = record.split("\\s");
			if(user.contentEquals(split[0]) && password.contentEquals(split[1])) {
				count++;
				type.PLogin.add(type.LDomesticFlight1);
				type.PLogin.add(type.LInternationalFlight1);

				type.PLogin.remove(type.LUserName);
				type.PLogin.remove(type.TFUserName);
				type.PLogin.remove(type.LPassword);
				type.PLogin.remove(type.TPPassword);
				type.PLogin.remove(type.BLogin);
				type.PLogin.remove(type.NewUser);

				type.c.repaint();
			}
		}
		if(count == 0) {
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
		}
		catch(IOException s) 
		{s.getCause();}
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type,"Domestic Flight Booking");
		else
			new InternationalFlight(type,"");
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LEconomic.setVisible(true);
				type.LBusiness.setVisible(false);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic.setVisible(false);
				type.LBusiness.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LEconomic.setVisible(true);
				type.LBusiness.setVisible(false);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic.setVisible(false);
				type.LBusiness.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}



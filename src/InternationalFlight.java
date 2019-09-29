import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class InternationalFlight extends JFrame
{
	
	JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LImg1, LImg2, LNotes,LUser;
	JTextField TFBookingDate,TFUser;
	Icon img1, img2;
	JButton BFindFlight;
	JPanel PPanel1, PPanel2;

	LoginPage type1;

	public InternationalFlight(LoginPage type1, String name)
	{
		super(name);
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"Trivandrum"};
		String[] sItem2={"Bali","Bangkok","Cairo","CapeTown","Chicago","Dubai","Frankfurt","HongKong","Istanbul","London","LosAngeles","Melbourne","New York","Paris","Rome","SanFrancisco","shanghai","Singapore","Sydney","Toronto"};
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(400,100));

		LBookingDetails = new JLabel("Booking Details");
		LBookingDetails.setFont(new Font("Serif", Font.PLAIN, 20));
		LFrom = new JLabel("From          :");
		LTo = new JLabel("To               :");
		LBookingDate = new JLabel("Booking Date:");
		LClass = new JLabel("Class         :");
		LUser = new JLabel("Your name   :");
		
		LBookingDetails.setForeground(Color.WHITE);
		LFrom.setForeground(Color.WHITE);
		LTo.setForeground(Color.WHITE);
		LBookingDate.setForeground(Color.WHITE);
		LClass.setForeground(Color.WHITE);
		LUser.setForeground(Color.WHITE);
		
		CBFrom = new JComboBox(sItem1);
		CBTo = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		TFUser = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(Color.red);

		//img1=new ImageIcon("map1.jpg");
		//LImg1 = new JLabel(img1);

		BFindFlight = new JButton("Find Flight");

		LBookingDetails.setBounds(20,3,250,30);

		LFrom.setBounds(20,50,100,20);
		CBFrom.setBounds(120,50,125,20);

		LTo.setBounds(20,100,100,20);
		CBTo.setBounds(120,100,125,20);

		LBookingDate.setBounds(14,160,100,20);
		TFBookingDate.setBounds(120,160,125,20);
		LDate.setBounds(250,160,125,20);

		LClass.setBounds(20,220,100,20);
		LUser.setBounds(20,280,100,20);
		TFUser.setBounds(120,280,125,20);
		CBClass.setBounds(120,220,125,20);

		BFindFlight.setBounds(50,350,150,25);

		//LImg1.setBounds(0,290,495,260);

		PPanel1.add(LBookingDetails);
		PPanel1.add(LFrom);
		PPanel1.add(CBFrom);
		PPanel1.add(LTo);
		PPanel1.add(CBTo);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(LUser);
		PPanel1.add(TFUser);
		PPanel1.add(CBClass);
		PPanel1.add(BFindFlight);
		//PPanel1.add(LImg1);
		PPanel1.setBackground(Color.DARK_GRAY);

		c.add(PPanel1,BorderLayout.WEST);

		PPanel2 = new JPanel(null);
		PPanel2.setPreferredSize(new Dimension(400,160));

		LPassengerDetails=new JLabel("PassengerDetails");

		LAdult = new JLabel("Adults(12+) :");

		LChildren = new JLabel("Children(2-11) :");
		LInfant = new JLabel("Infants(under 2) :");

		String[] item4={"1","2","3","4","5","6"};
		CBAdult = new JComboBox(item4);

		String[] item5={"0","1","2","3","4"};
		CBChildren = new JComboBox(item5);

		String[] item6={"0","1","2","3"};
		CBInfant = new JComboBox(item6);

		LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");

		LPassengerDetails.setBounds(40,3,200,25);
		LPassengerDetails.setFont(new Font("Serif", Font.PLAIN, 20));
		LPassengerDetails.setForeground(Color.WHITE);

		LAdult.setBounds(40,40,100,20);
		CBAdult.setBounds(160,40,125,20);

		LChildren.setBounds(40,105,130,20);
		CBChildren.setBounds(160,105,125,20);

		LInfant.setBounds(40,170,130,20);
		CBInfant.setBounds(160,170,125,20);

		LNotes.setBounds(40,240,380,180);
		
		LAdult.setForeground(Color.WHITE);
		LChildren.setForeground(Color.WHITE);
		LInfant.setForeground(Color.WHITE);
		LNotes.setForeground(Color.WHITE);

		PPanel2.add(LPassengerDetails);
		PPanel2.add(LAdult);
		PPanel2.add(LChildren);
		PPanel2.add(LInfant);
		PPanel2.add(CBAdult);
		PPanel2.add(CBChildren);
		PPanel2.add(CBInfant);

		PPanel2.add(LNotes);

		PPanel2.setBackground(Color.DARK_GRAY);

		c.add(PPanel2,BorderLayout.EAST);

		setSize(800,480);
		setLocationRelativeTo(null);
		setVisible(true);

		BFindFlight.addActionListener(new button2(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new InternationalFlight(type1,"International Flight Booking");
	}
}

class button2 implements ActionListener
{
	InternationalFlight type;
	LoginPage type1;
	button2(InternationalFlight type, LoginPage type1)
	{
		this.type = type;
		this.type1 = type1;
	}
	public void actionPerformed(ActionEvent e)
	{
		String sFrom = (String)type.CBFrom.getSelectedItem();
		String sTo = (String)type.CBTo.getSelectedItem();
		String sClass = (String)type.CBClass.getSelectedItem();
		String sBookingDate = type.TFBookingDate.getText();
		String sUser = type.TFUser.getText();
		Integer iPrice=0;
		String sTime="";


		Integer iAdult = Integer.parseInt((String)type.CBAdult.getSelectedItem());
		Integer iChildren = Integer.parseInt((String)type.CBChildren.getSelectedItem());
		Integer iInfant = Integer.parseInt((String)type.CBInfant.getSelectedItem());

		int i = 0;

		if(sClass.equals("Economic"))
		{
			try{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row2[i][2]);
						sTime = (String)type1.row2[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access");
				System.exit(0);
			}
		}
		else
		{
			try
			{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row4[i][2]);
						sTime = (String)type1.row4[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access it");
				System.exit(0);
			}
		}
		type.setTitle(iPrice + " " + sTime);

		iPrice = (iPrice*iAdult)+(iPrice*(iChildren/2));

		int iCount=0;
		int iSeatCount=0;

		String[] sTempFrom=new String[1250];
		String[] sTempTo=new String[1250];
		String[] sTempClass=new String[1250];
		String[] sTempBookingDate=new String[1250];
		String[] sTempUser = new String[1250];
		String[] sTempTime=new String[1250];
		Integer[] iTempAdult=new Integer[1250];
		Integer[] iTempChildren=new Integer[1250];
		Integer[] iTempInfant=new Integer[1250];
		Integer[] iTempPrice=new Integer[1250];

		try
		{
//read from data
			Save1 save1;
			ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save1"));
			do
			{
				save1 = (Save1)OIS1.readObject();
				sTempFrom[iCount] = save1.sFrom;
				sTempTo[iCount] = save1.sTo;
				sTempClass[iCount] = save1.sClass;
				sTempBookingDate[iCount] = save1.sBookingDate;
				sTempUser[iCount] = save1.sUser;
				sTempTime[iCount] = save1.sTime;
				iTempAdult[iCount] = save1.iAdult;
				iTempChildren[iCount] = save1.iChildren;
				iTempInfant[iCount] = save1.iInfant;
				iTempPrice[iCount] = save1.iPrice;

				iCount++;
				if(save1.sBookingDate.equals(sBookingDate))
					if(save1.sTo.equals(sTo))
						iSeatCount=iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
			}while(save1!=null);
			OIS1.close();

		}
		catch(Exception e1)
		{
		}

		iSeatCount = iSeatCount + iAdult + iChildren + iInfant;

		if(iSeatCount > 60)
		{
			JOptionPane.showMessageDialog(null,"Seats are full. Sorry!");
		}
		else
		{
			int iChoice = JOptionPane.showConfirmDialog(null,"Seats available. Do you want to Book now?");
			if(iChoice == JOptionPane.YES_OPTION)
			{
				new PrintTicket1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, sUser, iPrice, sTime);
			try
			{
//write into data
				Save1 save2=new Save1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate,sUser, iPrice, sTime);
				ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save1"));
				for(i=0;i<iCount;i++)
				{
					Save1 temp1=new Save1(sTempFrom[i], sTempTo[i], sTempClass[i], iTempAdult[i], iTempChildren[i], iTempInfant[i], sTempBookingDate[i], sTempUser[i], iTempPrice[i], sTempTime[i]);
					OOS1.writeObject(temp1);
System.out.println(temp1);
				}
				OOS1.writeObject(save2);
				OOS1.close();
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			else
			{
			}
		}
	}
}


class Save1 implements Serializable
{
	String sFrom, sTo, sClass, sBookingDate,sUser, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;
//	int iCount;
	public Save1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate,String sUser, Integer iPrice, String sTime)
	{
		this.sFrom=sFrom;
		this.sTo=sTo;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.sUser = sUser;
		this.iPrice=iPrice;
		this.sTime=sTime;
//		this.iCount = iCount;
	}
	public String toString()
	{
		return sFrom+" "+sTo+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+" "+sUser+" "+iPrice+" "+sTime;
	}
}
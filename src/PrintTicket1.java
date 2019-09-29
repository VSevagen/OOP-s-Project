import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket1 extends JFrame
{
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, String sUser, Integer iPrice, String sTime)
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());


		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500,200));

		JLabel LTitle = new JLabel("AirLine Ticket");
		LTitle.setForeground(Color.decode("#C71585"));
		LTitle.setFont(new Font("Serif", Font.PLAIN, 35));
		JLabel LNotes = new JLabel("<html><body><font color=\"#E42F08\"<p>NOTE: The flight is partially refundable. <p> Please refer to our refund policy.You can find<p> them on our website. If you have any trouble finding<p> it, please contact us on either +230 57998713<p> or +230 57975322.Apologies for the inconvenience caused.</font></body></html>");
		JLabel LFrom = new JLabel("<html>From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;<font color=\"#9B918F\">"+sFrom+"</font></html>");
		JLabel LTo =   new JLabel("<html>To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;: &nbsp;<font color=\"#9B918F\">"+sTo+"</font></html>");
		JLabel LClass =new JLabel("<html>Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;<font color=\"#9B918F\">"+sClass+"</font></html>" );
		JLabel LBookingDate = new JLabel("<html>Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;<font color=\"#9B918F\">"+ sBookingDate+"</font></html>" );
		JLabel LPrice = new JLabel("<html>Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;<font color=\"#9B918F\">"+ iPrice+"</font></html>" );
		JLabel LTime = new JLabel("<html>DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;<font color=\"#9B918F\">"+ sTime+"</font></html>" );
		JLabel LAdult = new JLabel("<html>Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;<font color=\"#9B918F\">"+iAdult+"</font></html>" );
		JLabel LChildren = new JLabel("<html>Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;<font color=\"#9B918F\">"+ iChildren+"</font></html>" );
		JLabel LInfant = new JLabel("<html>Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;<font color=\"#9B918F\">"+iInfant+"</font></html>" );
		JLabel LWishes = new JLabel("<html><body><I><font color=\"#D2B48C\">Wish you a happy journey &nbsp;</font></I></body></html>");

		
		JLabel LTicketNo=new JLabel("<html>TicketNumber &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;<font color=\"#9B918F\">"+"178423"+"</font></html>");
		JLabel LBookedBy=new JLabel("<html>Booked By &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;<font color=\"#9B918F\">"+ sUser+"</font></html>" );

		JLabel LEmpty = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		JLabel LDemo = new JLabel("AirLine-Project Developed By");
		LDemo.setForeground(Color.decode("#8FBC8F"));
		JLabel LVeera=new JLabel("Veerasamy S");
		LVeera.setForeground(Color.decode("#8FBC8F"));
		
		JLabel LAva = new JLabel("Avanish KA");
		LAva.setForeground(Color.decode("#8FBC8F"));

		LTitle.setBounds(200,15,500,45);
		LFrom.setBounds(20,80,300,20);

		LTo.setBounds(20,125,300,20);
		LClass.setBounds(20,170,300,20);
		LBookingDate.setBounds(20,215,300,20);
		LPrice.setBounds(20,260,300,20);
		LTime.setBounds(20,305,300,20);
		LAdult.setBounds(20,345,300,20);
		LChildren.setBounds(20,385,300,20);
		LInfant.setBounds(20,430,300,20);
		LNotes.setBounds(320,190,380,180);

		LWishes.setBounds(500,435,300,20);


		LTicketNo.setBounds(320,80,300,20);
		LBookedBy.setBounds(320,125,300,20);

		LEmpty.setBounds(3,445,1000,20);

		LDemo.setBounds(500,465,300,20);
		LVeera.setBounds(500,485,300,20);
		LAva.setBounds(500,505,300,20);


		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		//Panel2.add(LEmpty);

		Panel2.add(LWishes);

		Panel2.add(LTicketNo);
		Panel2.add(LBookedBy);
		Panel2.add(LEmpty);
		Panel2.add(LDemo);
		Panel2.add(LNotes);

		Panel2.add(LVeera);
		Panel2.add(LAva);

		Panel2.setBackground(Color.white);

		c.add(Panel2, BorderLayout.CENTER);


		//pack();
		setSize(700,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private Object Color(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


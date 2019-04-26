
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.time.LocalDateTime;
import java.time.Month;

import javax.swing.JLabel;
import javax.swing.JPanel;

//Class to manage income page component.
//This includes:
//- Header (title and page controls)
//- Date slider (date, total income and slider buttons)
//- Day componenets (day. total income) 
//- Transactions (title, category, icon. amount)
//- Footer (sorting options) 

public class IncomePage extends JPanel 
{
	//Static Variables
	
	/*
	 Instance Variables
	*/
	
	private static final long serialVersionUID = 1L;
	
	//Dimensions
	int width;
	int height;
	
	//Time
	//set time to local time date when page is opened
	LocalDateTime localDateTime;
	int year;
	Month month;
	
	//TitleBar
	JPanel titleBar;
	JLabel incomeLabel;
	
	//Monthbar
	JPanel monthBar;
	JLabel monthYearLabel;
	
	//Body
	Transaction transactions[];
	JPanel body;
	
	//Footer
	JPanel footer;
	JLabel footerLabel;
	
	//Constructors
	public IncomePage(int width, int height)
	{
		//Dimensions
		this.width = width;
		this.height = height;
		
		//Time
		LocalDateTime localDateTime = LocalDateTime.now();
		int year = localDateTime.getYear();
		Month month = localDateTime.getMonth();
		
		//TitleBar
		this.titleBar = new JPanel();
		this.incomeLabel = new JLabel("Income");
		this.titleBar.add(incomeLabel);
		
		//MonthBar
		this.monthBar = new JPanel();
		this.monthBar.add(monthYearLabel);
		this.monthYearLabel = new JLabel(month+" "+year);
		
		//Body
		//Adds cardlayout to panel to manage transaction list and days
		JPanel body = new JPanel(new CardLayout());
		
		
		//Footer
		JPanel footer = new JPanel();
		this.footerLabel = new JLabel("Income");
		this.footer.add(footerLabel);
		
		//Config
		this.setLayout(new FlowLayout());
		this.add(titleBar);
		this.add(monthBar);
		this.add(body);
		this.add(footer);
		
	}
	
	//Instance methods
	
	//Setters and Getters
}

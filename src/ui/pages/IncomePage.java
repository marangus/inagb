package src.ui.pages;

import java.awt.FlowLayout;
import java.time.LocalDateTime;
import java.time.Month;
import javax.swing.JLabel;
import javax.swing.JPanel;
import src.transactions.Transaction;

public class IncomePage extends JPanel 
{
	//Static Variables
	
	/*
	 Instance Variables
	*/
	
	//Dimensions
	private static final long serialVersionUID = 1L;
	
	int width;
	int height;
	
	//Time
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
		JPanel body = new JPanel();
		
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

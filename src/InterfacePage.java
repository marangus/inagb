import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//Main page through which the user will access the other pages 
//The other components will include
//- Accounts (for modifying and accessing accounts)
//- Income (for modifying and checking income entries)
//- Expenses (for modifying and checking income entries)
//- Envelopes (for modifying, managing and checking envelopes)
//- AccountTransfer (for modifying and checking account transfers)
//- scheduled payments (for modifying and checking scheduled payments) - optional
//- notes (for modifying and checking notes )

public class InterfacePage extends JPanel 
							implements ActionListener
{
		
	/**
	 * Required constant for JPanel 
	 */
	private static final long serialVersionUID = 1L;

	//Constants
	final Insets buttonInsets  = new Insets(0,0,0,0); 

	//Variables
	int width;
	int height;
	
	//buttons
	JButton accountsButton;
	JButton incomeButton;
	JButton expensesButton;
	JButton envelopesButton;
	JButton accountTransfersButton;
	JButton scheduledPaymentsButton;
	JButton notesButton;
	
	
	public InterfacePage(int width, int height)
	{
		this.width = width;
		this.height = width;
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		this.setPreferredSize(new Dimension(width, height));
		
		//Accounts button
		this.accountsButton = new JButton("Accounts");
		this.accountsButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.insets = buttonInsets;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(accountsButton, gbc);
        this.accountsButton.addActionListener(this);
		
        
        //Income button
		this.incomeButton = new JButton("Income");
		this.incomeButton.setPreferredSize(new Dimension(width/2,height/8));
		gbc.insets = buttonInsets;
		gbc.gridy = 0;
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(incomeButton, gbc);
		this.incomeButton.addActionListener(this);
		
		
		//Expenses Button
		this.expensesButton = new JButton("Expenses");
		this.expensesButton.setPreferredSize(new Dimension(width/2,height/8));
		gbc.insets = buttonInsets;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(expensesButton, gbc);
		this.expensesButton.addActionListener(this);
		
		//Envelopes Button
		this.envelopesButton = new JButton("Envelopes");
		this.envelopesButton.setPreferredSize(new Dimension(width,height/4));
		gbc.insets = buttonInsets;
		gbc.gridy = 2;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(envelopesButton, gbc);
		this.envelopesButton.addActionListener(this);
		
		//Accounts transfer button
		this.accountTransfersButton = new JButton("Account Transfers");
		this.accountTransfersButton.setPreferredSize(new Dimension(width,height/4));
		gbc.insets = buttonInsets;
		gbc.gridy = 3;
		gbc.gridx = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(accountTransfersButton, gbc);
		this.accountTransfersButton.addActionListener(this);
		
		//Notes button
		this.notesButton = new JButton("Notes");
		this.notesButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.gridy = 3;
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(notesButton, gbc);
		this.notesButton.addActionListener(this);
			
		//Scheduled payments button
		/*this.scheduledPaymentsButton = new JButton("Scheduled Payments");
		this.scheduledPaymentsButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.gridy = 4;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.add(scheduledPaymentsButton);*/
				
	}


	//Action Methods
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
        if (action.equals("Accounts")) {
        	System.out.println("Accounts Button Pressed!");
        }
        else if (action.equals("Income")) {
        	System.out.println("Income Button Pressed!");
        }
        else if (action.equals("Expenses")) {
        	System.out.println("Expenses Button Pressed!");
        }
		else if (action.equals("Envelopes")) {
            System.out.println("Envelopes Button Pressed!");
            
            EnvelopePage envelopesPage = new EnvelopePage(1800, 800);  
             
            //set window content
            JFrame mainWindow = (JFrame) SwingUtilities.windowForComponent(this);
        	mainWindow.setContentPane(envelopesPage);
        	mainWindow.validate();
        	mainWindow.repaint();
	        	//mainWindow.add(envelopesPage);
	    	
	        	//Prep window for render
	        	//mainWindow.pack();
	        	//mainWindow.setVisible(true);
        }
        else if (action.equals("Account Transfers")) {
        	System.out.println("Account Transfers Button Pressed!");
        }
        else if (action.equals("Notes")) {
            System.out.println("Notes Button Pressed!");
        }
     }
}
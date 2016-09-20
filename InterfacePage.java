import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfacePage {
	
	public static void main(String args[]){
		//Main Window Frame
		JFrame mainWindow = new JFrame("INAGB");
	
		int width = 1080;
		int height = 1920;
	
		//Button Display Panel
		JPanel buttonContainer = new JPanel();
		buttonContainer.setLayout(new FlowLayout());
		buttonContainer.setPreferredSize(new Dimension(width, height));
	
		//Buttons
		JButton accountsButton = new JButton("Accounts");
		accountsButton.setPreferredSize(new Dimension(width/2,height/4));
		JButton incomeButton = new JButton("Income");
		incomeButton.setPreferredSize(new Dimension(width/2,height/8));
		JButton expensesButton = new JButton("Expenses");
		expensesButton.setPreferredSize(new Dimension(width/2,height/8));
		JButton envelopesButton = new JButton("Envelopes");
		envelopesButton.setPreferredSize(new Dimension(width,height/4));
		JButton accountTransfersButton = new JButton("Account Transfers");
		accountTransfersButton.setPreferredSize(new Dimension(width,height/4));
		JButton scheduledPaymentsButton = new JButton("Scheduled Payments");
		scheduledPaymentsButton.setPreferredSize(new Dimension(width/2,height/4));
		JButton notesButton = new JButton("Notes");
		notesButton.setPreferredSize(new Dimension(width/2,height/4));

		buttonContainer.add(accountsButton);
		buttonContainer.add(incomeButton);
		buttonContainer.add(expensesButton);
		buttonContainer.add(envelopesButton);
		buttonContainer.add(accountTransfersButton);
		buttonContainer.add(scheduledPaymentsButton);
		buttonContainer.add(notesButton);
		
		mainWindow.add(buttonContainer);
		
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.pack();
		mainWindow.setVisible(true);
	}
		
}

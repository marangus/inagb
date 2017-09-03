package src.ui.pages;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
		JPanel buttonContainer = new JPanel(new GridBagLayout());
		buttonContainer.setPreferredSize(new Dimension(width, height));
		
		//Constrain gridbag layout
		GridBagConstraints gbc = new GridBagConstraints();
		/*if (shouldFill) {
            //natural height, maximum width
            gbc.fill = GridBagConstraints.HORIZONTAL;
		}*/
		final Insets buttonInsets  = new Insets(0,0,0,0); 
		
		//Buttons
		
		//Accounts button
		JButton accountsButton = new JButton("Accounts");
		accountsButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.insets = buttonInsets;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 1;
        buttonContainer.add(accountsButton, gbc);
		
        //Income button
		JButton incomeButton = new JButton("Income");
		incomeButton.setPreferredSize(new Dimension(width/2,height/8));
		gbc.insets = buttonInsets;
		gbc.gridy = 0;
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(incomeButton, gbc);
		
		//Expenses Button
		JButton expensesButton = new JButton("Expenses");
		expensesButton.setPreferredSize(new Dimension(width/2,height/8));
		gbc.insets = buttonInsets;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(expensesButton, gbc);
				
		
		//Envelopes Button
		JButton envelopesButton = new JButton("Envelopes");
		envelopesButton.setPreferredSize(new Dimension(width,height/4));
		gbc.insets = buttonInsets;
		gbc.gridy = 2;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(envelopesButton, gbc);		
		
		JButton accountTransfersButton = new JButton("Account Transfers");
		accountTransfersButton.setPreferredSize(new Dimension(width,height/4));
		gbc.insets = buttonInsets;
		gbc.gridy = 3;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(accountTransfersButton);
		
		JButton scheduledPaymentsButton = new JButton("Scheduled Payments");
		scheduledPaymentsButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.gridy = 4;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(scheduledPaymentsButton);
		
		JButton notesButton = new JButton("Notes");
		notesButton.setPreferredSize(new Dimension(width/2,height/4));
		gbc.gridy = 4;
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		buttonContainer.add(notesButton);
		
		//Set content in main window
		mainWindow.setContentPane(buttonContainer);	
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.pack();
		mainWindow.setVisible(true);
	}
		
}

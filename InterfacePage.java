import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfacePage {
	
	//Main Window Frame
	JFrame mainWindow = new JFrame("INAGB");
	
	int width = 1080;
	int height = 1920;
	
	//Button Display Panel
	JPanel buttonContainer = new JPanel();
	buttonContainer.setLayout(new flowLayout());
	container.setpreferredSize(new Dimension(width, height));
	
	//Buttons
	JButton accountsButton = new JButton("Accounts");
	accountsButton.setPreferredSize(new Dimension(width/2,height/4));
	JButton incomeButton = new JButton("Income");
	JButton expensesButton = new JButton("Expenses");
	JButton envelopesButton = new JButton("Envelopes");
	JButton accountTransfersButton = new JButton("Account Transfers");
	JButton scheduledPaymentsButton = new JButton("Scheduled Payments");
	JButton notesButton = new JButton("Notes");

	buttonContainer.add("accountsButton");
	buttonContainer.add("incomeButton");
	buttonContainer.add("expensesButton");
	buttonContainer.add("envelopesButton");
	buttonContainer.add("accountTransfersButton");
	buttonContainer.add("scheduledPaymentsButton");
	buttonContainer.add("notesButton");
	
	buttonContainer.pack();
	
}

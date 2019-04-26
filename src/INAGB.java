import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class INAGB {

	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	// allow user to add account 
	public void addAccount(String name,BigDecimal value){
		Account SavingsAccount = new SavingsAccount(name, 
												value, 
												new BigDecimal(3.5));
		accountList.add(SavingsAccount);
		
	}
           
    public static void main(String args[]){
    	//Main Window Frame
    	
    	//Set window properties
    	JFrame mainWindow = new JFrame("INAGB");
    	JPanel mainInterface = new InterfacePage( 1800, 800 );
    	mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//set window content
    	mainWindow.setContentPane(mainInterface);	
    	
    	//Prep window for render
    	mainWindow.pack();
    	mainWindow.setVisible(true);
    	
    	/**EnvelopePage envelopesPage = new EnvelopePage("Envelopes"); 
		*
		*envelopesPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	*envelopesPage.setTitle("Envelopes");
		*envelopesPage.setSize(1800, 700);
		*
		*envelopesPage.addEnvelope("Archery", 0.00);
		*envelopesPage.addEnvelope("Health", 0.00);		
		*
        *envelopesPage.setVisible(true);
		**/
    }
}

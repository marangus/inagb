package src.program

import javax.swing.JFrame;
import javax.swing.JPanel;

import src.ui.pages.InterfacePage;

public class INAGB {

	// allow user to add account 
	public void addAccount(String name,Money value){
		Account newAccount = new Account();
	}
           
    public static void main(String args[]){
    	//Main Window Frame
    	JFrame mainWindow = new JFrame("INAGB");
    	
    	JPanel mainInterface = new InterfacePage();
    	
    	mainWindow.setContentPane(mainInterface);	
    	mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	mainWindow.pack();
    	mainWindow.setVisible(true);
    }
}

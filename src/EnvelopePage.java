import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class EnvelopePage extends JPanel
							implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9188682506158229868L;
	
	
	ArrayList<Envelope> envelopes = new ArrayList<Envelope>(); 
	ArrayList<Category> categories = new ArrayList<Category>() ;
	ImageIcon icon;
	Image image;
	int width;
	int height;
	
	//buttons
	JButton addEnvelopeButton;
	JButton backButton;
	
	public EnvelopePage(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
		//Add buttons//
		
		//Add Envelope
		this.addEnvelopeButton= new JButton("+");
		this.add(addEnvelopeButton);
		this.addEnvelopeButton.addActionListener(this);
		
		//Back button
		this.backButton = new JButton("Back");
		this.add(this.backButton);
		this.backButton.addActionListener(this);
	}
	
	public void addEnvelope(String name, Double initialAmount) 
	{
		//add default image
		try 
		{
			//Find default icon image
			File imageFile = new File("src/envelope.png");
			Image image = ImageIO.read(imageFile);
			icon = new ImageIcon(image);
			//Set up Envelope and add to page
			Envelope envelope = new Envelope(name, initialAmount, envelopes.size(), 
								icon, Color.gray);
			envelope.setSize(envelope.getImageWidth(), envelope.getImageHeight());
			envelopes.add(envelope);
			categories.add(new Category(name, icon));
			this.add(envelope);
			
			//Add delete button
	        //Add Edit button
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void addEnvelope(String name, Double initialAmount, 
							ImageIcon icon) 
	{
		//Set up Envelope and add to page
        Envelope envelope = new Envelope(name, initialAmount, envelopes.size(), 
        								icon, Color.gray);
        envelope.setSize(envelope.getImageWidth(), envelope.getImageHeight());
        envelopes.add(envelope);
        categories.add(new Category(name, icon));
        //System.out.println(envelopes.size());
        this.add(envelope);
        
        //Add delete button
        //Add Edit button
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
        if (action.equals("+")) {
        	System.out.println("Add Button Pressed!");
        	
        	JDialog dialog = new newEnvelopeProperties(new JFrame(), "Envelope", "Hello World");
        	dialog.setSize(600, 600);
        }
        else if (action.equals("Back")) {
        	System.out.println("Back Button Pressed!");
        	
        	InterfacePage interfacePage = new InterfacePage(1800, 800);  
            
            //set window content
            JFrame mainWindow = (JFrame) SwingUtilities.windowForComponent(this);
        	mainWindow.setContentPane(interfacePage);
        	mainWindow.validate();
        	mainWindow.repaint();
        }
	}
}
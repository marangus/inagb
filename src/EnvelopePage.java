import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class EnvelopePage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9188682506158229868L;
	ArrayList<Envelope> envelopes = new ArrayList<Envelope>(); 
	ArrayList<Category> categories = new ArrayList<Category>() ;
	ImageIcon icon;
	Image image;
	
	public EnvelopePage(String name) {
		super(name);
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
			//System.out.println(envelopes.size());
			this.add(envelope);
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
	}
}
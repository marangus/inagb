import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Envelope extends JPanel
{	

	private static final long serialVersionUID = 1L;
	private Image image;
	private int imageWidth;
	private int imageHeight;
	private Category category;
	private double amount;
	private int index;
	
	public Envelope(String category, double startingValue, 
					int index, ImageIcon icon, Color color) 
	{
		this.index = index;
		try 
		{
			//Find image
			File image2 = new File("src/envelope.png");
			image = ImageIO.read(image2);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
		this.category = new Category(category, icon, color);
		this.amount = startingValue;
	}
	
	public void paintComponent (Graphics g)
	{
		//System.out.println(this.getHeight()*(this.index));
		
		//Draw image o screen
		g.drawImage(image, 5 , 350*(this.index), this);
		
		//draw text
		g.drawString(category.getName(), 75, 75);
		
		//draw amount
		g.drawString(Double.toString(amount), 300, 300);
	}
	
	public int getImageHeight() {
		return this.imageHeight;
	}
	
	public int getImageWidth() {
		return this.imageWidth;
	}
}

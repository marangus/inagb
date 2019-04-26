import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Category {

	String name;
	Image image;
	ImageIcon icon;
	Color color;
	
	public Category(String name) {
		this.name = name;
		try 
		{
			//Find default icon image
			File imageFile = new File("src/envelope.png");
			Image image = ImageIO.read(imageFile);
			this.icon = new ImageIcon(image);
			this.color = Color.gray;
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public Category(String name, ImageIcon icon) {
		this.name = name;
		this.icon = icon;
		this.color = Color.gray;
	}
	
	public Category(String name, ImageIcon icon, Color color) 
	{
		this.name = name;
		this.icon = icon;
		this.color = color;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public ImageIcon getIcon() 
	{
		return this.icon;
	}
	
	public void setIcon( ImageIcon icon ) 
	{
		this.icon= icon;
	}
}

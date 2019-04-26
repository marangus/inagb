import javax.swing.ImageIcon;

public class categoryTest {

	public static void main(String[] args) {
		
		//Create a new category and add an Icon to it
		ImageIcon icon = new ImageIcon("", "A car icon");
		Category newCategory = new Category("New Category", icon);
		
		//write a test to add a new category, along with an icon
		UserAccount userAccount = new UserAccount();
		userAccount.addCategory(newCategory);
	}

}

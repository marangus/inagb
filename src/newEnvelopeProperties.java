import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class newEnvelopeProperties extends JDialog {

	/**
	 *Static variables 
	 */
	private static final long serialVersionUID = 1L;
	
	//Instance variables
	String name;
	Color color;
	ImageIcon icon;
	BigDecimal defaultAmount;
	JButton addBudgetExpense;
	JButton removeBudgetExpense;
	
	
	public newEnvelopeProperties(JFrame parent, String title, String message) 
	{
		super(parent, title);
		
		this.setLayout(new GridBagLayout());
		
		
		//Name
		JPanel nameCardPanel = new JPanel();
		JLabel nameLabel = new JLabel("Envelope Name");
		JTextField nameTextField = new JTextField();
		nameCardPanel.setSize(800, 200);
		nameCardPanel.add(nameLabel);
		nameCardPanel.add(nameTextField);
		
		//Icon
		JPanel iconCardPanel = new JPanel();
		JLabel iconLabel = new JLabel("Icon");
		//IconPicker button
		iconCardPanel.setSize(800, 200);
		iconCardPanel.add(iconLabel);
		
		//Color
		JPanel colorCardPanel = new JPanel();
		JLabel colorLabel = new JLabel("Color");
		JColorChooser colorChooser = new JColorChooser();
		colorCardPanel.setSize(800, 200);
		colorCardPanel.add(colorLabel);
		colorCardPanel.add(colorChooser);
		
		//Add Components
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 1;
		this.add(nameCardPanel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 1;
		this.add(iconCardPanel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 1;
		this.add(colorCardPanel, gbc);
		
		//Show window
		this.validate();
		this.repaint();
		this.pack();
		this.setVisible(true);
	}
	
    public JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action action = new AbstractAction() {
             
            private static final long serialVersionUID = 1L;
 
            public void actionPerformed(ActionEvent e) {
                System.out.println("escaping..");
                setVisible(false);
                dispose();
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", action);
        return rootPane;
    }
 
    class MyActionListener implements ActionListener {
 
        //close and dispose of the window.
        public void actionPerformed(ActionEvent e) {
            System.out.println("disposing the window..");
            setVisible(false);
            dispose();
        }
    }
}

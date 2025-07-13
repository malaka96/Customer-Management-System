import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HomePage extends JPanel{
	JLabel title;
	
	JButton addButton;
	JButton searchButton;
	
	
	HomePage(CardLayout layout, JPanel parentPanel){
		setLayout(new BorderLayout());
		
		JLabel spacer = new JLabel("");
		
		title = new JLabel("Home Page");
		title.setHorizontalAlignment(JLabel.CENTER);
		add("North",title);
		
		JPanel centerPanel = new JPanel(new GridLayout(8,1,1,1));
		
		JPanel addButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		addButton = new JButton("Add Customer");
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				layout.show(parentPanel,"add");
			}
		});
		addButtonPanel.add(addButton);
		
		JPanel searchButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		searchButton = new JButton("Search Customer");
		searchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				layout.show(parentPanel,"search");
			}
		});
		searchButtonPanel.add(searchButton);
		
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		
		centerPanel.add(addButtonPanel);
		centerPanel.add(searchButtonPanel);
		
		add("Center",centerPanel);
		
	}
}

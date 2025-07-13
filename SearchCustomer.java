import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SearchCustomer extends JPanel{
	JLabel title;
	JLabel phoneNum;
	JLabel name;
	JLabel address;
	JLabel email;
	
	
	JTextField searchTf;
	JTextField phoneNumTf;
	JTextField nameTf;
	JTextField addressTf;
	JTextField emailTf;
	
	JButton back;
	JButton searchButton;
	JButton deleteButton;
	
	SearchCustomer(CardLayout layout, JPanel parentPanel){
		setLayout(new BorderLayout());
		
		title = new JLabel("Search Customer");
		title.setHorizontalAlignment(JLabel.CENTER);
		add("North",title);
		
		JPanel centerPanel = new JPanel(new GridLayout(9,1,1,1));
		
		JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		searchTf = new JTextField(20);
		//searchTf.setEditable(false);
		searchButton = new JButton("Search Customer");
		searchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//layout.show(parentPanel,"search");
			}
		});
		searchPanel.add(searchTf);
		searchPanel.add(searchButton);
		
		JPanel phoneNumPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		phoneNum = new JLabel("Phone number");
		phoneNumTf = new JTextField(20);
		phoneNumTf.setEditable(false);
		phoneNumPanel.add(phoneNum);
		phoneNumPanel.add(phoneNumTf);
		
		
		JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		name = new JLabel("Name");
		nameTf = new JTextField(20);
		nameTf.setEditable(false);
		namePanel.add(name);
		namePanel.add(nameTf);
		
		JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		address = new JLabel("Address");
		addressTf = new JTextField(20);
		addressTf.setEditable(false);
		addressPanel.add(address);
		addressPanel.add(addressTf);
		
		JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		email = new JLabel("Email");
		emailTf = new JTextField(20);
		emailTf.setEditable(false);
		emailPanel.add(email);
		emailPanel.add(emailTf);
		
		JPanel deleteButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		deleteButton = new JButton("Delete");
		deleteButton.setEnabled(false);
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//layout.show(parentPanel,"home");
			}
		});
		deleteButtonPanel.add(deleteButton);
		
		JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		back = new JButton("Back");
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				layout.show(parentPanel,"home");
			}
		});
		backButtonPanel.add(back);
		
		centerPanel.add(searchPanel);
		centerPanel.add(phoneNumPanel);
		centerPanel.add(namePanel);
		centerPanel.add(addressPanel);
		centerPanel.add(emailPanel);
		centerPanel.add(deleteButtonPanel);
		centerPanel.add(backButtonPanel);
		
		add("Center",centerPanel);
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddCustomer extends JPanel{
	JLabel title;
	
	JLabel phoneNum;
	JLabel name;
	JLabel address;
	JLabel email;
	
	JButton back;
	JButton addButton;
	
	JTextField phoneNumTf;
	JTextField nameTf;
	JTextField addressTf;
	JTextField emailTf;
	
	CustomerCollection collection;
	
	String phoneStr;
	String nameStr;
	String addressStr;
	String emailStr;
	
	AddCustomer(CardLayout layout, JPanel parentPanel, CustomerCollection collection){
		this.collection = collection;
		
		setLayout(new BorderLayout());
		
		JLabel spacer = new JLabel("");
		
		title = new JLabel("Add Customer");
		title.setHorizontalAlignment(JLabel.CENTER);
		add("North",title);
		
		JPanel centerPanel = new JPanel(new GridLayout(9,1,1,1));
		
		JPanel phoneNumPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		phoneNum = new JLabel("Phone number");
		phoneNumTf = new JTextField(20);
		phoneNumPanel.add(phoneNum);
		phoneNumPanel.add(phoneNumTf);
		
		
		JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		name = new JLabel("Name");
		nameTf = new JTextField(20);
		namePanel.add(name);
		namePanel.add(nameTf);
		
		JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		address = new JLabel("Address");
		addressTf = new JTextField(20);
		addressPanel.add(address);
		addressPanel.add(addressTf);
		
		JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		email = new JLabel("Email");
		emailTf = new JTextField(20);
		emailPanel.add(email);
		emailPanel.add(emailTf);
		
		JPanel addButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		addButton = new JButton("Add Customer");
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("add button is pressed");
				Customer data = new Customer(phoneNumTf.getText(),nameTf.getText(),addressTf.getText(),emailTf.getText());
				collection.add(data);
			}
		});
		addButtonPanel.add(addButton);
		
		JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		back = new JButton("Back");
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				layout.show(parentPanel,"home");
			}
		});
		backButtonPanel.add(back);
		
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(spacer);
		centerPanel.add(phoneNumPanel);
		centerPanel.add(namePanel);
		centerPanel.add(addressPanel);
		centerPanel.add(emailPanel);
		centerPanel.add(addButtonPanel);
		centerPanel.add(backButtonPanel);
		
		add("Center",centerPanel);
		
	}
}

import javax.swing.*;
import java.awt.*;

class CustomerManagement{
	public static void main(String[] args){
		System.out.println("yello, world");
		
		JFrame frame = new JFrame("Customer Management System");
		frame.setSize(500,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CardLayout layout = new CardLayout();
		JPanel panel = new JPanel(layout);
		
		CustomerCollection collection = new CustomerCollection();
		
		panel.add(new HomePage(layout,panel),"home");
		panel.add(new AddCustomer(layout,panel,collection),"add");
		panel.add(new SearchCustomer(layout,panel),"search");
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
}

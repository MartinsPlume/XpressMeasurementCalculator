package xpress_calculator_1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;


public class Print_Screen extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_Customer_Number;
	private JTextField textFieldShipperCountry;
	private JTextField textFieldCustomer_Name;
	private JTextField textField_Volume;
	private JTextField textField_Weight;
	private JTextField textField_Billing;



	public Print_Screen(String volume, String weight, String billing_weight) {
		
		setTitle("Print Quote");
				
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {175, 0, 125, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblEnterCustomerName = new JLabel("Enter Customer Name");
			lblEnterCustomerName.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterCustomerName.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_lblEnterCustomerName = new GridBagConstraints();
			gbc_lblEnterCustomerName.anchor = GridBagConstraints.EAST;
			gbc_lblEnterCustomerName.insets = new Insets(0, 0, 5, 5);
			gbc_lblEnterCustomerName.gridx = 0;
			gbc_lblEnterCustomerName.gridy = 0;
			contentPanel.add(lblEnterCustomerName, gbc_lblEnterCustomerName);
		}
		{
			textFieldCustomer_Name = new JTextField();
			textFieldCustomer_Name.setFont(new Font("Arial", Font.PLAIN, 12));
			textFieldCustomer_Name.setColumns(10);
			GridBagConstraints gbc_textFieldCustomer_Name = new GridBagConstraints();
			gbc_textFieldCustomer_Name.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldCustomer_Name.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldCustomer_Name.gridx = 2;
			gbc_textFieldCustomer_Name.gridy = 0;
			contentPanel.add(textFieldCustomer_Name, gbc_textFieldCustomer_Name);
		}
		{
			JLabel lblEnterCustomerNumber = new JLabel("Enter Customer Number");
			lblEnterCustomerNumber.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterCustomerNumber.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_lblEnterCustomerNumber = new GridBagConstraints();
			gbc_lblEnterCustomerNumber.anchor = GridBagConstraints.EAST;
			gbc_lblEnterCustomerNumber.insets = new Insets(0, 0, 5, 5);
			gbc_lblEnterCustomerNumber.gridx = 0;
			gbc_lblEnterCustomerNumber.gridy = 1;
			contentPanel.add(lblEnterCustomerNumber, gbc_lblEnterCustomerNumber);
		}
		{
			textField_Customer_Number = new JTextField();
			textField_Customer_Number.setFont(new Font("Arial", Font.PLAIN, 12));
			textField_Customer_Number.setColumns(10);
			GridBagConstraints gbc_textField_Customer_Number = new GridBagConstraints();
			gbc_textField_Customer_Number.insets = new Insets(0, 0, 5, 5);
			gbc_textField_Customer_Number.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_Customer_Number.gridx = 2;
			gbc_textField_Customer_Number.gridy = 1;
			contentPanel.add(textField_Customer_Number, gbc_textField_Customer_Number);
		}
		{
			JLabel lblEnterShipperCountry = new JLabel("Enter Country");
			lblEnterShipperCountry.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterShipperCountry.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_lblEnterShipperCountry = new GridBagConstraints();
			gbc_lblEnterShipperCountry.anchor = GridBagConstraints.EAST;
			gbc_lblEnterShipperCountry.insets = new Insets(0, 0, 5, 5);
			gbc_lblEnterShipperCountry.gridx = 0;
			gbc_lblEnterShipperCountry.gridy = 2;
			contentPanel.add(lblEnterShipperCountry, gbc_lblEnterShipperCountry);
		}
		{
			textFieldShipperCountry = new JTextField();
			textFieldShipperCountry.setFont(new Font("Arial", Font.PLAIN, 12));
			textFieldShipperCountry.setColumns(10);
			GridBagConstraints gbc_textFieldShipperCountry = new GridBagConstraints();
			gbc_textFieldShipperCountry.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldShipperCountry.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldShipperCountry.gridx = 2;
			gbc_textFieldShipperCountry.gridy = 2;
			contentPanel.add(textFieldShipperCountry, gbc_textFieldShipperCountry);
		}
		{
			JLabel lblVolume = new JLabel("Shipment Volume");
			lblVolume.setHorizontalAlignment(SwingConstants.CENTER);
			lblVolume.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_lblVolume = new GridBagConstraints();
			gbc_lblVolume.anchor = GridBagConstraints.EAST;
			gbc_lblVolume.insets = new Insets(0, 0, 5, 5);
			gbc_lblVolume.gridx = 0;
			gbc_lblVolume.gridy = 3;
			contentPanel.add(lblVolume, gbc_lblVolume);
		}
		{
			textField_Volume = new JTextField();
			textField_Volume.setFont(new Font("Arial", Font.PLAIN, 12));
			textField_Volume.setColumns(10);
			GridBagConstraints gbc_textField_Volume = new GridBagConstraints();
			gbc_textField_Volume.insets = new Insets(0, 0, 5, 5);
			gbc_textField_Volume.gridx = 2;
			gbc_textField_Volume.gridy = 3;
			textField_Volume.setText(volume);
			contentPanel.add(textField_Volume, gbc_textField_Volume);
		}
		{
			JLabel labelWeight = new JLabel("Shipment Weight");
			labelWeight.setHorizontalAlignment(SwingConstants.CENTER);
			labelWeight.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_labelWeight = new GridBagConstraints();
			gbc_labelWeight.anchor = GridBagConstraints.EAST;
			gbc_labelWeight.insets = new Insets(0, 0, 5, 5);
			gbc_labelWeight.gridx = 0;
			gbc_labelWeight.gridy = 4;
			contentPanel.add(labelWeight, gbc_labelWeight);
		}
		{
			textField_Weight = new JTextField();
			textField_Weight.setFont(new Font("Arial", Font.PLAIN, 12));
			textField_Weight.setColumns(10);
			GridBagConstraints gbc_textField_Weight = new GridBagConstraints();
			gbc_textField_Weight.insets = new Insets(0, 0, 5, 5);
			gbc_textField_Weight.gridx = 2;
			gbc_textField_Weight.gridy = 4;
			textField_Weight.setText(weight);
			contentPanel.add(textField_Weight, gbc_textField_Weight);
		}
		{
			JLabel lblShipmentBilling = new JLabel("Shipment Billing");
			lblShipmentBilling.setHorizontalAlignment(SwingConstants.CENTER);
			lblShipmentBilling.setFont(new Font("Arial", Font.PLAIN, 14));
			GridBagConstraints gbc_lblShipmentBilling = new GridBagConstraints();
			gbc_lblShipmentBilling.anchor = GridBagConstraints.EAST;
			gbc_lblShipmentBilling.insets = new Insets(0, 0, 5, 5);
			gbc_lblShipmentBilling.gridx = 0;
			gbc_lblShipmentBilling.gridy = 5;
			contentPanel.add(lblShipmentBilling, gbc_lblShipmentBilling);
		}
		{
			textField_Billing = new JTextField();
			textField_Billing.setFont(new Font("Arial", Font.PLAIN, 12));
			textField_Billing.setColumns(10);
			GridBagConstraints gbc_textField_Billing = new GridBagConstraints();
			gbc_textField_Billing.insets = new Insets(0, 0, 5, 5);
			gbc_textField_Billing.gridx = 2;
			gbc_textField_Billing.gridy = 5;
			textField_Billing.setText(billing_weight);
			contentPanel.add(textField_Billing, gbc_textField_Billing);
		}
		{
			JLabel lbl_PRINT = new JLabel();
			lbl_PRINT.setFont(new Font("Arial", Font.PLAIN, 12));
			GridBagConstraints gbc_lbl_PRINT = new GridBagConstraints();
			gbc_lbl_PRINT.insets = new Insets(0, 0, 5, 5);
			gbc_lbl_PRINT.gridx = 2;
			gbc_lbl_PRINT.gridy = 8;
			contentPanel.add(lbl_PRINT, gbc_lbl_PRINT);
		}
		{
			JButton okButton = new JButton("PRINT");
			GridBagConstraints gbc_okButton = new GridBagConstraints();
			gbc_okButton.insets = new Insets(0, 0, 5, 0);
			gbc_okButton.gridwidth = 3;
			gbc_okButton.gridheight = 2;
			gbc_okButton.fill = GridBagConstraints.HORIZONTAL;
			gbc_okButton.gridx = 1;
			gbc_okButton.gridy = 9;
			contentPanel.add(okButton, gbc_okButton);
			okButton.setEnabled(true);
			okButton.setFont(new Font("Arial", Font.BOLD, 18));
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					try {
					    String filename = textFieldCustomer_Name.getText()+".csv";
					    FileWriter writer = new FileWriter(filename);
					    textFieldCustomer_Name.write(writer);
					    writer.write(",");
					    textField_Customer_Number.write(writer);
					    writer.write(",");
					    textFieldShipperCountry.write(writer);
					    writer.write(",");
					    textField_Volume.write(writer);
					    writer.write(",");
					    textField_Weight.write(writer);
					    writer.write(",");
					    textField_Billing.write(writer);
					    writer.close();
					    JOptionPane.showMessageDialog(null, String.format("Offer printed!"));
					}catch(Exception missing) {
						JOptionPane.showMessageDialog(null, String.format("Fill out all the fields!"));
					}
				}
			});
		}
		

	}

}

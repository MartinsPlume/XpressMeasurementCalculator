package xpress_calculator_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;

public class Main_screen_frame extends JFrame {
	
	// Izveido pamatpaneïa komponentes
	
	private JPanel contentPane;
	private JLabel lblDSVlogo = new JLabel(new ImageIcon("DSV.png"));;
	private final ButtonGroup buttonGroup_service = new ButtonGroup();
	JRadioButton rdbtnExpress = new JRadioButton("Express");
	JRadioButton rdbtnNewEconomy = new JRadioButton("Economy");
	JRadioButton rdbtnlbs = new JRadioButton("Imperial");
	JRadioButton rdbtnkg = new JRadioButton("Metric");
	private final JMenuBar menuBar = new JMenuBar();
	private final JLabel lbl_DSV = new JLabel("DSV Xpress");
	
	
	private final JButton btnClear = new JButton("Clear");
	private final JButton btnPrint = new JButton("Print");
	private final JPanel Main_panel = new JPanel();
	private final JLabel lblCount = new JLabel("Count");
	private JLabel lblLength = new JLabel("Length (cm)");
	private JLabel lblWidth = new JLabel("Width (cm)");
	private JLabel lblHeight = new JLabel("Height (cm)");
	private JLabel lblWeight = new JLabel("Weight (kg)");
	
	private final ButtonGroup buttonGroup_units = new ButtonGroup();
	
	// izveido masîvus ar pamatpaneïa komponentiem
	
	private final JLabel[] lbl_pos = new JLabel[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 lbl_pos[i] = new JLabel(String.valueOf(i+1));
		 }
		}
	
	private final JTextField[] textField_Count = new JTextField[10];{
	 for (int i = 0; i < 10; i++)
	 {
		 textField_Count[i] = new JTextField();
		 textField_Count[i].setText("0");
	 }
	}
	
	private final JTextField[] textField_Length = new JTextField[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 textField_Length[i] = new JTextField();
			 textField_Length[i].setText("0");
		 }
		}
	
	private final JTextField[] textField_Width = new JTextField[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 textField_Width[i] = new JTextField();
			 textField_Width[i].setText("0");
		 }
		}
	
	private final JTextField[] textField_Height = new JTextField[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 textField_Height[i] = new JTextField();
			 textField_Height[i].setText("0");
		 }
		}
	
	private final JTextField[] textField_Weight = new JTextField[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 textField_Weight[i] = new JTextField();
			 textField_Weight[i].setText("0");
		 }
		}
	
	private final JLabel[] lbl_LineVOLUME = new JLabel[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 lbl_LineVOLUME[i] = new JLabel();
		 }
		}
	private final JLabel[] lbl_LineWEIGHT = new JLabel[10];{
		 for (int i = 0; i < 10; i++)
		 {
			 lbl_LineWEIGHT[i] = new JLabel();
		 }
		}
   
	
	private final JLabel lblTotalLineWeight = new JLabel("Line Weight (kg)");
	private final JLabel lblTotalLineVolume = new JLabel("Line Volume (m3)");
		
	private final JLabel lblTotalVolumeMarker = new JLabel("Total Volume");
	private final JLabel lblTotalWeightMarker = new JLabel("Total Weight");
	private final JLabel lblTotalBillingWeightMarker = new JLabel("Total Billing Weight");
	
	private final JLabel label_Total_Volume = new JLabel();
	private final JLabel label_Total_Weight = new JLabel();
	private final JLabel label_Total_Billing = new JLabel();
	
	private final JPanel data_Panel = new JPanel();
	
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmNew = new JMenuItem("New");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	
	// main palaiþ pamatlogu un uzstâda nemainâmu izmçru
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_screen_frame main_frame = new Main_screen_frame();
					main_frame.setVisible(true);
					main_frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main_screen_frame() {
		setTitle("Xpress Calculator");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// uzstâda paneïa izmçru
		setBounds(100, 100, 1000, 400);
		
		// izvçlnes paneïa izveide
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		
		// izveido jaunu logu
		
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					Main_screen_frame main_frame = new Main_screen_frame();
					main_frame.setVisible(true);
					main_frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// izslçgðanas poga panelî
		
		mnFile.add(mntmNew);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Menu_panel = new JPanel();
		contentPane.add(Menu_panel, BorderLayout.WEST);
		Menu_panel.setLayout(new GridLayout(5, 2, 2, 2));
		
		Menu_panel.add(lblDSVlogo);
		lbl_DSV.setForeground(new Color(0, 0, 128));
		lbl_DSV.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_DSV.setFont(new Font("Arial", Font.BOLD, 16));
		
		Menu_panel.add(lbl_DSV);
		
		// radio button izveide priekð mçrvienîbâm un servisa
		
		rdbtnExpress.setForeground(new Color(0, 0, 128));
		rdbtnExpress.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnExpress.setHorizontalAlignment(SwingConstants.CENTER);
		Menu_panel.add(rdbtnExpress);
		rdbtnExpress.setSelected(true);
		
		rdbtnNewEconomy.setForeground(new Color(0, 0, 128));
		rdbtnNewEconomy.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewEconomy.setHorizontalAlignment(SwingConstants.CENTER);
		Menu_panel.add(rdbtnNewEconomy);
		buttonGroup_units.add(rdbtnkg);
		
		rdbtnkg.setForeground(new Color(0, 0, 128));
		rdbtnkg.setFont(new Font("Arial", Font.PLAIN, 14));
		
		rdbtnkg.setHorizontalAlignment(SwingConstants.CENTER);
		
		Menu_panel.add(rdbtnkg);
		rdbtnkg.setSelected(true);
		
		buttonGroup_units.add(rdbtnlbs);
		rdbtnlbs.setForeground(new Color(0, 0, 128));
		rdbtnlbs.setFont(new Font("Arial", Font.PLAIN, 14));
		
		rdbtnlbs.setHorizontalAlignment(SwingConstants.CENTER);
		Menu_panel.add(rdbtnlbs);
		 
		//izveido un pievieno clear un print pogas
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int clear_Cycle=0; clear_Cycle<10; clear_Cycle++) {
					textField_Count[clear_Cycle].setText("0");
					textField_Length[clear_Cycle].setText("0");
					textField_Width[clear_Cycle].setText("0");
					textField_Height[clear_Cycle].setText("0");
					textField_Weight[clear_Cycle].setText("0");
					lbl_LineVOLUME[clear_Cycle].setText("0");
					lbl_LineWEIGHT[clear_Cycle].setText("0");
				}
				label_Total_Volume.setText("0");
				label_Total_Weight.setText("0");
				label_Total_Billing.setText("0");
			}
		});
		Menu_panel.add(btnClear);
		btnClear.setFont(new Font("Arial", Font.BOLD, 18));
		btnClear.setBackground(new Color(0, 191, 255));
		Menu_panel.add(btnPrint);
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.setBackground(new Color(0, 0, 128));
		btnPrint.setFont(new Font("Arial", Font.BOLD, 18));
		Main_panel.setBackground(Color.WHITE);
		
		// pamatpaneïa izveide
		
		contentPane.add(Main_panel, BorderLayout.CENTER);
		GridBagLayout gbl_Main_panel = new GridBagLayout();
		
		// GridBagLayout izmçru izveide kolonnâm un rindâm
		
		gbl_Main_panel.columnWidths = new int[] {30, 50, 20, 100, 100, 100, 20, 100, 20, 100, 100, 25};
		gbl_Main_panel.rowHeights = new int[]{17, 19, 22, 19, 19, 19, 19, 19, 19, 19, 19, 0};
		gbl_Main_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Main_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		// panelim pievieno virsrakstus
		Main_panel.setLayout(gbl_Main_panel);
				lblCount.setForeground(new Color(0, 0, 128));
				lblCount.setHorizontalAlignment(SwingConstants.CENTER);
				lblCount.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblCount = new GridBagConstraints();
				gbc_lblCount.insets = new Insets(0, 0, 5, 5);
				gbc_lblCount.gridx = 1;
				gbc_lblCount.gridy = 0;
				Main_panel.add(lblCount, gbc_lblCount);
				lblLength.setForeground(new Color(0, 0, 128));
				
				lblLength.setHorizontalAlignment(SwingConstants.CENTER);
				lblLength.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblLength = new GridBagConstraints();
				gbc_lblLength.insets = new Insets(0, 0, 5, 5);
				gbc_lblLength.gridx = 3;
				gbc_lblLength.gridy = 0;
				Main_panel.add(lblLength, gbc_lblLength);
				lblWidth.setForeground(new Color(0, 0, 128));
				
				lblWidth.setHorizontalAlignment(SwingConstants.CENTER);
				lblWidth.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblWidth = new GridBagConstraints();
				gbc_lblWidth.anchor = GridBagConstraints.NORTH;
				gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
				gbc_lblWidth.gridx = 4;
				gbc_lblWidth.gridy = 0;
				Main_panel.add(lblWidth, gbc_lblWidth);
				lblHeight.setForeground(new Color(0, 0, 128));
				lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
				lblHeight.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblHeight = new GridBagConstraints();
				gbc_lblHeight.anchor = GridBagConstraints.NORTH;
				gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
				gbc_lblHeight.gridx = 5;
				gbc_lblHeight.gridy = 0;
				Main_panel.add(lblHeight, gbc_lblHeight);
				lblWeight.setForeground(new Color(0, 0, 128));
				lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
				lblWeight.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblWeight = new GridBagConstraints();
				gbc_lblWeight.anchor = GridBagConstraints.NORTH;
				gbc_lblWeight.insets = new Insets(0, 0, 5, 5);
				gbc_lblWeight.gridx = 7;
				gbc_lblWeight.gridy = 0;
				Main_panel.add(lblWeight, gbc_lblWeight);
				lblTotalLineVolume.setForeground(new Color(0, 0, 128));
				lblTotalLineVolume.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotalLineVolume.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblTotalLineVolume = new GridBagConstraints();
				gbc_lblTotalLineVolume.anchor = GridBagConstraints.NORTH;
				gbc_lblTotalLineVolume.insets = new Insets(0, 0, 5, 5);
				gbc_lblTotalLineVolume.gridx = 9;
				gbc_lblTotalLineVolume.gridy = 0;
				Main_panel.add(lblTotalLineVolume, gbc_lblTotalLineVolume);
				lblTotalLineWeight.setForeground(new Color(0, 0, 128));
				lblTotalLineWeight.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotalLineWeight.setFont(new Font("Arial", Font.BOLD, 14));
				
				GridBagConstraints gbc_lblTotalLineWeight = new GridBagConstraints();
				gbc_lblTotalLineWeight.anchor = GridBagConstraints.NORTH;
				gbc_lblTotalLineWeight.insets = new Insets(0, 0, 5, 0);
				gbc_lblTotalLineWeight.gridx = 10;
				gbc_lblTotalLineWeight.gridy = 0;
				Main_panel.add(lblTotalLineWeight, gbc_lblTotalLineWeight);
				
				/*	ar for cikliem pievieno izmantojamos JTextField
				 *   un JLabel, kas tiks izmantoti vçrtîbu ierakstîðanai un izvadîðanai
				 */
				
				for (int labels_Position=0; labels_Position<10;labels_Position++) {
					lbl_pos[labels_Position].setForeground(new Color(0, 0, 128));
					lbl_pos[labels_Position].setFont(new Font("Arial", Font.BOLD, 14));
					GridBagConstraints gbc_lbl = new GridBagConstraints();
					gbc_lbl.insets = new Insets(0, 0, 5, 5);
					gbc_lbl.gridx = 0;
					gbc_lbl.gridy = labels_Position+1;
					Main_panel.add(lbl_pos[labels_Position], gbc_lbl);
				}
				
				for(int count_Fields = 0; count_Fields<10; count_Fields++) {
					
					textField_Count[count_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					textField_Count[count_Fields].setFont(new Font("Arial", Font.PLAIN, 10));
					textField_Count[count_Fields].setColumns(2);
					
					GridBagConstraints gbc_textField_Count = new GridBagConstraints();
					gbc_textField_Count.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Count.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Count.gridx = 1;
					gbc_textField_Count.gridy = count_Fields+1;
					Main_panel.add(textField_Count[count_Fields], gbc_textField_Count);	
				}
				
				for(int length_Fields = 0; length_Fields<10; length_Fields++) {
					
					textField_Length[length_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					textField_Length[length_Fields].setFont(new Font("Arial", Font.PLAIN, 10));
					textField_Length[length_Fields].setColumns(2);
					
					GridBagConstraints gbc_textField_Length = new GridBagConstraints();
					gbc_textField_Length.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Length.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Length.gridx = 3;
					gbc_textField_Length.gridy = length_Fields+1;
					Main_panel.add(textField_Length[length_Fields], gbc_textField_Length);
				}
				
				for(int width_Fields = 0; width_Fields<10; width_Fields++) {
					
					textField_Width[width_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					textField_Width[width_Fields].setFont(new Font("Arial", Font.PLAIN, 10));
					textField_Width[width_Fields].setColumns(2);
					
					GridBagConstraints gbc_textField_Width = new GridBagConstraints();
					gbc_textField_Width.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Width.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Width.gridx = 4;
					gbc_textField_Width.gridy = width_Fields+1;
					Main_panel.add(textField_Width[width_Fields], gbc_textField_Width);
				}
		
				for(int height_Fields = 0; height_Fields<10; height_Fields++) {
					textField_Height[height_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					textField_Height[height_Fields].setFont(new Font("Arial", Font.PLAIN, 10));
					textField_Height[height_Fields].setColumns(10);
				
					GridBagConstraints gbc_textField_Height = new GridBagConstraints();
					gbc_textField_Height.anchor = GridBagConstraints.NORTH;
					gbc_textField_Height.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Height.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Height.gridx = 5;
					gbc_textField_Height.gridy = height_Fields+1;
					Main_panel.add(textField_Height[height_Fields], gbc_textField_Height);
				}
		
				for(int weight_Fields = 0; weight_Fields<10; weight_Fields++) {
					textField_Weight[weight_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					textField_Weight[weight_Fields].setFont(new Font("Arial", Font.PLAIN, 10));
					textField_Weight[weight_Fields].setColumns(10);
				
					GridBagConstraints gbc_textField_Weight = new GridBagConstraints();
					gbc_textField_Weight.anchor = GridBagConstraints.NORTH;
					gbc_textField_Weight.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Weight.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Weight.gridx = 7;
					gbc_textField_Weight.gridy = weight_Fields+1;
					Main_panel.add(textField_Weight[weight_Fields], gbc_textField_Weight);
				}
		
				for (int volume_Fields=0; volume_Fields<10;volume_Fields++) {
					lbl_LineVOLUME[volume_Fields].setFont(new Font("Arial", Font.PLAIN, 12));
					lbl_LineVOLUME[volume_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					GridBagConstraints gbc_label_Volume = new GridBagConstraints();
					gbc_label_Volume.insets = new Insets(0, 0, 5, 5);
					gbc_label_Volume.gridx = 9;
					gbc_label_Volume.gridy = volume_Fields+1;
					Main_panel.add(lbl_LineVOLUME[volume_Fields], gbc_label_Volume);
				}
		
				for(int weight_Fields=0; weight_Fields<10;weight_Fields++) {
					lbl_LineWEIGHT[weight_Fields].setFont(new Font("Arial", Font.PLAIN, 12));
					lbl_LineWEIGHT[weight_Fields].setHorizontalAlignment(SwingConstants.CENTER);
					GridBagConstraints gbc_label_Weight = new GridBagConstraints();
					gbc_label_Weight.insets = new Insets(0, 0, 5, 5);
					gbc_label_Weight.gridx = 10;
					gbc_label_Weight.gridy = weight_Fields+1;
					Main_panel.add(lbl_LineWEIGHT[weight_Fields], gbc_label_Weight);
				}
				
	// apakðâ pievieno datu paneli un komponentes tam

		getContentPane().add(data_Panel, BorderLayout.SOUTH);
		data_Panel.setLayout(new GridLayout(0, 3, 0, 0));
		data_Panel.add(lblTotalVolumeMarker);
		lblTotalVolumeMarker.setForeground(new Color(0, 0, 128));
		lblTotalVolumeMarker.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalVolumeMarker.setFont(new Font("Arial", Font.BOLD, 16));
		data_Panel.add(lblTotalWeightMarker);
		lblTotalWeightMarker.setForeground(new Color(0, 0, 128));
		lblTotalWeightMarker.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalWeightMarker.setFont(new Font("Arial", Font.BOLD, 16));
		data_Panel.add(lblTotalBillingWeightMarker);
		lblTotalBillingWeightMarker.setForeground(new Color(0, 0, 128));
		lblTotalBillingWeightMarker.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalBillingWeightMarker.setFont(new Font("Arial", Font.BOLD, 16));
		data_Panel.add(label_Total_Volume);
		label_Total_Volume.setForeground(new Color(0, 0, 128));
		label_Total_Volume.setHorizontalAlignment(SwingConstants.CENTER);
		label_Total_Volume.setFont(new Font("Arial", Font.BOLD, 18));
		data_Panel.add(label_Total_Weight);
		label_Total_Weight.setForeground(new Color(0, 0, 128));
		label_Total_Weight.setHorizontalAlignment(SwingConstants.CENTER);
		label_Total_Weight.setFont(new Font("Arial", Font.BOLD, 18));
		data_Panel.add(label_Total_Billing);
		label_Total_Billing.setForeground(new Color(0, 0, 128));
		label_Total_Billing.setHorizontalAlignment(SwingConstants.CENTER);
		label_Total_Billing.setFont(new Font("Arial", Font.BOLD, 18));
		
		/*
		 * ar for ciklu pievieno focus listeners, katram izmantojamajam Textfield
		 * Katrs focus listeners atjauno visus Labels, katru reizi kad pazûd un parâdas focus
		 */
		
		for (int count_Listener=0; count_Listener<10;count_Listener++) {
			
			final Integer inner_Listener = new Integer(count_Listener);
			
			textField_Count[inner_Listener].addFocusListener(new HandlerClass(){
				
			public void focusGained(FocusEvent event) {
				
				// iemaríç lauku uz kura ir noklikðíina
			
				textField_Count[inner_Listener].selectAll();
				// uzstâda formâtu
				DecimalFormat df = new DecimalFormat("##.###");
				// lauku aprçíinâðana
				try{	
					if (rdbtnkg.isSelected()) { //  ja kg izvçlçti izsauc parasto metodi
					lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume(
							Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
							Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight(
									Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					else if(rdbtnlbs.isSelected()) { //  ja lbs izvçlçti izsauc imperial metodi
						lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume_Imperial(
								Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format((Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", ".")))))));
					}
					double total_volume=0;
					double total_weight=0;
					
					for (int total_counter=0; total_counter<10;total_counter++) { // aprçíina kopçjo
						try {
							if (rdbtnkg.isSelected()) {
							total_volume+=Line_Volume(
									Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							total_weight+=Line_Weight(
									Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							} else if(rdbtnlbs.isSelected()) {
								total_volume+=Line_Volume_Imperial(
										Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
								total_weight+=Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
						}
						catch(Exception empty) {
						}
						label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
						label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
						if (rdbtnNewEconomy.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*250, total_weight))));
						}else if(rdbtnExpress.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*200, total_weight))));
						}
							
					}
					
				} catch (NumberFormatException nfe) {
					if (textField_Count[inner_Listener].getText().equals(null)){ // ja lietotâjs izdzçð ieliek nulli
						textField_Count[inner_Listener].setText("0");
				}else {
					textField_Count[inner_Listener].setText("0"); // lietotâjs ievadîjis nepareizu vçrtîbu
						JOptionPane.showMessageDialog(null, String.format("Enter whole number for parcel count!"));
					}
				}
			}
			
			public void focusLost(FocusEvent event) {
				try{
					focusGained(event);
				

				} catch (NumberFormatException nfe) {
					if (textField_Count[inner_Listener].getText().equals(null)){
						textField_Count[inner_Listener].setText("0");
				}else {
					textField_Count[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter whole number for parcel count!"));
					}
				}
			}
			});
		}
			
			
		for (int length_Listener=0; length_Listener<10;length_Listener++) {
			final Integer inner_Listener = new Integer(length_Listener);

			textField_Length[inner_Listener].addFocusListener(new HandlerClass(){
				
			public void focusGained(FocusEvent event) {
				textField_Length[inner_Listener].selectAll();
				DecimalFormat df = new DecimalFormat("##.###");
				try{	
					if (rdbtnkg.isSelected()) {
					lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume(
							Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
							Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight(
									Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					else if(rdbtnlbs.isSelected()) {
						lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume_Imperial(
								Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					double total_volume=0;
					double total_weight=0;
					
					for (int total_counter=0; total_counter<10;total_counter++) {
						try {
							if (rdbtnkg.isSelected()) {
							total_volume+=Line_Volume(
									Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							total_weight+=Line_Weight(
									Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							} else if(rdbtnlbs.isSelected()) {
								total_volume+=Line_Volume_Imperial(
										Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
								total_weight+=Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
						}
						catch(Exception empty) {
						}
						label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
						label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
						if (rdbtnNewEconomy.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*250, total_weight))));
						}else if(rdbtnExpress.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*200, total_weight))));
						}
					}

				} catch (NumberFormatException nfe) {
					if (textField_Length[inner_Listener].getText().equals(null)){
						textField_Length[inner_Listener].setText("0");
				}else {
					textField_Length[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a number for parcel Length!"));
					}
				}
			}
			public void focusLost(FocusEvent event) {
				try{
					focusGained(event);
				} catch (NumberFormatException nfe) {
					if (textField_Length[inner_Listener].getText().equals(null)){
						textField_Length[inner_Listener].setText("0");
				}else {
					textField_Length[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a number for parcel Length!"));
					}
				}
			}
		});
		}
		
		for (int width_Listener=0; width_Listener<10;width_Listener++) {
			final Integer inner_Listener = new Integer(width_Listener);

			textField_Width[inner_Listener].addFocusListener(new HandlerClass(){
				
			public void focusGained(FocusEvent event) {
				DecimalFormat df = new DecimalFormat("##.###");
				textField_Width[inner_Listener].selectAll();
				try{	
					if (rdbtnkg.isSelected()) {
					lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume(
							Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
							Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(Line_Weight(
									Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", ".")))));
					}
					else if(rdbtnlbs.isSelected()) {
						lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume_Imperial(
								Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", ".")))));
					}
					double total_volume=0;
					double total_weight=0;
					
					for (int total_counter=0; total_counter<10;total_counter++) {
						try {
							if (rdbtnkg.isSelected()) {
							total_volume+=Line_Volume(
									Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							total_weight+=Line_Weight(
									Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							} else if(rdbtnlbs.isSelected()) {
								total_volume+=Line_Volume_Imperial(
										Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
								total_weight+=Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
						}
						catch(Exception empty) {
						}
						label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
						label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
						if (rdbtnNewEconomy.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*250, total_weight))));
						}else if(rdbtnExpress.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*200, total_weight))));
						}
					}
						
				} catch (NumberFormatException nfe) {
					if (textField_Width[inner_Listener].getText().equals(null)){
						textField_Width[inner_Listener].setText("0");
				}else {
					textField_Width[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a  number for parcel Width!"));
					}
				}
			}
			public void focusLost(FocusEvent event) {
				try{
					focusGained(event);
				} catch (NumberFormatException nfe) {
					if (textField_Width[inner_Listener].getText().equals(null)){
						textField_Width[inner_Listener].setText("0");
				}else {
					textField_Width[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a number for parcel Width!"));
					}
				}
			}
		});
		}
		
		for (int height_Listener=0; height_Listener<10;height_Listener++) {
			final Integer inner_Listener = new Integer(height_Listener);
			
			textField_Height[inner_Listener].addFocusListener(new HandlerClass(){
				
			public void focusGained(FocusEvent event) {
				DecimalFormat df = new DecimalFormat("##.###");
				textField_Height[inner_Listener].selectAll();
				try{	
					if (rdbtnkg.isSelected()) {
					lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume(
							Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
							Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight(
									Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					else if(rdbtnlbs.isSelected()) {
						lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume_Imperial(
								Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", ".")))));
					}
					double total_volume=0;
					double total_weight=0;
					
					for (int total_counter=0; total_counter<10;total_counter++) {
						try {
							if (rdbtnkg.isSelected()) {
							total_volume+=Line_Volume(
									Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							total_weight+=Line_Weight(
									Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							} else if(rdbtnlbs.isSelected()) {
								total_volume+=Line_Volume_Imperial(
										Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
								total_weight+=Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
						}
						catch(Exception empty) {
						}
						label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
						label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
						if (rdbtnNewEconomy.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*250, total_weight))));
						}else if(rdbtnExpress.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*200, total_weight))));
						}
					}
					
				} catch (NumberFormatException nfe) {
					if (textField_Height[inner_Listener].getText().equals(null)){
						textField_Height[inner_Listener].setText("0");
				}else {
					textField_Height[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a  number for parcel Height!"));
					}
				}
			}
			public void focusLost(FocusEvent event) {
				try{
					focusGained(event);
				} catch (NumberFormatException nfe) {
					if (textField_Height[inner_Listener].getText().equals(null)){
						textField_Height[inner_Listener].setText("0");
				}else {
					textField_Height[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a number for parcel Height!"));
					}
				}
			}
		});
		}
		
		for (int weight_Listener=0; weight_Listener<10;weight_Listener++) {
			final Integer inner_Listener = new Integer(weight_Listener);
			
			textField_Weight[inner_Listener].addFocusListener(new HandlerClass(){
				
			public void focusGained(FocusEvent event) {
				DecimalFormat df = new DecimalFormat("##.###");
				textField_Weight[inner_Listener].selectAll();
				try{	
					if (rdbtnkg.isSelected()) {
					lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume(
							Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
							Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
							Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight(
									Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					else if(rdbtnlbs.isSelected()) {
						lbl_LineVOLUME[inner_Listener].setText(String.valueOf(df.format(Line_Volume_Imperial(
								Double.parseDouble(textField_Length[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[inner_Listener].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[inner_Listener].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[inner_Listener].setText(String.valueOf(df.format(Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[inner_Listener].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[inner_Listener].getText().replaceAll(",", "."))))));
					}
					double total_volume=0;
					double total_weight=0;
					
					for (int total_counter=0; total_counter<10;total_counter++) {
						try {
							if (rdbtnkg.isSelected()) {
							total_volume+=Line_Volume(
									Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							total_weight+=Line_Weight(
									Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							} else if(rdbtnlbs.isSelected()) {
								total_volume+=Line_Volume_Imperial(
										Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
								total_weight+=Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
						}
						catch(Exception empty) {
						}
						label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
						label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
						if (rdbtnNewEconomy.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*250, total_weight))));
						}else if(rdbtnExpress.isSelected()) {
							label_Total_Billing.setText(String.valueOf(
									df.format(
									Math.max(total_volume*200, total_weight))));
						}
					}
					
				} catch (NumberFormatException nfe) {
					if (textField_Weight[inner_Listener].getText().equals(null)){
						textField_Weight[inner_Listener].setText("0");
				}else {
					textField_Weight[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a  number for parcel Weight!"));
					}
				}
			}
			public void focusLost(FocusEvent event) {
				try{
					focusGained(event);
				} catch (NumberFormatException nfe) {
					if (textField_Weight[inner_Listener].getText().equals(null)){
						textField_Weight[inner_Listener].setText("0");
				}else {
					textField_Weight[inner_Listener].setText("0");
						JOptionPane.showMessageDialog(null, String.format("Enter a number for parcel Weight!"));
					}
				}
			}
		});
			rdbtnlbs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblLength.setText("Length (in)");
					lblWidth.setText("Width (in)");
					lblHeight.setText("Height(in)");
					lblWeight.setText("Weight(lbs)");
					
					DecimalFormat df = new DecimalFormat("##.###");
					
					HandlerClass Button = new HandlerClass();
					
					for (int button_cycle = 0; button_cycle<10; button_cycle++) {
						
						
						lbl_LineVOLUME[button_cycle].setText(String.valueOf(df.format(Button.Line_Volume_Imperial(
								Double.parseDouble(textField_Length[button_cycle].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[button_cycle].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[button_cycle].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[button_cycle].setText(String.valueOf(df.format(Button.Line_Weight_Imperial(
										Double.parseDouble(textField_Weight[button_cycle].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
						}
					
						double total_volume=0;
						double total_weight=0;
						
						for (int total_counter=0; total_counter<10;total_counter++) {
							try {
									total_volume+=Button.Line_Volume_Imperial(
											Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									total_weight+=Button.Line_Weight_Imperial(
											Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
							catch(Exception empty) {
							}
							label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
							label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
							if (rdbtnExpress.isSelected()) {
								label_Total_Billing.setText(String.valueOf(
										df.format(
										Math.max(total_volume*200, total_weight))));
							}
							else if(rdbtnNewEconomy.isSelected()) {
								label_Total_Billing.setText(String.valueOf(
										df.format(
										Math.max(total_volume*250, total_weight))));
							}
				}
				}
			});
			rdbtnkg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblLength.setText("Length (cm)");
					lblWidth.setText("Width (cm)");
					lblHeight.setText("Height(cm)");
					lblWeight.setText("Weight(kg)");
					
					DecimalFormat df = new DecimalFormat("##.###");
					HandlerClass Button = new HandlerClass();
					
					for (int button_cycle = 0; button_cycle<10; button_cycle++) {
						
						
						lbl_LineVOLUME[button_cycle].setText(String.valueOf(df.format(Button.Line_Volume(
								Double.parseDouble(textField_Length[button_cycle].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Width[button_cycle].getText().replaceAll(",", ".")),
								Double.parseDouble(textField_Height[button_cycle].getText().replaceAll(",", ".")),
								Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
						lbl_LineWEIGHT[button_cycle].setText(String.valueOf(df.format(Button.Line_Weight(
										Double.parseDouble(textField_Weight[button_cycle].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
						}
					
						double total_volume=0;
						double total_weight=0;
						
						for (int total_counter=0; total_counter<10;total_counter++) {
							try {
									total_volume+=Button.Line_Volume(
											Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									total_weight+=Button.Line_Weight(
											Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
							}
							catch(Exception empty) {
							}
							label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
							label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
							if (rdbtnExpress.isSelected()) {
								label_Total_Billing.setText(String.valueOf(
										df.format(
										Math.max(total_volume*200, total_weight))));
							}
							else if(rdbtnNewEconomy.isSelected()) {
								label_Total_Billing.setText(String.valueOf(
										df.format(
										Math.max(total_volume*250, total_weight))));
							}
				}
				}
			});

			buttonGroup_service.add(rdbtnNewEconomy);
			rdbtnNewEconomy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					HandlerClass Button = new HandlerClass();
					DecimalFormat df = new DecimalFormat("##.###");
							double total_volume=0;
							double total_weight=0;
							
							for (int total_counter=0; total_counter<10;total_counter++) {
								try {
									if (rdbtnkg.isSelected()) {
									total_volume+=Button.Line_Volume(
											Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									total_weight+=Button.Line_Weight(
											Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									} else if(rdbtnlbs.isSelected()) {
										total_volume+=Button.Line_Volume_Imperial(
												Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
												Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
												Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
												Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
										total_weight+=Button.Line_Weight_Imperial(
												Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
												Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									}
								}
								catch(Exception empty) {
								}
								label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
								label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
								if (rdbtnNewEconomy.isSelected()) {
									label_Total_Billing.setText(String.valueOf(
											df.format(
											Math.max(total_volume*250, total_weight))));
								}
							}
							
					}
			});
			buttonGroup_service.add(rdbtnExpress);
			rdbtnExpress.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					HandlerClass Button = new HandlerClass();
					DecimalFormat df = new DecimalFormat("##.###");
					for (int button_cycle = 0; button_cycle<10; button_cycle++) {
	
							if (rdbtnkg.isSelected()) {
							lbl_LineVOLUME[button_cycle].setText(String.valueOf(df.format(Button.Line_Volume(
									Double.parseDouble(textField_Length[button_cycle].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Width[button_cycle].getText().replaceAll(",", ".")),
									Double.parseDouble(textField_Height[button_cycle].getText().replaceAll(",", ".")),
									Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
							lbl_LineWEIGHT[button_cycle].setText(String.valueOf(df.format(Button.Line_Weight(
											Double.parseDouble(textField_Weight[button_cycle].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
							}
							else if(rdbtnlbs.isSelected()) {
								lbl_LineVOLUME[button_cycle].setText(String.valueOf(df.format(Button.Line_Volume_Imperial(
										Double.parseDouble(textField_Length[button_cycle].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Width[button_cycle].getText().replaceAll(",", ".")),
										Double.parseDouble(textField_Height[button_cycle].getText().replaceAll(",", ".")),
										Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
								lbl_LineWEIGHT[button_cycle].setText(String.valueOf(df.format(Button.Line_Weight_Imperial(
												Double.parseDouble(textField_Weight[button_cycle].getText().replaceAll(",", ".")),
												Integer.parseInt(textField_Count[button_cycle].getText().replaceAll(",", "."))))));
							}
							double total_volume=0;
							double total_weight=0;
							
							for (int total_counter=0; total_counter<10;total_counter++) {
								try {
									if (rdbtnkg.isSelected()) {
									total_volume+=Button.Line_Volume(
											Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
											Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									total_weight+=Button.Line_Weight(
											Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
											Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									} else if(rdbtnlbs.isSelected()) {
										total_volume+=Button.Line_Volume_Imperial(
												Double.parseDouble(textField_Length[total_counter].getText().replaceAll(",", ".")),
												Double.parseDouble(textField_Width[total_counter].getText().replaceAll(",", ".")),
												Double.parseDouble(textField_Height[total_counter].getText().replaceAll(",", ".")),
												Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
										total_weight+=Button.Line_Weight_Imperial(
												Double.parseDouble(textField_Weight[total_counter].getText().replaceAll(",", ".")),
												Integer.parseInt(textField_Count[total_counter].getText().replaceAll(",", ".")));
									}
								}
								catch(Exception empty) {
								}
								label_Total_Volume.setText(String.valueOf(df.format(total_volume)));
								label_Total_Weight.setText(String.valueOf(df.format(total_weight)));
								if (rdbtnExpress.isSelected()) {
									label_Total_Billing.setText(String.valueOf(
											df.format(
											Math.max(total_volume*200, total_weight))));
								}
							}
					}
					}
			});
			
			
			
		}
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new Print_Screen(label_Total_Volume.getText(),label_Total_Weight.getText(),label_Total_Billing.getText());
				
					try {
						Print_Screen dialog = new Print_Screen(label_Total_Volume.getText(),label_Total_Weight.getText(),label_Total_Billing.getText());
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		});
		
}
}

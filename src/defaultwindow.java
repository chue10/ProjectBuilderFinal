import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JRadioButton;

public class defaultwindow extends JFrame {

	private JFrame frmJavaMotorsApplication;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTaxes;
	private JRadioButton rdbtnRetailSales;
	private JRadioButton rdbtnSalesAgent;
	private JRadioButton rdbtnAddAgent;
	private JRadioButton rdbtnBonus;
	private JButton closeBtn;
	private JButton okBtn;

	private Taxes tax;

	/**
	 * Create the application.
	 */
	public defaultwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaMotorsApplication = new JFrame();
		frmJavaMotorsApplication.setTitle("Java Motors Application");
		frmJavaMotorsApplication.setFont(new Font("Dialog", Font.PLAIN, 13));
		frmJavaMotorsApplication.setResizable(false);
		frmJavaMotorsApplication.setBounds(100, 100, 450, 300);
		frmJavaMotorsApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaMotorsApplication.getContentPane().setLayout(new BorderLayout(5, 5));

		JLabel lblWelcome = new JLabel("Welcome to Java Motors\r\n\r\n");
		frmJavaMotorsApplication.getContentPane().add(lblWelcome, BorderLayout.NORTH);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblWelcome.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(15);
		frmJavaMotorsApplication.getContentPane().add(panel, BorderLayout.SOUTH);

		okBtn = new JButton("Ok");
		panel.add(okBtn);
		okBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		okBtn.addActionListener(new OkBtnListener());

		closeBtn = new JButton("Close");
		panel.add(closeBtn);
		closeBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		closeBtn.addActionListener(new CloseBtnListener());

		JPanel panel_2 = new JPanel();
		frmJavaMotorsApplication.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		Label instructLabel = new Label("Select an Option and Press Ok");
		panel_2.add(instructLabel);
		instructLabel.setAlignment(Label.CENTER);

		JPanel radioPanel = new JPanel();
		panel_2.add(radioPanel);
		radioPanel.setLayout(new GridLayout(5, 1, 0, 0));

		rdbtnBonus = new JRadioButton("Bonus");
		radioPanel.add(rdbtnBonus);
		rdbtnBonus.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(rdbtnBonus);

		rdbtnSalesAgent = new JRadioButton("Sales Agent");
		rdbtnSalesAgent.setHorizontalAlignment(SwingConstants.CENTER);
		radioPanel.add(rdbtnSalesAgent);
		buttonGroup.add(rdbtnSalesAgent);

		rdbtnRetailSales = new JRadioButton("Retail Sales");
		radioPanel.add(rdbtnRetailSales);
		rdbtnRetailSales.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(rdbtnRetailSales);

		rdbtnAddAgent = new JRadioButton("Add Agent");
		radioPanel.add(rdbtnAddAgent);
		rdbtnAddAgent.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(rdbtnAddAgent);

		rdbtnTaxes = new JRadioButton("Taxes");
		radioPanel.add(rdbtnTaxes);
		rdbtnTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(rdbtnTaxes);
	}

	private class CloseBtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public class OkBtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (rdbtnTaxes.isSelected()) {
				tax = new Taxes();
				tax.setPriceCar();
				tax.setSalesTax();
				tax.setStateTax();
				JOptionPane.showMessageDialog(null, tax.toString());
			} else if (rdbtnRetailSales.isSelected())
				JOptionPane.showMessageDialog(null, "Taxes!");
			else if (rdbtnSalesAgent.isSelected())
				JOptionPane.showMessageDialog(null, "Taxes!");
			else if (rdbtnAddAgent.isSelected())
				JOptionPane.showMessageDialog(null, "Taxes!");
			else if (rdbtnBonus.isSelected())
				JOptionPane.showMessageDialog(null, "Taxes!");
			else
				JOptionPane.showMessageDialog(null, "Choose Something!");

		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					defaultwindow window = new defaultwindow();
					window.frmJavaMotorsApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

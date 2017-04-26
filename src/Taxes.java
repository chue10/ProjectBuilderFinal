import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 * Calculates the Taxes Due on vehicle sale and the estimated Vehicle Taxes. The
 * sales tax rate is 8.25% and the state vehicle tax is 5.3%. It will output the
 * price and then the estimated Vehicle Taxes.
 * 
 * @author Christopher Huerta
 * @version 1/30/2017
 * @see Ch2-PC7
 */
public class Taxes {
	// initialise variables

	private boolean validDouble; // False if not a double
	private double priceCar; // Input Price of Car
	private double salesTax; // To Hold Value of Sales Tax
	private double stateTax; // To Hold Value of State Tax
	private final double SALE = .0825; // Constant for Sales Tax Rate
	private final double STATE = .053; // Constant for State Vehicle Tax

	public Taxes() throws NumberFormatException {

		priceCar = 0;
		salesTax = 0;
		stateTax = 0;
		validDouble = false;
	}

	public void setPriceCar() {
		String p = "";
		// Get the Car Price
		while (!validDouble) {
			p = JOptionPane.showInputDialog("What is the price of the vehicle sale? ");
			validDouble = CheckPriceCar(p);
		}
	}

	public boolean CheckPriceCar(String p) {
		boolean validDouble = false;
		try {
			priceCar = Double.parseDouble(p);
			validDouble = true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Not a valid double");

		}
		return validDouble;
	}

	public void setSalesTax() {
		salesTax = SALE * priceCar;
	}

	public void setStateTax() {
		salesTax = STATE * priceCar;
	}

	public double getPriceCar() {
		return priceCar;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public double getStateTax() {
		return salesTax;
	}

	@Override
	public String toString() {
		String output = "";
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		output += "\nSales Price: " + formatter.format(getPriceCar());
		output += "\nSales Tax: " + formatter.format(getSalesTax());
		output += "\nState Tax: " + formatter.format(getStateTax());
		output += "\nTotal Tax: " + formatter.format(getSalesTax() + getStateTax());
		output += "\nTotal: " + formatter.format(getPriceCar() + getSalesTax() + getStateTax());
		return output;
	}

}

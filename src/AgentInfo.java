import javax.swing.JOptionPane;

/**
 * A class similar to CH6-PC4 that holds data of an agent. It holds agentID
 * (array of numbers use int for now), agentName as String, payRate (an array of
 * doubles, use one double for now), hireDate (String), commissionRate as a
 * double.
 * 
 * @author Christopher Huerta
 * @version 3/2/27
 * @see PB06
 */
public class AgentInfo {
	// instance variables - replace the example below with your own
	private String agentID;
	private String agentName;
	private double payRate;
	private String hireDate;
	private String agentType;
	private double commissionRate;

	/**
	 * Constructor for objects of class AgentInfo
	 */
	public AgentInfo() {
		// initialise instance variables
		agentID = "";
		agentName = "";
		payRate = 0.0;
		hireDate = "";
		agentType = "";
		commissionRate = 0.0;
	}

	/**
	 * setAgentID assigns a value to agentID
	 * 
	 * @param id
	 *            The agent Id send by the user
	 * @param n
	 *            The agent name send by the usser
	 * @param p
	 *            The pay rate for agent
	 * @param h
	 *            The date the agent was hired
	 * @param t
	 *            The type of againt (retail, commertial)
	 * @param c
	 *            The commison for the agent
	 * @return none
	 */
	public String setAgentID(String id, String n, double p, String h, String t, double c) {
		agentID = id;
		agentName = n;
		payRate = p;
		hireDate = h;
		agentType = t;
		commissionRate = c;
		return null;
	}

	public void setID() {
		agentID = JOptionPane.showInputDialog("What is the Agents Name?");
	}

	public void setName() {
		agentName = JOptionPane.showInputDialog("What is the Agent's Name?");
	}

	public void setPayRate() throws NumberFormatException {
		try {
			payRate = Double.parseDouble(JOptionPane.showInputDialog("What is the Agent's Payrate?"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Not a number!");
			setPayRate();
		}
	}

	public void setHireDate() {
		hireDate = JOptionPane.showInputDialog("When was the Agent's Name?");
	}

	public void setCommisionRate() {
		try {
			payRate = Double.parseDouble(JOptionPane.showInputDialog("What is the Agent's Payrate?"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Not a number!");
			setCommisionRate();
		}
	}

	/**
	 * Return Agent ID as a variable
	 * 
	 * @return The agent ID in the class
	 */
	public String getAgentID() {
		return agentID;
	}

	/**
	 * Return agent name
	 * 
	 * @param agentName
	 *            The agent Name
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * Returns payrate of the agent
	 * 
	 * @return payRate The payrate of the agent
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * This module returns the date the agent was hired
	 * 
	 * @return hireDate as String.
	 */
	public String getHireDate() {
		return hireDate;
	}

	/**
	 * This module returns the type of agent (retail or commercial)
	 * 
	 * 
	 * @return agentType as String
	 */
	public String getAgentType() {
		return agentType;
	}

	/**
	 * This module returns the commission rate as a double
	 * 
	 * 
	 * @return commsision rate as a Double
	 */
	public double getCommissionRate() {

		return commissionRate;
	}

}

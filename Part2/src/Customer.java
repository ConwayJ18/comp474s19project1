public class Customer
{
	private int customerID;
	private boolean discountMember;
	private boolean taxExempt;
	
	public Customer() {}
	/**
	 * @param customerID
	 */
	public Customer(int customerID)
	{
		this.customerID = customerID;
		this.discountMember = false;
		this.taxExempt = false;
	}
	
	/**
	 * @param customerID
	 * @param discountMember
	 */
	public Customer(int customerID, boolean discountMember)
	{
		this.customerID = customerID;
		this.discountMember = discountMember;
		this.taxExempt = false;
	}
	
	/**
	 * @param customerID
	 * @param discountMember
	 * @param taxExempt
	 */
	public Customer(int customerID, boolean discountMember, boolean taxExempt)
	{
		this.customerID = customerID;
		this.discountMember = discountMember;
		this.taxExempt = taxExempt;
	}
	
	/**
	 * @return the customerID
	 */
	public int getCustomerID()
	{
		return customerID;
	}
	
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	
	/**
	 * @return the discountMember
	 */
	public boolean isDiscountMember()
	{
		return discountMember;
	}
	
	/**
	 * @param discountMember the discountMember to set
	 */
	public void setDiscountMember(boolean discountMember)
	{
		this.discountMember = discountMember;
	}
	
	/**
	 * @return the taxExempt
	 */
	public boolean isTaxExempt()
	{
		return taxExempt;
	}
	
	/**
	 * @param taxExempt the taxExempt to set
	 */
	public void setTaxExempt(boolean taxExempt)
	{
		this.taxExempt = taxExempt;
	}
}

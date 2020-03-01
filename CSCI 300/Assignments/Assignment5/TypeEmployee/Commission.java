//********************************************************************
//  Commission.java  
//
//  Represents an hourly employee who also gets commission
//********************************************************************
public class Commission extends Hourly
{
    private double totalSales;
    private double commissionRate;

   //-----------------------------------------------------------------
   // Need commission rate as well as other hourly employee info
   //-----------------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate)
    {
   	super(eName, eAddress, ePhone, socSecNumber, rate);
   	commissionRate = comRate;
   	totalSales = 0;
    }

   //-----------------------------------------------------------------
   // Add to amount of sales for this employee
   //-----------------------------------------------------------------
    public void addSales(double sales)
    {
	   totalSales += sales;
    }

   //-----------------------------------------------------------------
   // Include commission in pay
   //-----------------------------------------------------------------
    public double pay()
    {
   	double payment = super.pay() + totalSales * commissionRate;
   	totalSales = 0;
   	return payment;
    }

   //-----------------------------------------------------------------
   // Return total sales as part of string representation
   //-----------------------------------------------------------------
    public String toString()
    {
	   return super.toString() + "\nTotal sales: " + totalSales;
    }
}

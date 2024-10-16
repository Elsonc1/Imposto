package imposto;

public class Person {

	private double paymentPerYear;
	private double paymentServicePerYear;
	private double rentYearGainPerEquity;
	private double spendingMedicinal;
	private double spendingSchool;
	
	public double getPaymentPerYear() {
		return paymentPerYear;
	}

	public double getPaymentServicePerYear() {
		return paymentServicePerYear;
	}

	public double getRentYearGainPerEquity() {
		return rentYearGainPerEquity;
	}

	public double getSpendingMedicinal() {
		return spendingMedicinal;
	}

	public double getSpendingSchool() {
		return spendingSchool;
	}
	
	public Person(double paymentPerYear, double paymentServicePerYear, double rentYearGainPerEquity, double spendingMedicinal, double spendingSchool) {
		this.paymentPerYear = paymentPerYear;
		this.paymentServicePerYear = paymentServicePerYear;
		this.rentYearGainPerEquity = rentYearGainPerEquity;
		this.spendingMedicinal = spendingMedicinal;
		this.spendingSchool = spendingSchool;
	}
}
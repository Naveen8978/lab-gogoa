package services;

public class Booking{
	int total_rate = 0;
	public double booking(int noOfPersons,int rates) {
		total_rate = noOfPersons * rates;
		return total_rate;
	}
}

package objectExcercises1;

public class TimePeriod {

	private int hours;
	private int minutes;

	public TimePeriod() {

		hours = 0;
		minutes = 0;

	}

	public void addHours(int hoursToAdd) {

		if (hoursToAdd >= 0 && hoursToAdd <= 99) {

			hours += hoursToAdd;
		}
		
		if (hours >= 100) {
			hours = 99;
		}

	}

	public void addMinutes(int minutesToAdd) {
		
		int tempHours = hours;
		int tempMinutes = minutes;

		if (minutesToAdd >= 0 && minutesToAdd <= 59) {
			tempMinutes += minutesToAdd; 
			}
		
		if (tempMinutes >= 60) {
			tempHours += 1;
			tempMinutes -= 60;
		}
		
		if (tempMinutes <= 59 && tempHours <= 99) {
			
			minutes = tempMinutes;
			hours = tempHours;
			
		}

	}

	public String toString() {

		return hours + " h " + minutes + " min ";
	}

}
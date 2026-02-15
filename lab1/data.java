package lab1;

public class data {
	private double maximum;
	private double sum;
	private int count;
	
	public data(){
		count = 0;
		sum = 0;
		maximum = -Double.MAX_VALUE;
	}
	
	public void add(double value) {
		sum += value;
		if (count == 0 || maximum<value) {
			maximum = value;
		}
		count++;
	}
	
	public double getAvg() {
		if (count == 0) return 0;
		return sum / count;
	}
	
	public double getMax() {
		if (count == 0) return 0;
		return maximum;
	}
}


package problem5;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;

    public Time(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours)
            return this.hours - other.hours;
        return this.minutes - other.minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
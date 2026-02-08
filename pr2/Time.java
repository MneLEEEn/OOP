package pr2;

public class Time {
	private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Error: Invalid time input!");
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time t2) {
        this.second += t2.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += t2.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour = (this.hour + t2.hour) % 24;
    }
}

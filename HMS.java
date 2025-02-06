import java.util.Objects;

public class HMS implements Time {
    private int hour;
    private int minute;
    private int second;


    public HMS(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHours() {
        return hour;
    }

    public int getMinutes() {
        return minute;
    }

    public int getSeconds() {
        return second;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Time) {
            HMS time = (HMS) o;
            return this.hour == time.hour
            && this.minute == time.minute 
            && this.second == time.second;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
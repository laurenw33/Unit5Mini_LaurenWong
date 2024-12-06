/**
 * The Time class represents a time clock. Time is represented by the hour, minute, and second.
 */

public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * Constructor for the Person class. This creates a new instance of a Person given
     * the below parameters.
     *
     * @param h represents the hours of the time
     * @param m represents the minutes of the time
     * @param s represents the seconds of the time
     */
    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    /**
     * The tick method increases the time by one second. If the seconds are at 59, it
     * increases the number of minutes by one and resets the seconds back to 0. This is
     * also applied to the number of hours, resetting the number of minutes and seconds back to 0.
     */
    public void tick() {
        if (second <= 59) {
            second++;
        }
        if (second == 60) {
            second = 0;
            if (minute <= 59) {
                minute++;
            }
            if (minute == 60) {
                minute = 0;
                if (hour <= 24) {
                    hour++;
                }
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    /**
     * The add method will calculate the time of the object plus the time of another object
     * by adding together the hours, minutes, and seconds. Adjustments are made for the fact
     * there are only 60 seconds, 60 minutes, and 24 hours.
     *
     * @param time an object that gets the hours, minutes, and seconds associated with
     * that specific object.
     */
    public void add(Time time) {
        int newHour = time.getHour();
        int newMinute = time.getMinute();
        int newSecond = time.getSecond();

        if (second + newSecond <= 59) {
            second += newSecond;
        }
        else if (second + newSecond >= 60) {
            second = (second + newSecond) - 60;
            minute++;
        }

        if (minute + newMinute <= 59) {
            minute = minute + newMinute;
        }
        else if (minute + newMinute >= 60) {
            minute = (minute + newMinute) - 60;
            hour++;
        }

        if (hour + newHour <= 24) {
            hour = hour + newHour;
        }
    }

    /**
     * toString method for the Time class. This method will return a String
     * showing the time stored for the specific object.
     *
     * @return returns a String in a properly formatted sentence containing the
     * time of the object in HH.MM.SS.
     */
    public String toString() {
        String s = "";
        if (hour < 10) {
            s = "0" + hour + ":";
        } else {
            s = hour + ":";
        }
        if (minute < 10) {
            s = s + "0" + minute + ":";
        } else {
            s = s + minute + ":";
        }
        if (second < 10) {
            s = s + "0" + second;
        } else {
            s = s + second;
        }
        return s;

    }

    /**
     * Gets the number of hours for the object.
     * @return returns the number of hours for associated object
     */
    public int getHour() {
        return hour;
    }

    /**
     * Gets the number of minutes for the object.
     * @return returns the number of minutes for associated object
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Gets the number of seconds for the object.
     * @return returns the number of seconds for associated object
     */
    public int getSecond() {
        return second;
    }

}
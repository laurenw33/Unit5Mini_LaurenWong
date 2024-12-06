public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }


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

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}
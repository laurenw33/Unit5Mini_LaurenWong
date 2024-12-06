public class TimeRunner {
    public static void main(String[] args) {
        Time time1 = new Time(8, 9, 58);
        System.out.println("EXPECTED RESULT: 08:09:58");
        System.out.println("ACTUAL RESULT: " + time1);

        time1.tick();
        time1.tick();
        System.out.println("EXPECTED RESULT: 08:10:00");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();

        Time time2 = new Time (15, 59, 59);
        time2.tick();
        time2.tick();
        time2.tick();
        System.out.println("EXPECTED RESULT: 16:00:02");
        System.out.println("ACTUAL RESULT: " + time2);
        System.out.println();

        Time time4 = new Time(10, 14, 43);
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println("EXPECTED RESULT: 18:45:12");
        System.out.println("ACTUAL RESULT: " + time4);
        System.out.println();

    }
}

class Time {
    static float percent_of_day (int current_second) {
        return (float) current_second * 100 / 86400;
    }

    public static void main(String[] args) {
        int hour = 6;
        int minute = 9;
        int second = 42;

        int current_second = hour * 3600 + minute * 60 + second;

        

        System.out.println(current_second + " seconds since midnight.");
        System.out.println(86400 - current_second + " seconds to end of day");
        System.out.println(percent_of_day(current_second) + "% of the day has passed.");
    }
}
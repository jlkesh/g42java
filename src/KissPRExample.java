public class KissPRExample {
    static String[] weekDays = {"what the hack bro", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        //TODO sdfdsf
        System.out.println(getWeekDay(12));
    }

    public static String getWeekDay(int dayNumber) {
        dayNumber = dayNumber < 1 || dayNumber > 7 ? 0 : dayNumber;
        return weekDays[dayNumber];
    }
}

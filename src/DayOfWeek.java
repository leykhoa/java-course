public class DayOfWeek {


    public static void main(String[] args) {

    }
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> {yield  "Sunday";}
            case 1 -> {yield  "Monday";}
            case 2 -> {yield  "Tuesday";}
            case 3 -> {yield  "Wednesday";}
            case 4 -> {yield  "Thursday";}
            case 5 -> {yield  "Friday";}
            case 6 -> {yield  "Saturday";}
            default -> "Invalid Day";
        };

    }
}

package by.epam.learn.automation.maintask05.monthname;

public class MonthNameSelector {

    public static String getMonthName(int number) {
        String monthName = "";
        switch (number) {
            case 1:
                monthName = Text.JAN;
                break;
            case 2:
                monthName = Text.FEB;
                break;
            case 3:
                monthName = Text.MAR;
                break;
            case 4:
                monthName = Text.APR;
                break;
            case 5:
                monthName = Text.MAY;
                break;
            case 6:
                monthName = Text.JUN;
                break;
            case 7:
                monthName = Text.JUL;
                break;
            case 8:
                monthName = Text.AUG;
                break;
            case 9:
                monthName = Text.SEP;
                break;
            case 10:
                monthName = Text.OCT;
                break;
            case 11:
                monthName = Text.NOV;
                break;
            case 12:
                monthName = Text.DEC;
                break;
        }
        return monthName;
    }

}

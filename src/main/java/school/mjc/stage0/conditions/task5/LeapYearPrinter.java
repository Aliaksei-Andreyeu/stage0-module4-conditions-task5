package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int result = year%4;
        if (year%100==0 && year%4==0) {
            if (year%400==0){
                result=0;
            } else {
                result=1;
            }
        }
        switch (result) {
            case (0):
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}

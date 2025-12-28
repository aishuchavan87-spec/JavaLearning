package Day2;

public class MonthNameDemo {
    public static void main(String[] args) {
        int monthNumber=3;
        String monthName="";

        if (monthNumber==1){
            monthName="Jan";
        }
        else if (monthNumber==2) {
            monthName="Feb";
        }
        else if (monthNumber==3){
            monthName="March";
        }
        else if (monthNumber==4){
            monthName="April";
        }
        else monthName="default";
        System.out.println(monthNumber + "-" + monthName);
    }
}

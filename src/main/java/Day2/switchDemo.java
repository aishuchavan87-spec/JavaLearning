package Day2;

public class switchDemo {
    public static void main(String[] args) {

            int monthNumber=3;
            String monthName="";
            switch (monthNumber) {

                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "Feb";
                    break;
                case 3:
                    monthName = "March";
                    break;
                default:
                    monthName = "NotFound";
                    break;
            }
                System.out.println(monthNumber + "->" + monthName);



    }
}

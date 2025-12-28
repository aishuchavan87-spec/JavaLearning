package Day2;

public class conditionalStatementPractise {
    public static void main(String[] args) {

//        int age=15;
//        String ageGroup="";
//
//        if (age <= 18) {
//            ageGroup = "Child";
//        } else {
//            ageGroup = "Adult";
//        }
//        System.out.println(ageGroup);


        //Ternary Operator means >> condition ? (True value) : (False Value)

//        int age =15;
//        String ageGroup= (age <=20 ) ? "Child": "Adult";
//        System.out.println(ageGroup);


        //age<= 18 =child
        //19 to 30 = Adult
        //31 to 45 = Mature
        //45 and above = Old

        int age=35;
        String ageGroup="";

        if (age<=18)
        {  ageGroup="Child";
        }
        else if(age>=19 && age <= 30)
        {
            ageGroup="Adult";
        }else if(age>=31 && age <= 45)
        {
            ageGroup="Mature";
        }
        else ageGroup="Old";

        System.out.println(ageGroup);
    }
}




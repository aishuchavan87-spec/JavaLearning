package Day2;

public class ConditionalStatement2 {
    public static void main(String[] args) {

        //age<= 18 =child
        //19 to 30 = Adult
        //31 to 45 = Mature
        //45 and above = Old

        int age=25;
                String ageGroup="";

        if(age<=18){
            ageGroup="Child";
        }
        else if (age>=19 && age<=30){
            ageGroup="Adult";
        }
        else if (age>=31 && age<=45){
            ageGroup="Mature";
        }
        else {
            ageGroup = "Old";
        }
        System.out.println(ageGroup);

    }
}

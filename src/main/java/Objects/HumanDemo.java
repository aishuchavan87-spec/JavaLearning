package Objects;

public class HumanDemo {
    public static void main(String[] args) {

        //instance level variables/ object level variables

        Human h1 = new Human();
        h1.name="chunky";
        h1.age=50;
        h1.country="Russia";

        Human  h2 = new Human();
        h2.name="Shambs";
        h2.age=30;
       // h2.speak("Hello,How do you do?");
        h2.country="Dubai";

        Human h3 = new Human();
        h3.name="Parthamesh";
        h3.age=25;
        h3.country="England";
        h3.country="UK";

        h2.speak("Hello,How do you do?");


    }
}
  class Human {
      String name;
      int age;
      static String country; //shared variables
     // String country country; instance variable

      void speak(String content) {
          System.out.println(name + ':' + content + ':' + country);
      }
  }



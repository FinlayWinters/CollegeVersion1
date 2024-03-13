// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello New World");

        student s = new student(  "Larry",  52);
        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getName());

        s.setName("Lawrence");
        s.birthday();

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.addNickname(  "Lazza");
        s.addNickname(   "Big Larr");
        s.printNicknames();

        student s2 = new student("Curly", 54);
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        module n = new module("Calculus", 3);

       String aString = n.getName();
       System.out.println(aString);
       System.out.println(n.getName());
    }
}
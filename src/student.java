import java.util.ArrayList;

public class student {
    private String name;  // String field belonging to the student class
    private int age;  // int field belonging to the student class
    private ArrayList<String> nickNames;

    public student(String name, int age) // constructor takes 2 parameters a string for name and int for age
    {
        this.name = name; // sets the field the name to the value of the parameter
        this.age = age;
        this.nickNames = new ArrayList<>();


    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int anAge) {
        this.age = anAge;
    }

    public void birthday() {
        age++;
    }

    public void addNickname(String newNickname) {
        this.nickNames.add(newNickname);
    }

    public void printNicknames() {
        for (String eachNickname : this.nickNames) {
            System.out.println(eachNickname);
        }


    }
}

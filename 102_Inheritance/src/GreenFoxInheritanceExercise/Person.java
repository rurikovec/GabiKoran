package GreenFoxInheritanceExercise;

public class Person implements Cloneable{

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, %d year old %s", this.name, this.age, this.gender);
    }

    public void getGoal() {
        System.out.println("\nMy goal is: Live for the moment!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {    // meghívjuk
        return super.clone();
    }
}

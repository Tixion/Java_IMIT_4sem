//фамилия, имя, отчество, возраст и методами:
//конструкторы, геттеры/сеттеры, equals и hashCode.

import java.util.Objects;

public class Human {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Human(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        return this.getFirstName().equals(((Human) o).getFirstName()) && this.getMiddleName().equals(((Human) o).getMiddleName())
        && this.getLastName().equals(((Human) o).getLastName()) && this.getAge() == ((Human) o).getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getLastName());
    }
}
//public static void main(String[] args)

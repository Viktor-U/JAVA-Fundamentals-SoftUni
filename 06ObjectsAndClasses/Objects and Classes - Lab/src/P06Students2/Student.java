package P06Students2;

public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String town;

    public Student(String firstName, String lastName, String age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }
}

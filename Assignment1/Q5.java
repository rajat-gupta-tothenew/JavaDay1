public class Q5 {

    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Q5() {

    }

    public Q5(String firstName, String lastName, int age, String designation) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee {" + "\n\tfirstName=" + firstName + ", \n\tlastName=" + lastName + ", \n\tage=" + age
                + ", \n\tdesignation=" + designation + "\n}";
    }

    public static void main(String[] args) {
        Q5 employee = new Q5();
        Q5 employee2 = new Q5("Rajat", "Gupta", 22, "Software Engineer");
        System.out.println(employee);
        System.out.println(employee2);
    }
}

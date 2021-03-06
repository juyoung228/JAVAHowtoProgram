package chapter8;

//Fig. 8.12
//static variable used to maintain a count of the number of
//Employee objects in memory.
public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastNmae() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }

}

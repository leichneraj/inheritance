public class Person {
    private String first, last;
    private final int i = 0;

    public Person() {
        first = "Bill";
        last = "Johnson";
    }

    public Person(String f, String l) {
        first = f;
        last = l;
    }

    public void setName(boolean firstName, String newName) {
        if(firstName) {
            first = newName;
        } else {
            last = newName;
        }
    }

    public String toString() {
        return (first + " " + last + " ");
    }

    public void printLastFirst() {
        System.out.println(last + ", " + first);
    }

    public void print() {
        System.out.println(first + ", " + last);
    }

    public void equals() {

    }

    public void copy(Person person) {
        for()
    }

    public void getCopy() {

    }
}

import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void myDetails(Person person) {
        person.displayDetails();
    }

    public void printCurrentInstance() {
        myDetails(this);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        Person person = new Person(name, age, address);
        person.printCurrentInstance();
    }
}
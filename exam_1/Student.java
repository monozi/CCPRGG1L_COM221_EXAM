public class Student {
    String surname;
    String firstName;
    String dateOfBirth;
    String studentEmailAddress;
    char middleInitial;
    int studentNumber;
    boolean iAmAwesome;


    public void sayMySurname() {
        System.out.println("\nMy surname: " + surname);
    }

    public void sayMyFirstName() {
        System.out.println("\nMy first name: " + firstName);
    }
    
    public void sayMyDateOfBirth() {
        System.out.println("\nMy birthday: " + dateOfBirth);
    }

    public void sayMyStudentEmailAddress() {
        System.out.println("\nMy Email Address: " + studentEmailAddress);
    }

    public void sayMyMiddleInitial() {
        System.out.println("\nMy middle initial: " + middleInitial);
    }

    public void sayMyStudentNumber() {
        System.out.println("\nMy student number: " + studentNumber);
    }

    public void sayMyIAmAwesome() {
        System.out.println("\nI am awesome: " + iAmAwesome + "\n");
    }
}

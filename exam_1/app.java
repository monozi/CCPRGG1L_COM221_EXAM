public class App {
    public static void main(String[] args) {

        Student Me = new Student();

        Me.firstName = "John Angelo";
        Me.middleInitial = 'A';
        Me.surname = "Basilio";
        Me.dateOfBirth = "08/18/2003";
        Me.studentNumber = 2022103262;
        Me.studentEmailAddress = "basilioja1@students.national-u.edu.ph";
        Me.iAmAwesome = true;
        Me.sayMyFirstName();
        Me.sayMyMiddleInitial();
        Me.sayMySurname();
        Me.sayMyDateOfBirth();
        Me.sayMyStudentNumber();
        Me.sayMyStudentEmailAddress();
        Me.sayMyIAmAwesome();
    }
}

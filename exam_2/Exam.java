import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        
        OddorEven();
        
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("------------------------ " + "2. PRIME or COMPOSITE number" + " ------------------------ " + "\n");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        PrimeorComposite(lastDigit);

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)

        LengthofFullname();

        
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        largestNumber();

        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        
        lastSixDigits();

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        
        studentNumberValidation();

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        
        caseSensitivityChecker();

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        nestedConditions();

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        toSelection();

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        
        emailAdressValidation();

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        // Close scanner
        scan.close();
    }


    

    static void OddorEven() {
        System.out.println("------------------------ " + "LONG EXAM #2" + " ------------------------ " + "\n");
        System.out.println("------------------------ " + "1. ODD or EVEN numbers" + " ------------------------ " + "\n");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits % 2 == 0) {
            System.out.println("EVEN");
            System.out.println("__________________________________________________________________________________" + "\n");

        } else {
            System.out.println("ODD");
            System.out.println("__________________________________________________________________________________" + "\n");

        }
    }

    static void PrimeorComposite (int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }

        if (n == 0 || n == 1) {
            System.out.println("The number you've entered is NEITHER prime nor composite.");

        } else if (count > 2)
            System.out.println("The number " + n + " you've entered is COMPOSITE.");
        
        else 
            System.out.println("The number " + n + " you've entered is PRIME.");
            System.out.println("__________________________________________________________________________________" + "\n");
    }

    static void LengthofFullname() {
        System.out.println("------------------------ " + "3. Length of your fullname" + " ------------------------ " + "\n");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        firstName.length();
        System.out.println(firstName.length() + "\n");

        System.out.print("Enter your surname: ");
        String surName = scan.next();
        surName.length();
        System.out.println(surName.length() + "\n");
       
        int sum = firstName.length() + surName.length();
        System.out.println("The length of your full name is " + sum);
        System.out.println("__________________________________________________________________________________" + "\n");
    }


    static void largestNumber() {
        System.out.println("------------------------ " + "4. Largest Number" + " ------------------------ " + "\n");

        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int greater = Math.max(firstNumber, secondNumber);
        
        int greatest = greater;
        
        int z = Math.max(greatest, thirdNumber);

        System.out.println("\nThe largest number is " + z);
        System.out.println("__________________________________________________________________________________" + "\n");
    }

    static void lastSixDigits() {
        System.out.println("------------------------ " + "5. Last six digits" + " ------------------------ " + "\n");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int last6Digits = studentNumber - 2022000000;
        System.out.println("\nThe last six digits are " + last6Digits);
        System.out.println("__________________________________________________________________________________" + "\n");
    }

    static void studentNumberValidation() {
        System.out.println("------------------------ " + "6. Student number validation" + " ------------------------ " + "\n");
        System.out.print("Enter your ten digit student number: ");
        int
        studentNumber = scan.nextInt(); 
        
    
        if (studentNumber == 2022103262) {
            System.out.println("\nYour student number is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n"); 

        } else {
            System.out.println("\nYour student number is INVALID!" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n"); 
        }

    }

    static void caseSensitivityChecker() {
        System.out.println("------------------------ " + "7. Case sensitivity check" + " ------------------------ " + "\n");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String
        surName = scan.next();
        
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.print("Your input is valid." + "\n");
           
        } else {
            System.out.print("Your input is INVALID. Please use UPPERCASE!" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
        }
        
       
    }

    static void nestedConditions() {
        System.out.println("------------------------ " + "8. Nested conditions" + " ------------------------ " + "\n");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
        
        if (course.equals("BSIT")) {
            System.out.print("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();
            System.out.println("Your course is valid.");

        } else if (course.equals("BSCS")) {
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            System.out.println("Your course is valid.");
        } else {
            System.out.println("Your course is INVALID!");
        }

        System.out.println("__________________________________________________________________________________" + "\n");   
    }

    static void toSelection() {
        System.out.println("------------------------ " + "9. Selection" + " ------------------------ " + "\n");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {

            case "STEM":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;
            
            case "ICT":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "HUMSS":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "HOME ECONOMICS":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "ARTS AND DESIGN":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "TVL MARITIME":
            System.out.println("Your strand is valid." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            default:
                System.out.println("Your strand is INVALID!!" + "\n");
                System.out.println("__________________________________________________________________________________" + "\n"); 

        }
    }

    static void emailAdressValidation() {
        System.out.println("------------------------ " + "10. Validate student email address" + " ------------------------ " + "\n");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("basilioja1") && studentEmailAddress.contains("@students.national-u.edu.ph")) {
            System.out.println("Your email address is valid.");
            System.out.println("__________________________________________________________________________________" + "\n");

        } else {
            System.out.println("Your email address is INVALID!");
            System.out.println("__________________________________________________________________________________" + "\n");
        }
         
    }

}

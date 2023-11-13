package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// 1. Напишете програма/ метод, която приема от конзолата 3 подадени числа определя кое е най-голяматo.​

        /// 1. =======  START =========

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers");

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if ((firstNum > secondNum) && (firstNum > thirdNum)){
            System.out.println("First number is the biggest");
        } else if ((secondNum > firstNum) && (secondNum > thirdNum)) {
            System.out.println("Second number is the bigges");
        }
        else {
            System.out.println("Third number is the biggest");
        }

        /// 1. =======  END =========

        /// 2. Напишете програма/ метод, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.​

        /// 2. =======  START =========

        int length = scanner.nextInt();
        int height = scanner.nextInt();

        /// P е периметър
        int p = 2 * (length + height);

        /// S е лице
        int s = length * height;

        System.out.println("The parameter is : " + p);
        System.out.println("The area is : " + s);

        /// 2. =======  END =========

        /// 3. Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не?
        /// 3. =======  START =========

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }
        /// 3. =======  END =========

        /// 4. Напишете програма/ метод, която чете число от 1 до 12 в конзолата и на базата на това изписва в конзолата месец от годината във формат.

        /// 4. =======  START =========

        System.out.print("Въведете число от 1 до 12: ");
        int monthNum = scanner.nextInt();

        // Проверка и извеждане на месеца
        if (monthNum == 1) {
            System.out.println("You have selected 1. The month of the year is January");
        } else if (monthNum == 2) {
            System.out.println("You have selected 2. The month of the year is February");
        } else if (monthNum == 3) {
            System.out.println("You have selected 3. The month of the year is March");
        } else if (monthNum == 4) {
            System.out.println("You have selected 4. The month of the year is April");
        } else if (monthNum == 5) {
            System.out.println("You have selected 5. The month of the year is May");
        } else if (monthNum == 6) {
            System.out.println("You have selected 6. The month of the year is June");
        } else if (monthNum == 7) {
            System.out.println("You have selected 7. The month of the year is July");
        } else if (monthNum == 8) {
            System.out.println("You have selected 8. The month of the year is August");
        } else if (monthNum == 9) {
            System.out.println("You have selected 9. The month of the year is September");
        } else if (monthNum == 10) {
            System.out.println("You have selected 10. The month of the year is October");
        } else if (monthNum == 11) {
            System.out.println("You have selected 11. The month of the year is November");
        } else if (monthNum == 12) {
            System.out.println("You have selected 12. The month of the year is December");
        } else {
            System.out.println("Wrong number. The numbers should be between 1 and 12.");
        }

        /// 4. =======  END =========
    }
}
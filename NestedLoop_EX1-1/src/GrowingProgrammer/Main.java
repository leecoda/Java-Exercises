package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumGrade = 0;
        int countPass = 0;

        System.out.println("Please input the number of classes:");
        int classNum = scanner.nextInt();
        System.out.println("Please input the number of students in each class:");
        int stuPerClass = scanner.nextInt();

        for(int c = 1; c <= classNum; c++) {

            double sumClass = 0;

            for(int s = 1; s <= stuPerClass; s++) {
                System.out.println("Please input the score of the " + s + " student in class " + c + ":");
                double score = scanner.nextDouble();
                System.out.println("The score of the " + s + " student is " + score);
                if(score >= 60) {
                    countPass++;
                }
                sumClass += score;
            }

            System.out.println("");
            System.out.println("The average of class " + c + " is: " + (sumClass / 5));
            sumGrade += sumClass;
        }

        System.out.println("");
        System.out.println("The number of students who passed the test is " + countPass);
        System.out.println("The grade average is: " + sumGrade / 15);
    }
}

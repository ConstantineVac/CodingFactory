package gr.aueb.cf.ch9;

import java.io.*;

/**
 * This application reads a text file containing the Name, Surname, Grade1, Grade2 of some students
 * After reading the grades.txt file it calculates the average of the Grade1 and Grade2 and prints
 * the results in a new primOut.txt file containing Name, Surname, Average.
 * The application also checks for exceptions and logs them into an external file.
 */
public class StudentsGradesApp {

    public static void main(String[] args) {
        String filePath = "C:/tmp/grades.txt";
        String logFilePath = "C:/tmp/log.txt";
        String outputFilePath = "C:/tmp/primOut.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true));
             PrintWriter outputWriter = new PrintWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] grades = line.split(" ");
                    if (grades.length == 4) {
                        String name = grades[0];
                        String surname = grades[1];
                        int grade1 = Integer.parseInt(grades[2]);
                        int grade2 = Integer.parseInt(grades[3]);

                        if (grade1 >= 0 && grade1 <= 10 && grade2 >= 0 && grade2 <= 10) {
                            double average = (grade1 + grade2) / 2.0;
                            outputWriter.println(name + " " + surname + " " + average);
                        } else {
                            System.out.println("Please make sure that the grades are between 0,10");
                            throw new IllegalArgumentException("Invalid grade range");
                        }
                    } else {
                        System.out.println("Please make sure that the data are in appropriate format");
                        throw new IllegalArgumentException("Invalid data format");
                    }
                } catch (Exception e) {
                    // Log the error to the log file
                    writer.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

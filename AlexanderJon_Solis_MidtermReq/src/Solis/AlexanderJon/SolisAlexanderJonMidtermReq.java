package Solis.AlexanderJon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;


public class SolisAlexanderJonMidtermReq {
    public static void main(String[] args) {
        //The text files
        String matrixFile1 = System.getProperty("user.dir") + File.separator +"input.txt";
        String matrixFile2 = System.getProperty("user.dir") + File.separator +"input2.txt";

        // Using the method from below to store the inputs from the text files to the 2D arrays
        BigDecimal[][] matrix1 = readMatrixFromFile(matrixFile1);
        BigDecimal[][] matrix2 = readMatrixFromFile(matrixFile2);
        
        System.out.println();

        // The logic on adding all of the arrays
        BigDecimal[][] sumArray = new BigDecimal[3][3];
        System.out.println("The result of the addition of 3x3 matrices: ");
        
        //The for loop used to add the matrices and then print out the result
        for (int indexOne = 0; indexOne < 3; indexOne++) {
            for (int indexTwo = 0; indexTwo < 3; indexTwo++) {
                sumArray[indexOne][indexTwo] = matrix1[indexOne][indexTwo].add(matrix2[indexOne][indexTwo]);
                System.out.print(sumArray[indexOne][indexTwo] + " ");
            }
            System.out.println();
        }
    }

    // Method to read a matrix from a text file
    private static BigDecimal[][] readMatrixFromFile(String filename) {
        //creating a 2D array where the elements will be stored
        BigDecimal[][] matrix = new BigDecimal[3][3]; 
        
        //I used a try block to ensure there is no error when using the BufferedReader 
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            //contents of each line from the text file
            String line;

            //the count of current row being processed in the matrix
            int row = 0;

            //reads each line from the text file
            while ((line = br.readLine()) != null && row < 3) {

                //eliminating the whitespaces and splits it as individual elements
                String[] elements = line.trim().split("\\s+");

                //adding the elements to the 2D array
                for (int column = 0; column < elements.length && column < 3; column++) {
                    matrix[row][column] = new BigDecimal(elements[column]);
                }

                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("We cannot process the file properly.");
        }

        return matrix;
    }
}


/* 
 * On the Coding Standards and Conventions, I implemented each naming conventions
 * on my Classes' names, method names, and variable names, 
 * as well as giving them somehow an understandable and self-explanatory name 
 * so that it won't be confusiing while coding.
 * 
 * On the File organization category, my filename matches with my class name
 * I've also followed the one top-level class per file
 * 
 * Next is my Code Structure and Formatting:
 * I've followed all of the standard things when it comes to this category, I adjusted
 * the indentation settings of my IDE to 4 so that the indentations can be 4 spaces per indent
 * I've properly used braces, commas and spaces so that my code can be easily be read.
 * 
 * Commenting and Documentation:
 * On this part, I've used single line comments on methods as well as some
 * important detail or variables on my code so that it won't be confusing
 * when I tried to use this code after a very long time. I ensured that
 * the comments can be precise and concise in explaining what does that 
 * function do or what is the use of a variable in the code.
 * 
 * Error Handling:
 * On the error handling part, I've used the try catch on the
 * readMatrixFromFile method because in order to ensure that 
 * the BufferedReader can read the file properly so it can be
 * processed properly as well. I've ensured that it'll print the
 * Error message with the use of .printStackTrace() as well as also
 * printing an error message to the user when the program cannot 
 * process the file properly.
 * 
 * Code Reusability and Modularity:
 * On my methods and classes, they are all properly grouped and organized
 * as well as they only focus on one task per method. For example:
 * my readMatrixFromFile method only focuses on reading the getting the
 * matrices from the text file so we can use it on the program, and then
 * the main method focuses on doing the logic of processing the result
 * of the matrix addition.
 * 
 * On Performance and Optimization:
 * I've used the right methods that is needed for a fast and good I/O processing
 * which is the BufferedReader, as well as using the BigDecimal methods
 * that is required in the program based on the instruction and requirements
 * in which I used to create a 2D array to store the matrices from the text file
 * as well as used it to process the matrix addition. 
*/
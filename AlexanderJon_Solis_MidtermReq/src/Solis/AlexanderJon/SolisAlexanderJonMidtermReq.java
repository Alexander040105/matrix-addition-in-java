package Solis.AlexanderJon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;


public class SolisAlexanderJonMidtermReq {
    public static void main(String[] args) {
        //The text files
        String matrixFile1 = System.getProperty("user.dir")+ File.separator +"input.txt";
        String matrixFile2 = System.getProperty("user.dir")+ File.separator +"input2.txt";

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
            String line;
            int row = 0;
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
        }

        return matrix;
    }
}

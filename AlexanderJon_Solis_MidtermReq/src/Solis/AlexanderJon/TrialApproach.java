/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solis.AlexanderJon;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author 63947
 */
public class TrialApproach {
    
    public static void main(String[] args){

        //Used BigDecimal package to create 2D arrays 
        //for simulating the appearance of a 3x3 matrix
        BigDecimal[][] matrix1 = {
            { new BigDecimal(1), new BigDecimal(2), new BigDecimal(3) },
            { new BigDecimal(4), new BigDecimal(5), new BigDecimal(6) },
            { new BigDecimal(7), new BigDecimal(8), new BigDecimal(9) }
        };
        
        BigDecimal[][] matrix2 = {
            { new BigDecimal(-2), new BigDecimal(3), new BigDecimal(-4) },
            { new BigDecimal(0), new BigDecimal(5), new BigDecimal(3) },
            { new BigDecimal(2), new BigDecimal(7), new BigDecimal(3) }
        };
        
        //creating a new array where we can store the sum of the matrices
        BigDecimal[][] sumArray = new BigDecimal[3][3];
        
        for (int i = 0; i < matrix1.length; i++) {
            // iterate through the columns
            // I used the length of matrix 1 since the two matrices are square matrix
            for (int j = 0; j < matrix1[i].length; j++) {
                //
                sumArray[i][j] = matrix1[i][j].add(matrix2[i][j]);
            }
        } 
        
        //iterating each row from the sumArray to print out the sum of the matrices
        System.out.println("The result of the addition of 3x3 matrix: ");
        for (BigDecimal[] row : sumArray) {          
            System.out.println(Arrays.toString(row));
        }
    }
}

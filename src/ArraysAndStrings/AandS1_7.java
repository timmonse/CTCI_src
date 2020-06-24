package ArraysAndStrings;

import java.util.Arrays;

public class AandS1_7 {
    public static void main(String[] args) {
        //Create images and print the outputs for testing
        int[][] image1 = new int[3][3];
        for (int i = 0; i < image1.length; i++) {
            for (int j = 0; j < image1[0].length; j++) {
                image1[i][j] = image1.length * i + j;
            }
        }

        int[][] image2 = new int[9][9];
        for (int i = 0; i < image2.length; i++) {
            for (int j = 0; j < image2[0].length; j++) {
                image2[i][j] = image2.length * i + j;
            }
        }

        printArray(image2);
        System.out.println("____________");
        printArray(rotateMatrix(image2));
    }

    /* Given an image represented by an NxN matrix,
    where each pixel in the image is 4 bytes,
    write a method to rotate the image by 90 degrees.
    Can you do this in place? */
    static int[][] rotateMatrix(int[][] image) {
        int[] row;
        int[][] result = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            row = image[i];
            for (int j = 0; j < row.length; j++) {
                result[j][row.length - 1 - i] = row[j];
            }
        }
        return result;
    }

    // Used to print the grid for testing purposes
    static void printArray(int[][] image) {
        for (int[] imageRow : image) {
            System.out.println(Arrays.toString(imageRow));
        }
    }
}

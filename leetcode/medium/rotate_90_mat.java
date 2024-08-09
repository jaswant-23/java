package leetcode.medium;

import java.util.Arrays;

import other.matrix;

public class rotate_90_mat {
    /*
     * Description
     * Editorial
     * Editorial
     * Solutions
     * Solutions
     * Submissions
     * Submissions
     * Code
     * Testcase
     * Test Result
     * Test Result
     * 48. Rotate Image
     * Medium
     * Topics
     * Companies
     * 
     * You are given an n x n 2D matrix representing an image, rotate the image by
     * 90 degrees (clockwise).
     * 
     * You have to rotate the image in-place, which means you have to modify the
     * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
     * rotation.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     * 
     * Example 2:
     * 
     * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     * 
     * 
     * 
     * Constraints:
     * 
     * n == matrix.length == matrix[i].length
     * 1 <= n <= 20
     * -1000 <= matrix[i][j] <= 1000
     * 
     */
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // transpose_mat(arr);
        // rotate_matrix_90(arr);
        rotate(arr);
        print_mat(arr);
        
        // reverse the each row of that matrix
    }
    public static void  rotate_matrix_90(int[] arr[]){
        //1.tranpose them
        transpose_mat(arr);

        // then reverse the matrix of each row
        for (int[] is : arr) {
            int f=0,s=is.length-1;
            while(f<=s){
                int t=is[f];
                is[f]=is[s];
                is[s]=t;
                f++; 
                s--;
            }
        }

    }
    public static void transpose_mat(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j>=i){
                   int t=arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=t;
                }
            }
        }
    }
    public static void print_mat(int[][] arr){
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }


    public static void rotate(int[][] matrix) {
        //transpose the matrix
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
               if(j>=i){
                swap(matrix[i][j],matrix[j][i]);
               }
            }
        }

        // now reverse the
        for(int[] is: matrix){
            int f=0,e=is.length-1;
            while(f<=e){
                swap(is[f],is[e]);
                f++;
                e--;
            }
        }
    }
    public static void swap(int f,int s){
        int t=f;
        f=s;
        s=t;
    }
}

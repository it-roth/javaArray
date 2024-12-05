package Array;

import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
//        Declare a lot int variable
//        int that represents the student score 5
        int score1, score2, score3, score4, score5;
//        int [] scores = new int [5];
        int []ages = {12, 4, 3, 5};
        Scanner input = new Scanner(System.in);
        int n; //Number of student
        System.out.println("Enter the Number of Student: ");
        n = input.nextInt();
//        int score = new int[1];
        int [] scores = new int[n];
//        input score for all the student
//        5 elements -> 0,1,2,...,last element = (length-1)
        for(int i =0;i<n;i++) {
            System.out.println("Enter Score" + (i + 1) + ":");
            scores[i] = input.nextInt();
        }
            System.out.println(Arrays.toString(scores));
            System.out.println("All Event Score");
            for (int num : scores) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println("\nAll odd scores: ");
            for (int num : scores) {
                if (num % 2 == 0) continue;
                System.out.print(num + " ");
            }
            Arrays.sort(scores);
            int min = scores[0];
            int max = scores[scores.length - 1];
            System.out.println("Maximum Score: " + max);
            System.out.println("Minimum Score: " + min);

            //find sum
            int sum =0;
            for(int num: scores){
                sum+=num;
            }
            System.out.println("Total Scores:"+sum);
            //find avg
            float avg=sum/(float)n;
            System.out.println("Average Score: "+avg);
    }
}


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami
 */
public class GradeDistribution {
    ArrayList<Integer> grades;
    
    public GradeDistribution() {
        grades = new ArrayList<Integer>();
    }

    public void addScores(Scanner scanner) {
        boolean yes = true;
        int grade;
        while (yes) {
            int points = Integer.parseInt(scanner.nextLine());
            if (points == -1) {
                yes = false;
            }
            if (points >= 0 && points <= 60) {
                grade = checkGrade(points);
                grades.add(grade);
            }

        }

    }

    public void printDistribtion() {
        System.out.println("Grade distribution:");
        for(int i = 5; i > -1; i--){
            System.out.print(i + ": ");
            for (int grade : grades){
                if (grade == i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + acceptancePersentage());
    }
    
    public double acceptancePersentage(){
        int accepted = 0;
        for (int grade : grades){
            if (grade != 0){
                accepted++;
            }
        }
        return (double)100*accepted/grades.size();
    }

    public int checkGrade(int points) {
        
        if (points <= 29) {
            return 0;
        } else if (points <= 34) {
            return 1;
        } else if (points <= 39) {
            return 2;
        } else if (points <= 44) {
            return 3;
        } else if (points <= 49) {
            return  4;
        } else {
            return 5;
        }
    }

}

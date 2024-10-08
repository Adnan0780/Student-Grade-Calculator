// student grade calculator

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
     Scanner grade=new Scanner(System.in);
     System.out.println("  *STUDENT GRADE CALCULATOR*  ");
     System.out.print(" Please Enter Number Of Subjects ");
      int NS=grade.nextInt();
      int TOTAL=0;
      for(int i=0;i<NS; i++){
        System.out.print("  ENTER MARKS OBTAINED IN   " +1+ ":");
        int marks=grade.nextInt();
        TOTAL+=marks;
      }
      double averagep=(double)TOTAL/NS;
      char GRADE;
      if (averagep>=90) {
        GRADE='o';
      }
      else if ( averagep>=80) {
        GRADE='A';
      }
      else if (averagep>=70) {
        GRADE='B';
      }
      else if (averagep>=60) {
        GRADE='C';
      }
      else if (averagep>=50) {
        GRADE='D';
        
      }
      else if (averagep>=40) {
        GRADE='E';
      }
      else{
        GRADE='F';
      }
      System.out.print("  TOTAL MARKS SCORED IS  " +TOTAL);
      System.out.print("  AVERAGE PERCENTAGE GAINED IS   " +averagep+ "%");
      System.out.print("  GRADE :"  +GRADE);

     
}
    
}
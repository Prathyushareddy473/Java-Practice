package dailytask;

public class StudentMarks {



    public static void main(String[] args) {

       
        int[] marks = {85, 90, 75, 60, 95};
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        
        double average = (double) total / marks.length;

        
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

      
        System.out.println("Student Marks Analyzer");
        System.out.println("----------------------");

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
    }



}

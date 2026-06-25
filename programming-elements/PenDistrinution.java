public class PenDistrinution {
    public static void main(String[] args){
        int pens = 14;
        int noOfStudents = 3;
        int pensPerStudent = pens / noOfStudents;
        int remainingPens = pens % noOfStudents;    
        System.out.println("The Pen Per Students is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
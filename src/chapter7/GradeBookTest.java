package chapter7;

//Fig. 7.15

public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("Java Programming", gradesArray);
        System.out.printf("welcome to the frade book for%n%s%n%n", myGradeBook.getCourseName());

        myGradeBook.processGrades();
    }
}

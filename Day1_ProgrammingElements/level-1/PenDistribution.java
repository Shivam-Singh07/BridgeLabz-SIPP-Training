package Day1_ProgrammingElements;
public class PenDistribution {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int each = (short)(pens / students);
        int remaining = (short)(pens % students);
        System.out.println("The Pen Per Student is " + each + " and the remaining pen not distributed is " + remaining);
    }
}

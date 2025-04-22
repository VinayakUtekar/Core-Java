public class StudentMarksGrade {
    public static void main(String args[])
    {
        double mrks = Double.parseDouble(args[0]);
        if( (mrks < 0) | (mrks > 100) )
            System.out.println("INVALID MARKS");
        else if(mrks>80)
            System.out.println("GRADE OF STUDENT IS = A");
        else if(mrks>60)
            System.out.println("GRADE OF STUDENT IS = B");
        else if(mrks>40)
            System.out.println("GRADE OF STUDENT IS = C");
        else
            System.out.println("GRADE OF STUDENT IS = D");
        System.out.println("MARKS OF STUDENT IS = " + mrks);
    }
}	
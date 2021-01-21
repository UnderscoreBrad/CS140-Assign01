package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    Bradley Estus
    B00780491
    Class PersonStudentTest (Main Class), for Assignment01.
 */
public class PersonStudentTest
{

    /**
     * Main Method, Tests Person and Student.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        var out = new PrintStream(new File("test.txt"));
        var p0 = new Person("Wilson", "Mary Joe", 2005, 3, 12);
        var p1 = new Person("Smith", "Jason", 2003, 6, 9);
        var p2 = new Person("Baker", "Frank", 1999, 1, 10);
        var p3 = new Person("Larson", "Sarah", 2001, 3,28);
        var p4 = new Person("Sebastian", "Kevin", 2000, 7, 22);

        Person p = Utilities.oldest(p0,p1,p2,p3,p4);
        out.println(p.getLastNames());
        out.println("EXPECTED: BAKER");
        out.println(p.ageInYears());
        out.println("EXPECTED: 21");
        out.println(p.equals(p2));
        out.println("EXPECTED: true");

        var s0 = new Student(p0, "BioChemistry", 3.50);
        var s1 = new Student(p1, "Computer Engineering", 3.20);
        var s2 = new Student(p2, "Computer Science", 3.60);
        var s3 = new Student(p3, "Political Science", 4.00);
        var s4 = new Student(p4, "Philosophy", 2.7);

        Student s = Utilities.topGpa(s0,s1,s2,s3,s4);
        out.println(s.getAsPerson().getLastNames());
        out.println("EXPECTED: Larson");
        out.println(s.getGpa());
        out.println("EXPECTED: 4.0");
        out.println(s.equals(s3));
        out.println("EXPECTED: true");

        out.close(); // THIS MUST STAY AT THE END AFTER WE ADD MORE CODE LATER
    }
}

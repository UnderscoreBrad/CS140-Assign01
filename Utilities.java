package assignment01;
/*
    Bradley Estus
    B00780491
    Class Utilities, for Assignment01.
 */
public class Utilities
{

    /**
     * Compares 5 Person objects to find the oldest
     * Uses Person.compareAgesTo(Person other)
     * @param p0 Person 0
     * @param p1 Person 1
     * @param p2 Person 2
     * @param p3 Person 3
     * @param p4 Person 4
     * @return Oldest Person
     */
    public static Person oldest(Person p0, Person p1, Person p2, Person p3, Person p4)
    {

        Person oldest = p0;
        if(oldest.compareAgesTo(p1)>0)
        {
            oldest = p1;
        }
        if(oldest.compareAgesTo(p2)>0)
        {
            oldest = p2;
        }
        if(oldest.compareAgesTo(p3)>0)
        {
            oldest = p3;
        }
        if(oldest.compareAgesTo(p4)>0)
        {
            oldest = p4;
        }
        return oldest;
    }

    /**
     * Compares 5 Student objects to find the best GPA
     * Uses Student.compareByGpaTo(Student other)
     * @param s0 Student 0
     * @param s1 Student 1
     * @param s2 Student 2
     * @param s3 Student 3
     * @param s4 Student 4
     * @return Student object with highest GPA
     */
    public static Student topGpa(Student s0, Student s1, Student s2, Student s3, Student s4)
    {

        Student highest = s0;
        if(highest.compareByGpaTo(s1)<0)
        {
            highest = s1;
        }
        if(highest.compareByGpaTo(s2)<0)
        {
            highest = s2;
        }
        if(highest.compareByGpaTo(s3)<0)
        {
            highest = s3;
        }
        if(highest.compareByGpaTo(s4)<0)
        {
            highest = s4;
        }
        return highest;
    }
}

package assignment01;

/*
    Bradley Estus
    B00780491
    Class Student, edited from Lab01.
 */
public class Student {
    private Person person;
    private String major;
    private double gpa;

    /**
     * Student Constructor, 3 args
     * @param aPerson Person, including all fields
     * @param aMajor Major of the Student
     * @param aGpa GPA of the Student
     */
    public Student(Person aPerson, String aMajor, double aGpa)
    {
        person = aPerson;
        major = aMajor;
        gpa = aGpa;

    }

    /**
     * Sets the Student GPA
     * @param aGpa GPA, 0.0 to 4.0
     */
    public void setGpa(double aGpa)
    {
        gpa = aGpa;
    }
    /**
     * Fetches the Person data for the Student
     * @return Person object
     */
    public Person getAsPerson()
    {
        return person;
    }

    /**
     * Fetches the major for the Student
     * @return major
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * Fetches the Student GPA
     * @return GPA
     */
    public double getGpa()
    {
        return gpa;
    }

    /**
     * Compares the GPAs of two students
     * @param other other Student
     * @return negative if other.gpa is higher, positive if gpa is higher
     */
    public int compareByGpaTo(Student other)
    {
        return Double.compare(gpa,other.getGpa());
    }
}
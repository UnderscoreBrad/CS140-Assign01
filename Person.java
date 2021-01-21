package assignment01;
import java.time.*;
import java.time.Period;

/*
    Bradley Estus
    B00780491
    Class Person, edited from Lab01.
 */
public class Person
{
    private String lastNames;
    private String firstNames;
    private LocalDate dateOfBirth;

    public Person()
    {

    }
    /**
     * Person Constructor, 5 args
     * @param last Last name
     * @param first First name
     * @param year Birth year
     * @param month Birth month
     * @param day Birth day
     */
    public Person(String last, String first, int year, int month, int day)
    {
        lastNames = last;
        firstNames = first;
        dateOfBirth = LocalDate.of(year, month, day);
    }

    /**
     * Fetches last name
     * @return last name of Person
     */
    public String getLastNames()
    {
        return lastNames;
    }

    /**
     * Fetches first name
     * @return first name of Person
     */
    public String getFirstNames()
    {
        return firstNames;
    }

    /**
     * Fetches date of birth in LocalDate format
     * @return date of birth
     */
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Calculates age of the Person, to the year
     * @return Age, to the year as String
     */
    public int ageInYears()
    {
        var today = LocalDate.now();
        var p = Period.between(dateOfBirth, today);
        return p.getYears();
    }

    /**
     * Calculates age of the Person, to the day
     * @return Age, to the day as String
     */
    public String exactAge()
    {
        var today = LocalDate.now();
        var p = Period.between(dateOfBirth, today);
        return (p.getYears() +" years, "+p.getMonths()+" months, "+p.getDays()+" days");
    }

    /**
     * Calls LocalDate compareTo against two Person birth dates.
     * @param other other person
     * @return difference in birth dates
     */
    public int compareAgesTo(Person other)
    {
        return dateOfBirth.compareTo(other.getDateOfBirth());
    }
}
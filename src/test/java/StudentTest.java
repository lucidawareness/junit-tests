import main.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student mike = new Student(1L, "mike");
        Student john = null;
        assertNull(john);
        assertNotNull(mike);
    }

    @Test
    public void testStudentVariables() {
        Student mike = new Student(1L, "mike");
        assertSame(1L, mike.getId());
        assertSame("mike", mike.getName());
        assertSame(0, mike.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        Student mike = new Student(1L, "mike");
        mike.addGrade(100);
        assertSame(100, mike.getGrades().get(0));
        mike.addGrade(80);
        assertSame(80, mike.getGrades().get(1));
    }

    @Test
    public void testAverageGrade() {
        Student mike = new Student(1L, "mike");
        mike.addGrade(100);
        mike.addGrade(80);
        assertEquals(90, mike.getGradeAvg(), 0);
    }

}

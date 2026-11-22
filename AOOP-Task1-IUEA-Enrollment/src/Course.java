public class Course {

    // I added instance variables here which is unique to each Course object
    private String courseName;
    private int registeredStudents;

    // I added a static variable which is shared across all Course objects at IUEA
    private static int totalStudentsAllCourses = 0;

    // I added a constructor which sets each course's own fields and adds to the shared university total
    public Course(String courseName, int registeredStudents) {
        this.courseName = courseName;
        this.registeredStudents = registeredStudents;
        totalStudentsAllCourses += registeredStudents;
    }
    // I added a method with local variables with temporary calculations only alive inside this method
    public void calculatePerformanceStats(int attendedStudents, int passedStudents) {
        double attendanceRate = ((double) attendedStudents / this.registeredStudents) * 100;
        double passPercentage = ((double) passedStudents / this.registeredStudents) * 100;

        System.out.printf("  [Stats] Attendance Rate: %.2f%% | Pass Rate: %.2f%%%n", attendanceRate, passPercentage);
    }
    // I added instance getters which read values belonging to a specific Course object
    public String getCourseName() {
        return courseName;
    }

    public int getRegisteredStudents() {
        return registeredStudents;
    }

    // I added a static getter that reads the shared total across all Course objects
    public static int getTotalStudentsAllCourses() {
        return totalStudentsAllCourses;
    }
}
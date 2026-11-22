public class Main {
    public static void main(String[] args) {
        System.out.println("   IUEA COURSE ENROLMENT & TRACKING SYSTEM");

        // I created three Course objects with their own names and student counts
        Course course1 = new Course("BSc Software Engineering", 120);
        Course course2 = new Course("BSc Computer Science", 95);
        Course course3 = new Course("BSc Information Technology", 80);

        // I added this part to display individual course details and calculate local stats
        displayCourseDetails(course1, 110, 105);
        displayCourseDetails(course2, 85, 78);
        displayCourseDetails(course3, 75, 70);
    }

    private static void displayCourseDetails(Course course, int attended, int passed) {
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Registered Students: " + course.getRegisteredStudents());

        // I added this block of code which runs the method with local variables (attendanceRate and passPercentage)
        course.calculatePerformanceStats(attended, passed);
        System.out.println();
    }
}
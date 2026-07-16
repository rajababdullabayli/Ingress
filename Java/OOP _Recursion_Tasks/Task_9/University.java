package Task9;

public class University {
    public class Student {
        private int studentId;
        private String studentName;
        private String studentLastName;
        private int studentAge;

        public int getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getStudentLastName() {
            return studentLastName;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setStudentLastName(String studentLastName) {
            this.studentLastName = studentLastName;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public void printStudentInfo() {
            System.out.println("This Student's Id: " + studentId);
            System.out.println("This Student's Name: " + studentName);
            System.out.println("This Student's Last Name: " + studentLastName);
            System.out.println("This Student's Age: " + studentAge);
        }

        public Student() {
        }
    }

    public class Teacher {
        private int teacherId;
        private String teacherName;
        private String teacherLastName;
        private int teacherAge;

        public int getTeacherId() {
            return teacherId;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public String getTeacherLastname() {
            return teacherLastName;
        }

        public String getTeacherLastName() {
            return teacherLastName;
        }

        public int getTeacherAge() {
            return teacherAge;
        }

        public void setTeacherId(int teacherId) {
            this.teacherId = teacherId;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

        public void setTeacherLastname(String teacherLastname) {
            this.teacherLastName = teacherLastname;
        }

        public void setTeacherAge(int teacherAge) {
            this.teacherAge = teacherAge;
        }

        public void printTeacherInfo() {
            System.out.println("This Teacher's Id: " + teacherId);
            System.out.println("This Teacher's Name: " + teacherName);
            System.out.println("This Teacher's Last Name: " + teacherLastName);
            System.out.println("This Teacher's Age: " + teacherAge);
        }

        public Teacher() {
        }
    }

    public class Department {
        private String departmentName;
        private int departmentId;

        public String getDepartmentName() {
            return departmentName;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public void printDepartmentInfo() {
            System.out.println("This Department's Name:" + departmentName);
        }
    }
}

package class1;

public class ClassStart4 {

    static void main() {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 22;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = new Student[] {student1, student2};

        for (int i =0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이 : " + s.age + "살 성적 : " + s.grade + "점");
        }

        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이 : " + s.age + "살 성적 : " + s.grade + "점");
        }

    }
}

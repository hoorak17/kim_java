package prac;

public class Planner {
    public static void main(String[] args) {
        StudyRecord javaRecord = new StudyRecord();
        javaRecord.subject = "Java";
        javaRecord.minutes = 29;

        StudyRecord osRecord = new StudyRecord();
        osRecord.subject = "운영체제";
        osRecord.minutes = 40;

        StudyRecord copied = new StudyRecord();
        copied.subject = javaRecord.subject;
        copied.minutes = javaRecord.minutes;

        copied.minutes = 100;

        System.out.println(javaRecord.subject +" "+ javaRecord.minutes + "분");
        System.out.println(osRecord.subject +" " + osRecord.minutes + "분");
        System.out.println("총 공부시간 : " + (javaRecord.minutes + osRecord.minutes) + "분");


        javaRecord.minutes = 50;
        System.out.println(osRecord.minutes);

        StudyRecord third = javaRecord;
        third.minutes = 70;
        System.out.println(javaRecord.minutes);

        System.out.println(javaRecord.minutes);
        System.out.println(copied.minutes);

    }
}

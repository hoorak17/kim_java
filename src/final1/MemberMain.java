package final1;

public class MemberMain {

    static void main() {
        Member member = new Member("myId", "Kim");
        member.print();
        member.changeData("seo");
        member.print();
    }
}

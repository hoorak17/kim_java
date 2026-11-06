package construct;

public class ContructMain1 {
    static void main() {
        MemberConstruct memger1 = new MemberConstruct("user1", 15 , 90);
        MemberConstruct memger2 = new MemberConstruct("user2", 16 , 80);

        MemberConstruct[] members = { memger1, memger2 };

        for (MemberConstruct member : members) {
            System.out.println(" 이름 : " + member.name + "나이 " + member.age + "성적 " + member.grade);
        }
    }
}

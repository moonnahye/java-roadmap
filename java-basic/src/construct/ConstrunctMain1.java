package construct;

public class ConstrunctMain1 {
    public static void main(String[] args) {
        MemberConstuct member1 = new MemberConstuct("user1", 15, 90);
        MemberConstuct member2 = new MemberConstuct("user2", 16, 80);

        MemberConstuct[] members = {member1, member2};

        for (MemberConstuct member : members) {
            System.out.println("이름: " + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }

    }
}

package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId","kim");
        member.changeData("seo");
        member.print();
    }
}
package construct;

public class MemberConstuct {
    String name;
    int age;
    int grade;

    MemberConstuct(String name, int age){
        this(name,age,50);
    }

    MemberConstuct(String name, int age, int grade) {
        System.out.println("셍상자 호출 name=" + name + ", age=" + age + ", grade" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

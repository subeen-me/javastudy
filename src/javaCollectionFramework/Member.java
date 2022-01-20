package javaCollectionFramework;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) { // name과 age 값이 같으면 true를 리턴, 동일한 객체로 판단하고 중복 저장을 하지 않는다
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age==age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() { // name과 age 값이 같으면 동일한 hashCode를 리턴
        return name.hashCode() + age;
    }
}

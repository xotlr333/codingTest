package baekjoon;

import java.util.*;

/**
 * 백준
 * 나이순 정렬
 * https://www.acmicpc.net/problem/10814
 */

public class Solution15 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<Member> members = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int age = Integer.parseInt(sc.next());
            String name = sc.next();

            members.add(new Member(i, age, name));
        }

        Collections.sort(members);

        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }

    }

}

class Member implements Comparable<Member> {
    int no;
    int age;
    String  name;

    public Member(int no, int age, String name) {
        this.no = no;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Member o) {
        if(o.getAge() == this.age) {
            return this.no - o.no;
        } else {
            return this.age - o.age;
        }

    }
}

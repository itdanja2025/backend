package day09;
public class Practice12 {
    public static void main(String[] args) {
        // 문제1]
        Student student = new Student();
        student.name = "유재석"; // 상속받은 멤버변수 name 에 값 대입
        student.studentId = 30; // 현재 타입의 멤버변수 studentId 값 대입
        // 문제2
        Cat cat = new Cat();
        cat.makeSound();
        // 문제3
        Computer computer = new Computer();
        // 문제4 : Triangle 클래스는 Figure 로 부터 상속받았기 때문에
        Triangle triangle = new Triangle();
        Figure figure = triangle;
    }
} // CLASS END

class Person{ // 클래스는 첫글자 대문자로한다.
    // 클래스의 멤버 : 1]멤버변수 2]생성자 3]메소드
    String name;
}
class Student extends Person{// extends:상속키워드( 다른클래스의 멤버들을 확장/연장 )
    int studentId;
}
class Animal{
    void makeSound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Cat extends Animal{
    // 오버라이딩 : 물려받은 메소드 재정의 , 자동완성
    @Override void makeSound() {
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}
class Machine{
    Machine(){System.out.println("Machine부모 클래스 생성자 실행");}
}
class Computer extends Machine{
    Computer(){System.out.println("Computer자식 클래스 생성자 실행");}
}
class Figure{  }
class Triangle extends  Figure{ }










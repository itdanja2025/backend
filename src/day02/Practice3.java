package day02; // 현재 클래스가 위치한 폴더(패키지)명

import java.util.Scanner;

public class Practice3 { // class start
    // m + 엔터 , 자바실행은 main함수(스레드) 로 부터 (실행)흐름 시작된다.
    public static void main(String[] args) { // main start

        Scanner scan = new Scanner( System.in ); /* main 함수 안에서 입력객체는 1개 존재 해도 된다. */
        // [1.병모] : 프로세스  입력 -> 처리 -> 출력
        System.out.print("국어 점수:");     int kor = scan.nextInt();   // [1입력]
        System.out.print("영어 점수:");     int eng = scan.nextInt();   // int 타입으로 3개의 정수를 입력받는다.
        System.out.print("수학 점수:");     int math = scan.nextInt();
        int sum = kor + eng + math; // [2처리] 입력받은 값들을 모두 더한다.
        System.out.println("총점:" + sum);    System.out.println("평균:" + sum/3.0); // [3출력]
        // [2.태형] : 소수점 결과를 저장하기 위해서는 double/float 타입의 변수 사용한다.
        System.out.println("반지름을 입력하세요 : ");    double d1 = scan.nextDouble(); // [1입력] 실수 입력받는다.
        double area = d1 * d1 * 3.14; // [2처리] 입력받은 값으로 계산 , 주의할점은 결과를 double변수로 저장한다.
        System.out.println("원의 넓이 : "+area); //[3출력]
        // [3.도경] : 변수명에 띄어쓰기 안됨, 백분율 기호는 "%" 문자이고 , 나머지 연산 기호는 % 이다.
        System.out.print("첫번째 실수: ");       double 첫번째실수 = scan.nextDouble();   // [1입력]
        System.out.print("두번째 실수: ");       double 두번째실수 = scan.nextDouble();   // 두 개의 실수(double)를 입력받아,
        double result3 = ( 첫번째실수 / 두번째실수 ) * 100 ; // [2처리] 첫 번째 실수가 두 번째 실수의 몇 퍼센트인지
        System.out.println("result3 = " + result3 +"%"); // [3출력] soutv + 자동완성 : 가장가까운 변수 출력
        // [4.연지] 짝수/홀수 공식 : 어떠한 값에 나누기 2 했을때 나머지가 0 이면 짝수 아니면 홀수 , 값 % 2 == 0
        System.out.print("정수 : "); int i1=scan.nextInt();   // [1입력]
        System.out.println( i1 % 2 == 1 ); // [2처리] 조건{true or false } ? 참 : 거짓 , [3출력]
        // [5.재현] 배수 공식 : 값 % 수 == 0 , 어떠한 값을 그 수를 나눴을때 나머지가 0 이면 값은 그수 의 배수
        System.out.println("정수를 입력하세요 : "); int  i2 = scan.nextInt();   // [1입력]
        System.out.println("결과 : "+ ( i2 % 7 ==0 ) ); // [2처리][3출력]
        // [6.성은] JS : d3 == "admin"       VS      JAVA : d3.equals("admin")    문자열 비교 차이
        System.out.print("아이디 : ");     String d3 = scan.next();  // [1.입력]
        System.out.print("비번 : ");      String d4 = scan.next();   // 문자열입력 이라서 scan.next(); / String 타입 선택
        boolean result6 = d3.equals("admin") && d4.equals("1234"); // [2.처리] : 모두일치 and 이면서 그리고
        System.out.println("result6 = " + result6); // [3.출력]
        // [7.소영]  4/5문제 참고
        System.out.println("정수를 입력하세요 : "); int 정수1 = scan.nextInt();   //[1입력]
        boolean result7 = 정수1 % 2 == 1 && 정수1 % 7 == 0; // [2처리] (홀수찾기)값 % 2 == 1 && (배수찾기)값 % 7 == 0
        System.out.println("result7 = " + result7); // [3출력]
        // [8.태현] [삼항연산자없이]출력값이 true/false 하시오.   [삼항연산자필요] 출력값을 합격/불합격 하시오.
        System.out.print("1차 점수: ");        int a8 = scan.nextInt();    // [1입력] 1차점수 입력 , nextInt() / int
        System.out.print("2차 점수: ");        int b8 = scan.nextInt();    // 2차점수 입력
        int result8 = a8 + b8; // [2처리] 입력받은 두 변수값을 더한다.
        System.out.println( "결과: " + ( result8>=150 ?  "합격" : "불합격" ) ); // [3출력] 조건 ? 참 : 거짓
        // [9.준현] 입력받은 값이 "유재석" 과 같으면 true{ 입력받은값+"(방장)" } 아니면 false{ 입력받은값 }
        System.out.print("이름을 입력하세요:");  String name1=scan.next();   // [1입력] 문자열입력:.next(); , 문자열저장 : String
        String result5= name1.equals("유재석") ? name1+"(방장)" : name1; // [2처리]
        System.out.println(result5);

    } // main end
} // class end


/*[실습] * 제출용 */
/*[문제 1] Scanner를 이용해 국어, 영어, 수학 점수를 각각 정수(int)로 입력받아, 총점과 평균을 계산하여 출력하시오.
입력 예시:
국어 점수: 85
영어 점수: 92
수학 점수: 78
출력 예시:
총점: 255
평균: 85.0 */

/*[문제 2] Scanner를 이용해 원의 반지름(double)을 입력받아, 원의 넓이를 계산하여 출력하시오.
요구 조건: 원주율은 3.14로 계산합니다. (공식: 반지름 * 반지름 * 3.14)
입력 예시:
반지름을 입력하세요: 10.5
출력 예시:
원의 넓이: 346.185 */

/*[문제 3] Scanner를 이용해 두 개의 실수(double)를 입력받아, 첫 번째 실수가 두 번째 실수의 몇 퍼센트인지 계산하여 출력하시오.
공식: (첫 번째 실수 / 두 번째 실수) * 100
입력 예시:
첫 번째 실수: 50
두 번째 실수: 200
출력 예시:
비율: 25.0% */

/*[문제 4] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면 true, 짝수이면 false를 출력하시오.
입력 예시:
정수를 입력하세요: 17
출력 예시:
결과: true */

/*[문제 5] Scanner를 이용해 정수 하나를 입력받아, 그 수가 7의 배수이면 true, 아니면 false를 출력하시오.
입력 예시:
정수를 입력하세요: 28
출력 예시:
결과: true */

/*[문제 6] Scanner를 이용해 아이디와 비밀번호를 String으로 입력받아, 아이디가 "admin"이고 비밀번호가 "1234"와 모두 일치하면 true, 아니면 false를 출력하시오.
요구 조건:문자열 비교는 .equals() 메소드를 사용해야 합니다.
입력 예시:
아이디: admin
비밀번호: 1234
출력 예시:
결과: true */

/*[문제 7] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면서 7의 배수이면 true, 아니면 false를 출력하시오.
입력 예시:
정수를 입력하세요: 21
출력 예시:
결과: true */

/*[문제 8] Scanner를 이용해 1차 점수와 2차 점수를 각각 int로 입력받아, 두 점수의 총점이 150점 이상이면 "합격", 아니면 "불합격"을 출력하시오.
입력 예시:
1차 점수: 80
2차 점수: 75
출력 예시:
결과: 합격 */

/*[문제 9]  Scanner를 이용해 이름을 String으로 입력받아, 만약 이름이 "유재석"과 일치하면 이름 뒤에 "(방장)"을 붙여서 출력하고, 아니면 입력받은 이름만 출력하시오.
입력 예시 1:
이름을 입력하세요: 유재석
출력 예시 1:
유재석(방장)
입력 예시 2:
이름을 입력하세요: 강호동
출력 예시 2:
강호동 */

/*[문제 10] Scanner를 이용해 삼각형의 밑변과 높이를 각각 double로 입력받아, 삼각형의 넓이를 계산하여 출력하시오.
요구 조건: 공식: 밑변 * 높이 / 2.0
입력 예시:
밑변: 10.0
높이: 5.5
출력 예시:
삼각형의 넓이: 27.5

[문제 11] Scanner를 이용해 섭씨 온도를 double로 입력받아, 화씨 온도로 변환하여 출력하시오.
요구 조건:
공식: (섭씨 * 9.0 / 5.0) + 32
입력 예시:
섭씨 온도: 30.0
출력 예시:
화씨 온도: 86.0 */

/*[문제 12] Scanner를 이용해 태어난 년도(int)를 입력받아, 2025년 기준 현재 나이를 계산하여 출력하시오.
요구 조건:
공식: 2025 - 태어난 년도
입력 예시:
태어난 년도: 1998
출력 예시:
2025년 기준 나이: 27세 */

/*[문제 13] Scanner를 이용해 키(cm)와 몸무게(kg)를 각각 double로 입력받아, BMI 지수를 계산하여 출력하시오.
요구 조건:
BMI 공식: 몸무게(kg) / (키(m) * 키(m))
키는 cm로 입력받지만, 공식에는 m 단위가 사용되므로 키(cm) / 100.0으로 단위를 변환해야 합니다.
입력 예시:
키(cm): 175.5
몸무게(kg): 68.8
출력 예시:
BMI 지수: 22.34... */

/*[문제 14] Scanner를 이용해 아이디와 이메일을 String으로 입력받습니다. 아이디가 "admin"이거나 또는 이메일이 "admin@test.com"이면 "관리자", 그렇지 않으면 "일반 사용자"를 출력하시오.
입력 예시:
아이디: user1
이메일: admin@test.com
출력 예시:
결과: 관리자 */

/*[문제 15] Scanner를 이용해 100점 만점의 점수(int)를 입력받아, 점수에 따라 아래와 같이 등급을 부여하고 출력하시오.
90점 이상: 'A'
80점 이상 90점 미만: 'B'
70점 미만: 'C'
입력 예시:
점수를 입력하세요: 88
출력 예시:
등급:B */

/*[문제 16] Scanner를 이용해 나이(int)를 입력받아, 20대(20세 이상 29세 이하)에 해당하는 경우 "이벤트 대상입니다."를, 그렇지 않으면 "이벤트 대상이 아닙니다."를 출력하시오.
입력 예시:
나이를 입력하세요: 25
출력 예시:
이벤트 대상입니다. */
package ex20221121

fun main() {
    
    // when 문 : java 의 switch 문과 동일
    //when(변수){
    // 값1 => 실행코드1
    // 값2 => 실행코드2
    // ..........
    //else => 실행코드n
    //}

    val a = 2

    when(a){
        // 여러가지 값의 실행코드가 같을 경우
        // a 가 1 또는 2일 경우 -> 실행코드를 실행
        1 -> println("a는 1입니다.")
        2 -> println("a는 2입니다.")
        else -> println(" a는 1,2가 아닙니다.")
    }
    
    when(a%2) {
        0 -> println("a는 짝수입니다")
        1 -> println("a는 홀수입니다")
        else -> println("")
    }

        // in .. (범위를 설정하는 키워드)
        when(a){
            in 0..10 -> println("0~10")
            in 11..20 -> println("11~20")
            else -> println(a)
        }
    
    // 객체/변수의 데이터 타입을 확일할 때 가장 많이 사용
    //Any, is, when
    // is : 데이터 타입 확인 시 사용하는 키워드
    // Any : 최상위 클래스 ( Java Object 와 비슷 )
    // when : 조건식의 일종
    
    // 반복문
    // **함수
    // + 람다식
    
}
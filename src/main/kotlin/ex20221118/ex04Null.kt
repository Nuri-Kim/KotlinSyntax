package ex20221118

fun main() {

    // null 값을 허용하는 변수 name1을 선언(String?)
    var name1 : String? = null
    // null 값을 허용하지 않는 변수 name2를 선언(String)
    var name2 : String = "김누리"

    // name1, name2의 문자열 길이(.length)를 출력

    println(name1?.length)
    // ?(null 값을 허용)가 붙은 변수들은 사용하려면 이후에도
    // 계속 관리를 해야한다.(?(Safe Call)를 붙여줘야 함)
    println(name2.length)

    // name1에 오류 발생
    // 원인 : null 은 길이가 null 이므로 NPE 발생

    // 오류 해결 방법 : String? 형에서는 세이프콜(?.) 사용
    
    // non-null 단정기호(!!.)을 사용해서 출력할 수 있다.
    // -> null 값이 아니니 그냥 실행시키라는 명령문
    // 거의 사용하지 않음(반드시 null 값이 아니라고 판단되는 변수에만 사용)
    // !!. 를 사용할 경우 이유/경위를 주석으로 기록해야 한다.

    // 조건문을 활용해서 null 을 허용한 변수 검사
    // 엘비스 연산자 (Elvis) ?:

}
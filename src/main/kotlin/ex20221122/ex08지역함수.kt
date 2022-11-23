package ex20221122

fun main() {

    // ex07 내에서 선언한 함수 사용하기
    // add1 -> 지역함수로 선언되어 있어 다른 class 내 호출 불가

    // add2 -> 최상위 레벨 함수로 하나의 프로젝트 내 다른  class 호출 가능

    println(add2(3,4)) // static에 올라가 있는 상태 ( 공용함수 )

}
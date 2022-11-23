package ex20221122

fun main() {
    // 지역함수
    // 호출 전에 먼저 함수 선언부가 있어야 한다

    // 최상위 레벨 함수 ( Top-Level-Function ) -> 메인 바깥 선언
    // 메인 함수 내 어디서든 호출 가능

    println(add2(3,4))


    fun add1 (a:Int, b:Int):Int {
        return a+b
    }

    println(add1(3,4))
}
    // main 바깥에서 선언 ( 최상위 레벨 함수 )

    fun add2 (a:Int, b:Int):Int {
        return a+b
    }
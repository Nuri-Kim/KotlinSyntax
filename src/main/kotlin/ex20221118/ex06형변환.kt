package ex20221118

fun main() {
    
    // Kotlin 에서는 자료형이 서로 다른 변수를 비교, 연산할 수 없다.
    // Kotlin 에서는 자료형이 서로 다른 변수를 형변환 작업을 해야 한다.
    
    // 형변환 (Cast)
    // 1. 자료형을 확인하는 방법
    // 1-1) println(변수명::class.java.simpleName)
    // 1-2) is : 자료형을 체크하는 연산자 = instance of 와 같은 역할
    
    // 2. 자료형 변환하는 방법
    // 2-1) to : 기본타입 형변환 ex) toString, toFloat ...
    
    val num = 256
    println(num::class.java.simpleName)

    val str =num.toString()
    println(str::class.java.simpleName)
}

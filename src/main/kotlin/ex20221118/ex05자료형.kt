package ex20221118

fun main() {
    
    // Kotlin 의 기본 자료형
    // 참조 자료형으로 선언할 수 있다. (기본 자료형은 눈에 보이지 않음)
    
    // 저장할 때(실행) 기본 자료형인지 아닌지 추론해서 저장할 때 변환
    //  : 참조 자료형만 사용 가능하지만 컴파일 과정에서 코틀린 컴파일러가
    // 참조 자료형을 기본 자료형으로 대체하면서 최적화를 진행한다.(추론)
    
    // Java 에서는 기본 자료형과 참조 자료형이 구별하여 사용된다.
    // int, double, char, float -> 기본 자료형
    // Integer, Double, Char -> 참조 자료형
    
    // * 개념 ( 면접 기출 질문 )
    // 정적 메모리 ( 기본 자료형 ) : static
    // byte(1), short(2), int(4), double, char...
    //저장하기 전에 필요한 메모리 공간 크기를 지정한 뒤 할당
    
    // 동적 메모리 ( 참조 자료형 ) : heap
    // 실행 중에 필요한 만큼 메모리를 할당하는 기법

    // Kotlin 자료형 종류 논리형, 정수형, 실수형, 문자형
    // 1. 논리 자료형 ( Boolean )
    // true / false
    var b1 : Boolean = true
    var b2 : Boolean = false

    // 2. 정수 자료형 (Byte, Short, Int, Long)
    var num1 : Int = 129
    var num4 : Short = 128
    
    // 3. 실수 자료형 (Float, Double)
    var num2 : Double = 3.14
    var num3 : Float = 3.14f
    // 숫자에 빨간 줄이 뜨는 이유 
    // -> 기본 실수는 Double 로 생성되나 Float 는 더 작은 값을 담기 때문에
    // 손실이 발생할 수 있기 때문에
    
    // 4. 문자 자료형 (Char, String)
    var firstName : Char = '김' // Char -> ''
    var lastName : String = "누리" // Sring -> ""
    
    
    
    
    
}
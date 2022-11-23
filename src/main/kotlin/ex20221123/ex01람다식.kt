package ex20221123

fun main() {

    // 람다 대수
    // 수학 -> 이름이 없는 함수 두 개 이상의 수를 1개의 결과값으로 단순화

    // 프로그래밍 : 다른 함수의 인자로 넘기는 함수 ( 매개변수 )
    //             함수의 결과값으로 반환하는 함수 ( 리턴값 )
    //             변수에 저장하는 함수를 의미

    // 매개변수 -> 리턴값
    {x:Int, y:Int -> x+y}

    // 더하기 기능이 필요할 때마다 사용하려면 어딘가에 저장 : 변수
    // 1. 람다식의 매개변수에 자료형이 지정되어 있다면
    // 변수에서 자료형은 생략 가능 ex) val sum *: (Int,Int) -> Int* = {x:Int, y:Int -> x+y}
    // 2. 변수의 매개변수 자료형이 지정되어 있다면 람다식 자료형 생략 가능
    // val sum : (Int,Int) -> Int = {x:*Int, y:*Int -> x+y}

    // 단, 람다식, 변수 자료형 모두 생략은 불가 ( 추론 불가능 )

    val sum : (Int,Int) -> Int = {x, y-> x+y}
    println(sum(3,4))

    // hello 라는 변수에 아래 함수를 람다식으로 담기
    fun greet():Unit{
        println("Hello Kotlin")
    }

    // 람다식
    val hello : () -> Unit = { println("Hello Kotlin") }


    // 다음은 정사각형의 넓이를 구하는 함수이다 람다식으로 변환할 것
    // ( square2 변수 선언 )
    fun square1(x:Int):Int{
        return x*x
    }

    // 람다식
    val square2 : (Int) -> Int=  {x:Int -> x*x}

    hello()
    println(square2(2))
}
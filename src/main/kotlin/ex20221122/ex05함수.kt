package ex20221122

fun main() {

    println(sum(5,6))

    sumPrint(10,3)



}

// main 바깥에 함수 선언도 가능

    // fun + 함수명(호출명) +( 매개변수 ) : 리턴타입
    // 단, 리턴타입에 자료형이 명시 되어있으면 return 키워드 필요

    // void --> Unit 으로 대체하여 사용
    // -> 기능 자체를 가지고있는 함수

    fun sumPrint (num1:Int,num2:Int){
        println(sum(num1,num2))
    }

    fun sum (num1:Int, num2:Int) : Int {
        return num1+num2
    }

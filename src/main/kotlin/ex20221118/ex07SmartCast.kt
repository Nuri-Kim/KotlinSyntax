package ex20221118

fun main() {

    // 만약에 어떤 값이 정수일 수도 있고 실수일 수도 있다면 어떻게 처리?
    // 스마트 캐스트 : 컴파일러가 자동으로 형변환

    //Number

    var test : Number = 12.34

    println("test의 값은 $test")
    println(test::class.java.simpleName)

    test = 12
    println(test::class.java.simpleName)
    // Number 자체가 참조형이기 때문에 Int 가 아닌 Integer 로 형변환

    // Any : Java 의 Object 와 비슷
}
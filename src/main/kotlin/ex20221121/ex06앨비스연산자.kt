package ex20221121

fun main() {
    // 앨비스 연산자 (?: )
    // NPE 발생을 예방할 수 있도록 null 값을 처리 해주는 연산자

    var str:String? = null

    println(str?.length ?: "null입니다")
    
    var result = str?.length ?: "null 입니다"

    println(result)
}
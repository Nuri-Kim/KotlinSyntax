package ex20221122

fun main() {

    // label -> while 문에 이름(라벨)을 부여해서
    // break 실행 시 특정 while 문 종료 가능

    // continue 도 동일하게 특정 while 문 지정 가능


    outer@while (true){
        println("바깥  while 문 작동중")
        
        while (true){
            println("안쪽 while 문 작동중")
            // 조건을 만족할 경우 바깥 while 문가지 종료
            // 기존 Java -> 2가지 종료 조건 필요로 함

            // break -> 근접한 while 문 한 개만 종료
            break@outer

        }
    }
    
}
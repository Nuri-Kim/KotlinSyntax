package ex20221122

fun main() {

    // while(조건식){
    // 조건식이 true 일 동안, 실행시킬 코드
    // }
    // 단, 조건식은 무조건 결과값으로 true/false 를 돌려줘야 함
    // 비교연산자, 논리연산자, Boolean

    // *팩토리얼



    // 1. 출력문
    print("숫자를 입력하세요 : ")

    // 2. 입력하기
    var number = readLine()?.toInt()

    // 3. 곱하기 결과를 누적시키는 변수 (sum과 같은 역할)
    var factorial = 1

    // 4. 반복되는 코드를 while 문으로 감싸기
        while ( true ){
            if( number != null) {
                factorial *= number
                number--
            }

    // 5. 종료조건
            if(number == 1) break
        }

    println("결과값 : $factorial")




}

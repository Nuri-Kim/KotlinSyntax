package ex20221121


import java.lang.NumberFormatException
import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    
    //kotlin random 사용 시 괄호 생략
    val rd = Random
    val sc = Scanner(System.`in`)
    
    // 1. 랜덤한 두 수를 생성
    var num1 = rd.nextInt(10)+1
    var num2 = rd.nextInt(10)+1
    
    // 2. 랜덤한 두 수를 출력
    // kotiln 에서는 같은 자료형끼리만 연산 가능
    println("$num1 + $num2 = ?")

    // 3. 사용자 정답 입력
    print("Enter the Answer : ")
//    val answer = readLine()?.toInt() ?: -1

    //readLine 을 사용하게 되면 사용자는 아무 문자/숫자 입력 가능한 상태
    // 입력한 값을 toInt() 실행해야 하는데 문자 입력시 오류 발생

    try{
        val answer = readLine()?.toInt()
        val result = if(num1+num2 == answer) "정답입니다." else "오답입니다."
        println("결과 : $result")
    }catch (e:NumberFormatException){
        println("숫자를 입력해주세요! 문자는 입력할 수 없습니다.")
    }
    
    // 4. 입력 값 실제 값 비교
//    val result = if(num1+num2 == answer) "정답입니다." else "오답입니다."
//    println("결과 : $result")

    //Exception 잡는 방법
    // try catch => 예외상황 잡는 문구






}

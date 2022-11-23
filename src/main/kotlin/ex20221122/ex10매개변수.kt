package ex20221122

fun main() {

    // 1. 회원의 이름과 이메일 주소를 저장하는 함수
    // 이메일을 입력하지 않았을 경우 "default" 라는 문자열 저장

    // addList 호출 시 email 이 비어있을 경우
    // 매개변수에 기본 값이 설정되어 있다면 기본 값 자동으로 적용

    println( addList("강예진","smhrd@naver.com"))
    println( addList("조자연"))
    

}
                            // 매개변수에 기본 값 저장 가능
    fun addList (name:String, email:String = "default"):String{
            return "$name / $email"
    // 회원가입 ( firebase 에서 사용할 예정 )
    }
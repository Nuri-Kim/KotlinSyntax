package ex20221122

fun main() {

    // 오버로딩(OverLoading) : 중복정의
    // 한 클래스 내 같은 이름의 메소드를 선언
    // 단, 매개변수의 형태가 달라야 함
    // 생성자, print 문이 대표적인 예

    // setName() 함수 오버로딩 하여 동일 명의 함수 만들기
    // 미국인 (firstName, middleName, lastName)
    // 한국인 (firstName, lastName)

    println(setName("스티븐 ","폴 ","잡스"))
    println(setName("김","누리"))



}
    //미국인 (ex.스티븐 폴 잡스 출력하기)
    fun setName (first:String, middle:String, last:String):String{
        return first+middle+last
    }

    //한국인
    fun setName (first:String, last:String):String{
        return first+last
    }